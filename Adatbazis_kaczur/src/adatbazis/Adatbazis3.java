package adatbazis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

interface AdatbazisKapcsolat {
  String URL="jdbc:oracle:thin:@localhost:1521:xe";
  String USER="HR";
  String PASSWORD="hr";
  String DRIVER="oracle.jdbc.driver.OracleDriver";
}

public class Adatbazis3 implements AdatbazisKapcsolat {
  private static Connection kapcsolat;
  
  static void kapcsolatNyit() {
    try {
      Class.forName(DRIVER);
      kapcsolat=DriverManager.getConnection(URL, USER, PASSWORD);    
    }
    catch(ClassNotFoundException e) {
      System.out.println("Hiba! Hiányzik a JDBC driver.");
    }
    catch(SQLException e) {
      System.out.println("Hiba! Nem sikerült megnyitni a kapcsolatot az adatbázis-szerverrel.");
    }
  }
  
  static void kapcsolatZár() {
    try {
      kapcsolat.close();
    }
    catch(SQLException e) {
      System.out.println("Hiba! Nem sikerült lezárni a kapcsolatot az adatbázis-szerverrel.");
    }
  }
  
  static void lekérdez1() throws SQLException {
    System.out.print("Dolgozók átlagfizetése: ");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT AVG(SALARY) FROM EMPLOYEES");
    rs.next();
    System.out.println(rs.getString(1)); 
  }
  
  static void lekérdez2() throws SQLException {
    System.out.println("Országok nevei:");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT * FROM COUNTRIES");
    while(rs.next())
      System.out.println(rs.getString("COUNTRY_NAME"));
  }
  
