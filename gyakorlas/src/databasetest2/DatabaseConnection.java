package databasetest2;

public interface DatabaseConnection {
  String URL = "jdbc:oracle:thin:@localhost:1521:xe";
  String USER = "HR";
  String PASSWORD = "hr";
  String DRIVER = "oracle.jdbc.driver.OracleDriver";  
}
