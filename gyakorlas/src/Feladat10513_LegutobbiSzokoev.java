
import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author mate
 */
public class Feladat10513_LegutobbiSzokoev {
    public static boolean isLeapYear(int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, year);
    return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
  }
  
  public static int getPreviousLeapYear(int year) {
    year--;
    while (!isLeapYear(year)) {      
      year--;
    }
    return year;
  }
  
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    int year = date.getYear();
    // 29 Feb is the 60th day in the year
    final int leapDayValue = 60;
    if (isLeapYear(year) && date.getDayOfYear() > leapDayValue) {
      System.out.println("Az előző szökőnap: " + year + ".02.29.");
    } else {
      System.out.println("Az előző szökőnap: " + getPreviousLeapYear(year) + ".02.29.");
    }
  }
}
