
package databasetest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database implements DatabaseConnection {
  private static Connection conn;
  static void openConnection() {
    try {
      Class.forName(DRIVER);
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
    } 
    catch (ClassNotFoundException e) {
      System.out.println("Error: missing driver.");
      e.printStackTrace();
    }
    catch (SQLException e) {
      System.out.println("Error: unable to connect to database.");
      e.printStackTrace();
    }
  }
  
  static void closeConnection() {
    try {
      conn.close();
    } 
    catch (SQLException e) {
      System.out.println("Error: unable to close connection.");
      e.printStackTrace();
    }
  }
  
  static void query1() throws SQLException {
    System.out.println("IT people: ");
    Statement stmt = conn.createStatement();
    String sql = "SELECT FIRST_NAME || ' ' || LAST_NAME AS NAME FROM EMPLOYEES WHERE JOB_ID = 'IT_PROG'";
    ResultSet rs = stmt.executeQuery(sql);
    while (rs.next()) {
      System.out.println(rs.getString(1));
    }
  }
  
  public static void main(String[] args) {
    openConnection();
    try {
      query1();
    } 
    catch (SQLException e) {
      System.out.println("Hiba: " + e.getMessage());
    }
    finally {
      closeConnection();
    }
  }  
}
