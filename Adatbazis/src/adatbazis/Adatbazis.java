package adatbazis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mate
 */
public class Adatbazis {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      // a driver meghatározása - ezt az osztályt kell betölteni, hogy a belépési pont rendben legyen
      // és ha osztálybetöltőből hívunk be képességet, akkor bizony nincs import, ezért kell így csinálni
      Class.forName("oracle.jdbc.driver.OracleDriver");
      // factory típusú megoldás - nem konstruktoron keresztül kérjük el a kapcsolódáshoz szükséges adatokat
      // Connection interface-t kell használni
      // jdbc
      // oracle: gyártócég neve
      // thin kapcsolódási modell (vékony kliens)
      // @localhost: helyi ip-cím (rendszergazda adja meg amúgy, hogy minek kell lennie)
      // 1521: port
      // xe: adatbáziskezelő-rendszerséma
      Connection kapcsolat = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "hr");
      final String SQL = 
        "SELECT FIRST_NAME || ' ' || LAST_NAME AS DOLGOZÓ_NÉV, SALARY AS DOLGOZÓ_FIZETÉS\n" +
        "FROM EMPLOYEES\n" +
        "ORDER BY DOLGOZÓ_NÉV";
      ResultSet eredmény = kapcsolat.createStatement().executeQuery(SQL);
      while (eredmény.next()) {
        // többféle get is van - ha nem tudjuk, milyen típust kapunk, getObjectet használunk
        // az alias metaadatként jön vissza, segít a hozzáférésben
        System.out.println(eredmény.getString("DOLGOZÓ_NÉV") + 
                "\t\t" + eredmény.getInt("DOLGOZÓ_FIZETÉS"));
        
      }
      kapcsolat.close();
    } 
    catch(SQLException e) {
      //e.printStackTrace();
      System.out.println("Hiba: kapcsolatlétrehozás, lekérdezés, feldolgozás, lezárás során."); 
    }
    catch (ClassNotFoundException e) {
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

a DISTINCT minden ID-ból csak egyet tart meg
*/

/*
SELECT DEPARTMENT_NAME, AVG(SALARY) AS AVERAGE_SALARY
FROM DEPARTMENTS D, EMPLOYEES E
WHERE D.DEPARTMENT_ID=E.DEPARTMENT_ID AND D.DEPARTMENT_ID IN
  (SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES)
GROUP BY DEPARTMENT_NAME
ORDER BY AVERAGE_SALARY DESC
*/
