/**
 * ké dátum közt eltelt napok
 * @author mate
 */
import java.util.Date;
public class Feladat10510_NapokKetDatumKozott {
  static long getDaysBetweenDates (Date date1, Date date2) {
    long days = (date2.getTime() - date1.getTime()) / 1000 / 60 / 60 / 24;
    return days;
  }
  
  public static void main(String[] args) {
    Date date1 = new Date(2012, 3, 4);
    Date date2 = new Date(2012, 3, 9);
    System.out.println(getDaysBetweenDates(date1, date2));
  }
}
