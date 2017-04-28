/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adatbazis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kaczur
 */
public class Adatbazis {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection kapcsolat=
        DriverManager.getConnection(
          "jdbc:oracle:thin:@localhost:1521:xe", "HR", "hr");
      final String SQL=
        "SELECT FIRST_NAME || ' ' || LAST_NAME AS DOLGOZÓ_NÉV, SALARY AS DOLGOZÓ_FIZETÉS\n" +
        "FROM EMPLOYEES " +
        "ORDER BY DOLGOZÓ_NÉV";
      ResultSet eredmény=kapcsolat.createStatement().executeQuery(SQL);
      while(eredmény.next()) {
        System.out.println(eredmény.getString("DOLGOZÓ_NÉV")+
          "\t\t"+eredmény.getInt("DOLGOZÓ_FIZETÉS"));
      }
      kapcsolat.close();
    }
    catch(SQLException e) {
      //e.printStackTrace();
      System.out.println("Hiba: kapcsolat létrehozás, lekérdezés, "+
        "feldolgozás, lezárás során.");
    }
    catch(ClassNotFoundException e) {
      System.out.println("Hiba: nincs meg a driver.");
    }
    
  }
  
}

/*
SELECT FIRST_NAME || ' ' || LAST_NAME AS DOLGOZÓ_NÉV, SALARY AS DOLGOZÓ_FIZETÉS
FROM EMPLOYEES
ORDER BY DOLGOZÓ_NÉV
*/

/*
SELECT DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES)
*/

/*
SELECT DEPARTMENT_NAME, AVG(SALARY) AS AVERAGE_SALARY
FROM DEPARTMENTS D, EMPLOYEES E
WHERE D.DEPARTMENT_ID=E.DEPARTMENT_ID AND D.DEPARTMENT_ID IN 
  (SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES)
GROUP BY DEPARTMENT_NAME
ORDER BY AVERAGE_SALARY DESC
*/