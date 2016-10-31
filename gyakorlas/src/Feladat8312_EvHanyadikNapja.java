/**
 * megadott (év, hónap, nap) az év hányadik napja
 * @author mate
 */
public class Feladat8312_EvHanyadikNapja {
  static int dayOfTheYear(int year, int month, int day) {
    int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (isLeapYear(year)) {
      months[2] = 29;
    }
    int dayId = day;
    if (month < 2) {
      return dayId;
    }    
    for (int i = 1; i <= month - 1; i++) {
      dayId += months[i];
    }
    return dayId;
  }
  
  static boolean isLeapYear(int year) {
    return ((year >= 1582) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
  }
  
  public static void main(String[] args) {
    System.out.println("A megadott nap az év " + dayOfTheYear(2016, 10, 31) + ". napja.");
  }  
}