  static void lekérdez3() throws SQLException {
    System.out.println("Európai országok:");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT COUNTRY_NAME, REGION_ID FROM COUNTRIES "+
      "WHERE REGION_ID="+
        "(SELECT REGION_ID FROM REGIONS WHERE REGION_NAME='Europe')");
    while(rs.next())
      //System.out.println(rs.getString("COUNTRY_NAME"));
      System.out.println(rs.getString(1));
  }
  
  static void lekérdez4() throws SQLException {
    System.out.println("Európai országok:");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT COUNTRY_NAME, REGION_ID FROM COUNTRIES "+
      "WHERE REGION_ID="+
        "(SELECT REGION_ID FROM REGIONS WHERE REGION_NAME='Europe')");
    while(rs.next())
      //System.out.println(rs.getString("COUNTRY_NAME"));
      System.out.println(rs.getString(1));
  }  
  
  static void lekérdez5() throws SQLException {
    System.out.println("Európai országok:");
    PreparedStatement ps=kapcsolat.prepareStatement(
      "SELECT COUNTRY_NAME, REGION_ID FROM COUNTRIES "+
      "WHERE REGION_ID="+
        "(SELECT REGION_ID FROM REGIONS WHERE REGION_NAME=?)");
    ps.setString(1, "Europe");
    ResultSet rs=ps.executeQuery();
    while(rs.next())
      System.out.println(rs.getString("COUNTRY_NAME"));
  }
  
  static void lekérdez6() throws SQLException {
    System.out.println("Dolgozók nevei:");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT FIRST_NAME || ' ' || LAST_NAME AS empName "+
      "FROM EMPLOYEES "+
      "ORDER BY empName");
    while(rs.next())
      System.out.println(rs.getString("empName"));
  }
  
  static void lekérdez7() throws SQLException {
    System.out.println("Dolgozók nevei:");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT FIRST_NAME || ' ' || LAST_NAME FROM EMPLOYEES ORDER BY 1");
    while(rs.next())
      System.out.println(rs.getString(1));
  }

  static void lekérdez8() throws SQLException {
    System.out.println("Dolgozók nevei, akiknek fizetése 15000 és 25000 közé esik:");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT FIRST_NAME || ' ' || LAST_NAME "+
      "FROM EMPLOYEES "+
      "WHERE SALARY BETWEEN 15000 AND 25000 "+
      "ORDER BY 1");
    while(rs.next())
      System.out.println(rs.getString(1));
  }

  static void lekérdez9() throws SQLException {
    System.out.println("Dolgozók nevei, akiknek fizetése 15000 és 25000 közé esik:");
    PreparedStatement ps=kapcsolat.prepareStatement(
      "SELECT FIRST_NAME || ' ' || LAST_NAME "+
      "FROM EMPLOYEES "+
      "WHERE SALARY BETWEEN ? AND ? "+
      "ORDER BY 1");
    ps.setInt(1, 15000);
    ps.setInt(2, 25000);
    ResultSet rs=ps.executeQuery();
    while(rs.next())
      System.out.println(rs.getString(1));
  }
  
  static void lekérdez10() throws SQLException {
    System.out.println("Kik dolgoznak az IT részlegnél?");
    PreparedStatement ps=kapcsolat.prepareStatement(
      "SELECT FIRST_NAME || ' ' || LAST_NAME "+
      "FROM EMPLOYEES, DEPARTMENTS "+
      "WHERE EMPLOYEES.DEPARTMENT_ID=DEPARTMENTS.DEPARTMENT_ID AND DEPARTMENT_NAME=?");
    ps.setString(1, "IT");
    ResultSet rs=ps.executeQuery();
    while(rs.next())
      System.out.println(rs.getString(1));
  }
  
  static void lekérdez11() throws SQLException {
    System.out.println("Hányan dolgoznak az egyes részlegeknél?");
    Statement s=kapcsolat.createStatement();
    ResultSet rs1=s.executeQuery(
      "SELECT DEPARTMENT_NAME "+
      "FROM DEPARTMENTS "+
      "WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM EMPLOYEES) "+
      "ORDER BY 1");
    ArrayList<String> részlegLista=new ArrayList<String>();
    while(rs1.next())
      részlegLista.add(rs1.getString(1));
    for (String részleg : részlegLista) {
      System.out.print(részleg+": ");
      PreparedStatement ps=kapcsolat.prepareStatement(
        "SELECT COUNT(*) "+
        "FROM EMPLOYEES E, DEPARTMENTS D "+
        "WHERE E.DEPARTMENT_ID=D.DEPARTMENT_ID AND DEPARTMENT_NAME=?");
      ps.setString(1,részleg);
      ResultSet rs2=ps.executeQuery();
      while(rs2.next())
        System.out.println(rs2.getString(1)+" fő");
    }
  }

  static void lekérdez12() throws SQLException {
    System.out.println("Hányan dolgoznak az egyes részlegeknél?");
    Statement s=kapcsolat.createStatement();
    ResultSet rs=s.executeQuery(
      "SELECT DEPARTMENT_NAME AS Részleg, COUNT(EMPLOYEE_ID) AS Létszám " +
      "FROM DEPARTMENTS D, EMPLOYEES E " +
      "WHERE D.DEPARTMENT_ID=E.DEPARTMENT_ID AND D.DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM EMPLOYEES) " +
      "GROUP BY DEPARTMENT_NAME " +
      "ORDER BY DEPARTMENT_NAME");
    while(rs.next())
      System.out.println(rs.getString("Részleg")+": "+rs.getInt("Létszám")+" fő");
  }

  public static void main(String[] args) {
    kapcsolatNyit();
    try {
      //lekérdez1();
      //lekérdez2();
      //lekérdez3();
      //lekérdez4();
      //lekérdez5();
      lekérdez6();
      //lekérdez7();
      //lekérdez7();
      //lekérdez8();
      //lekérdez9();
      //lekérdez10();
      //lekérdez11();
      //lekérdez12();
    }
    catch(SQLException e) {
      System.out.println("Hiba! "+e.getMessage());
    }
    kapcsolatZár();
  }
}