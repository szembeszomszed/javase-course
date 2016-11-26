/**
 *
 * @author mate
 */

import java.util.Calendar;
public class Feladat10511_Szuletesnap {
  public static void main(String[] args) {
    System.out.println("Your birthday: ");
    int year = extra.Console.readInt("Year: ");
    int month = extra.Console.readInt("Month: ");
    int day = extra.Console.readInt("Day: ");
//    by using LocalDate
//    LocalDate date = LocalDate.of(year, month, day);
//    int dayOfWeek = date.getDayOfWeek().getValue();
//    System.out.print("\nIt's a ");

// by using Calendar
    Calendar date = Calendar.getInstance();
    date.set(year, month - 1, day - 1);
    int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
    switch (dayOfWeek) {
      case 1 :  System.out.println("Monday");
      break;
      case 2 :  System.out.println("Tuesday");
      break; 
      case 3 :  System.out.println("Wednesday");
      break;
      case 4 :  System.out.println("Thursday");
      break;
      case 5 :  System.out.println("Friday");
      break;
      case 6 : System.out.println("Saturday");
      break;
      case 7 :  System.out.println("Sunday");
      break;
    }
  }
}
