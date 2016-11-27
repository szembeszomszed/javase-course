
//import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.GregorianCalendar;

/**
 *
 * @author mate
 */
//public class Feladat10514_HonapokElsoHetfoi {
//  public static void main(String[] args) {
//    int[] firstMondays = new int[12];
//    int year = (new GregorianCalendar()).get(Calendar.YEAR);
//    
//    for (int month = 1; month <= 12; month++) {
//      int day = 1;
//      LocalDate date = LocalDate.of(year, month, day);
//      while (!(date.getDayOfWeek().getValue() == 1)) {
//        day++;
//        date = LocalDate.of(year, month, day);
//      }
//      firstMondays[month-1] = day;
//    }
//    
//    System.out.println(year + " hónapjainak első hétfői: ");
//    for (int i = 0; i < firstMondays.length; i++) {
//      System.out.println(i + 1 + "." + firstMondays[i] + ".");
//    }
//  } 
//}

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class Feladat10514_HonapokElsoHetfoi {

  public static void main(String[] args) {
    int[] firstMondays = getFirstMondays();
    System.out.println(Arrays.toString(firstMondays));
  }

  public static int[] getFirstMondays() {
    int[] firstMondays = new int[12];
    LocalDate date = LocalDate.now();
    
    for (int month = 1; month <= 12; month++) {
      date = date.withMonth(month);
      firstMondays[month-1] = getFirstMonday(date);
    }

    return firstMondays;
  }
  
  public static int getFirstMonday(LocalDate date) {
    int day = 1;
    while (!(date.getDayOfWeek() == DayOfWeek.MONDAY)) {
      day++;
      date = date.withDayOfMonth(day);
    }
    return day;
  }
}
