
package databasetest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

interface databaseConnection {  
  String URL="jdbc:oracle:thin:@localhost:1521:xe";
  String USER="HR";
  String PASSWORD="hr";
  String DRIVER="oracle.jdbc.driver.OracleDriver";
}

public class Database implements databaseConnection {
  
  private static Connection connection;
  
  static void openConnection() {
    try {
      Class.forName(DRIVER);
      connection = DriverManager.getConnection(URL, USER, PASSWORD);      
    } 
    catch (ClassNotFoundException e) {
      System.out.println("Error: missing driver.");
    }
    catch (SQLException e) {
      System.out.println("Error: unable to connect to database.");
    }       
  }
  
  static void closeConnection() {
    try {
      connection.close();
    } 
    catch (SQLException e) {
      System.out.println("Error: unable to close database connection.");
    }
  }
  
  static void query1() throws SQLException {
    System.out.print("Average salary: ");
    Statement s = connection.createStatement();
    ResultSet rs = s.executeQuery(
      "SELECT AVG(SALARY) FROM EMPLOYEES"
      );
    rs.next();
    System.out.println(rs.getString(1));    
  }
  
  public static void main(String[] args) {
    openConnection();    
    try {
      query1();
    } catch (SQLException e) {
      System.out.println("Error: " + e.getMessage());
    }
    closeConnection();
  }
  
}
