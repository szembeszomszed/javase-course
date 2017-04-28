package adatbazis;

//SELECT * FROM EMPLOYEES WHERE SALARY > 10000 ORDER BY SALARY DESC

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

interface AdatbázisKapcsolat {
  String URL="jdbc:oracle:thin:@localhost:1521:xe";
  String USER="HR";
  String PASSWORD="hr";
  String DRIVER="oracle.jdbc.driver.OracleDriver";
}

class LekérdezőProgram extends JFrame
    implements AdatbázisKapcsolat, ActionListener {
  private JTextField tfSQL=
    new JTextField("SELECT * FROM EMPLOYEES", 50);
  private JButton btVégrehajt=new JButton("Végrehajt");
  private JButton btTöröl=new JButton("Töröl");
  private JTable tblEredmény=new JTable();

  public LekérdezőProgram() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Oracle adatbázis-lekérdező program");
    setSize(800, 400);
    setLocationRelativeTo(this);
    JPanel pn=new JPanel();
    pn.add(tfSQL);
    pn.add(btVégrehajt);
    pn.add(btTöröl);
    add(pn, BorderLayout.NORTH);
    add(new JScrollPane(tblEredmény), BorderLayout.CENTER);
    btVégrehajt.addActionListener(this);
    btTöröl.addActionListener(this);
    setVisible(true);
  }

  private void lekérdez() {
    try {
      Class.forName(AdatbázisKapcsolat.DRIVER);
      Connection kapcsolat=
        DriverManager.getConnection(URL, USER, PASSWORD);
      Statement stat=kapcsolat.createStatement();
      ResultSet rs=stat.executeQuery(tfSQL.getText());

      ResultSetMetaData metaadat=rs.getMetaData();
      String[] mezőTömb=new String[metaadat.getColumnCount()];
      for(int i=0; i<mezőTömb.length; i++)
        mezőTömb[i]=metaadat.getColumnName(i+1);
      tblEredmény.setModel(new DefaultTableModel());
      DefaultTableModel dtm=(DefaultTableModel)tblEredmény.getModel();
      dtm.setColumnIdentifiers(mezőTömb);
 
      while(rs.next()) {
        Object[] rekord=new Object[mezőTömb.length];
        for(int i=0;i<mezőTömb.length;i++)
          rekord[i]=rs.getObject(i+1);
        dtm.addRow(rekord);
      }

      tblEredmény.setModel(dtm);

      kapcsolat.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  private void töröl() {
    tfSQL.setText("");
    tblEredmény.setModel(new DefaultTableModel());
    tfSQL.requestFocus();
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==btVégrehajt)
      lekérdez();
    else
      töröl();
  }
}

public class Adatbazis2 {
  public static void main(String[] args) {
    new LekérdezőProgram();
  }
}

/*
Dolgozók adatai:
SELECT *
FROM EMPLOYEES

Mi a legrégebben itt dolgozó dolgozó neve?
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE HIRE_DATE=
  (SELECT MIN(HIRE_DATE)
   FROM EMPLOYEES)
Steven King

Mióta dolgozik itt Steven King?
SELECT HIRE_DATE
FROM EMPLOYEES
WHERE FIRST_NAME='Steven' AND LAST_NAME='King'
1987-06-17

Mennyi a maximális fizetés?
SELECT MAX(SALARY)
FROM EMPLOYEES
24000

Mennyi a minimális fizetés?
SELECT MIN(SALARY)
FROM EMPLOYEES
2100

Mennyi a dolgozók átlagos fizetése?
SELECT AVG(SALARY)
FROM EMPLOYEES
6461.682242990654205607476635514018691589

Kiknek marad el a fizetése az átlagtól?
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE SALARY <
  (SELECT AVG(SALARY)
   FROM EMPLOYEES)

Részlegek listája:
SELECT DEPARTMENT_NAME
FROM DEPARTMENTS

Átlagfizetés részlegenként:
SELECT DEPARTMENT_NAME, AVG(SALARY)
FROM DEPARTMENTS, EMPLOYEES
WHERE DEPARTMENTS.DEPARTMENT_ID=EMPLOYEES.DEPARTMENT_ID
GROUP BY DEPARTMENT_NAME
ORDER BY AVG(SALARY)

Kik dolgoznak az IT részlegnél?
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES, DEPARTMENTS
WHERE EMPLOYEES.DEPARTMENT_ID=DEPARTMENTS.DEPARTMENT_ID AND DEPARTMENT_NAME='IT'

Hányan dolgoznak az egyes részlegeknél?
SELECT DEPARTMENT_NAME, COUNT(EMPLOYEE_ID)
FROM DEPARTMENTS, EMPLOYEES
WHERE EMPLOYEES.DEPARTMENT_ID=DEPARTMENTS.DEPARTMENT_ID
GROUP BY DEPARTMENTS.DEPARTMENT_NAME

Melyik kontinensek...
SELECT REGION_NAME
FROM REGIONS

Európai országok:
SELECT COUNTRY_NAME
FROM COUNTRIES, REGIONS
WHERE COUNTRIES.REGION_ID=REGIONS.REGION_ID AND REGION_NAME='Europe'

Kontinensenként hány ország?
SELECT REGION_NAME, COUNT(COUNTRY_ID)
FROM COUNTRIES, REGIONS
WHERE COUNTRIES.REGION_ID=REGIONS.REGION_ID
GROUP BY REGION_NAME








 */
