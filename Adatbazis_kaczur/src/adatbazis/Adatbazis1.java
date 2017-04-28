package adatbazis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Adatbazis1 {

  public static void lekérdezés()
      throws ClassNotFoundException, SQLException {
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String user="HR";
    String password="hr";
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection kapcsolat=
      DriverManager.getConnection(url, user, password);
    System.out.print("Dolgozók átlagfizetése: ");
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery(
        "SELECT AVG(SALARY) FROM EMPLOYEES");
    rs.next();
    System.out.println(rs.getString(1));
    kapcsolat.close();
  }

  public static void main(String[] args) {
    try {
      lekérdezés();
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}
/*
    System.out.println("Országok nevei:");
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery("SELECT * FROM COUNTRIES");
    while(rs.next())
      System.out.println(rs.getString("COUNTRY_NAME"));
*/

/*
    System.out.println("Európai országok");
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery("SELECT * FROM COUNTRIES WHERE REGION_ID=1");
    while(rs.next())
      System.out.println(rs.getString("COUNTRY_NAME"));

*/

/*
    System.out.println("Európai országok");
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery(
        "SELECT COUNTRY_NAME, REGION_ID FROM COUNTRIES "+
        "WHERE REGION_ID=" +
          "(SELECT REGION_ID FROM REGIONS WHERE REGION_NAME='Europe')");
    while(rs.next())
      //System.out.println(rs.getString("COUNTRY_NAME"));
      System.out.println(rs.getString(1));
 */

/*
    System.out.println("Pozíciók, minimum fizetés, maximum fizetés");
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery(
        "SELECT * FROM JOBS "+
        "ORDER BY JOB_TITLE");
    while(rs.next())
      System.out.println(
        rs.getString("JOB_TITLE")+", "+
        rs.getString("MIN_SALARY")+", "+
        rs.getString("MAX_SALARY"));

*/

/*
    System.out.println("Pozíciók, minimum fizetés, maximum fizetés");
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery(
        "SELECT * FROM JOBS "+
        "ORDER BY JOB_TITLE");
    while(rs.next())
      System.out.println(
        rs.getString("JOB_TITLE")+", "+
        rs.getString("MIN_SALARY")+", "+
        rs.getString("MAX_SALARY"));
*/

/*
    System.out.println(
      extra.Format.left("Név", 20)+
      extra.Format.right("Fizetés", 10));
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery(
        "SELECT * FROM EMPLOYEES "+
        "ORDER BY SALARY");
    while(rs.next()) {
      System.out.print(
        extra.Format.left(
          rs.getString("FIRST_NAME")+" "+
          rs.getString("LAST_NAME"), 20));
      System.out.println(
        extra.Format.right(rs.getString("SALARY"), 10));
    }
*/

/*
    System.out.print("Dolgozók átlagfizetése: ");
    Statement stat=kapcsolat.createStatement();
    ResultSet rs=
      stat.executeQuery(
        "SELECT AVG(SALARY) FROM EMPLOYEES");
    rs.next();
    System.out.println(rs.getString(1));

*/