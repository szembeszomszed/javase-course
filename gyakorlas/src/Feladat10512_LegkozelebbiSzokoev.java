
import java.time.LocalDate;
import java.util.Calendar;
/**
 *
 * @author mate
 */
public class Feladat10512_LegkozelebbiSzokoev {  
  
  public static boolean isLeapYear(int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, year);
    return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
  }
  
  public static int getNextLeapYear(int year) {
    year++;
    while (!isLeapYear(year)) {      
      year++;
    }
    return year;
  }
  
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    int year = date.getYear();
    final int leapDayValue = 60;
    if (isLeapYear(year) && date.getDayOfYear() < leapDayValue) {
      System.out.println("A következő szökőnap: " + year + ".02.29.");
    } else {
      System.out.println("A következő szökőnap: " + getNextLeapYear(year) + ".02.29.");
    }
  }
}
