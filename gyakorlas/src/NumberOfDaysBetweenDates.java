/**
 * két dátum közt eltelt napok
 * @author mate
 */
public class NumberOfDaysBetweenDates {
  static int dayOfTheYear(int year, int month, int day) {
    int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int dayId = day;
    if (isLeapYear(year)) {
      months[2] = 29;
    }
    if (month == 1) {
      return dayId;
    }
    for (int i = 0; i <= month - 1; i++) {
      dayId += months[i];
    }
    return dayId;
  }
  
  static int numberOfDays(int year1, int year2) {
    int numberOfDays = 0;
    for (int i = year1 + 1; i < year2; i++) {
      if (!isLeapYear(i)) {
        numberOfDays += 365;
      } else {
        numberOfDays += 366;
      }
    }
    return numberOfDays;
  }
  
  static int remainingDays (int year, int month, int day) {
    int remainingDays;
    if (!isLeapYear(year)) {
      remainingDays = 365 - dayOfTheYear(year, month, day);
    } else {
      remainingDays = 366 - dayOfTheYear(year, month, day);
    }
    return remainingDays;
  }
  
  static boolean isLeapYear(int year) {
    return ((year > 1582) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
  }
  
  static int calculateDifference(int year1, int month1, int day1, int year2, int month2, int day2) {
    int dayDifference = remainingDays(year1, month1, day1) + numberOfDays(year1, year2) + dayOfTheYear(year2, month2, day2);
    return dayDifference;
  }
  
  public static void main(String[] args) {
//    int year1 = extra.Console.readInt("Year1: ");
//    int month1 = extra.Console.readInt("Month1: ");
//    int day1 = extra.Console.readInt("Day1: ");
//    int year2 = extra.Console.readInt("Year2: ");
//    int month2 = extra.Console.readInt("Month2: ");
//    int day2 = extra.Console.readInt("Day2: ");
//    System.out.println(calculateDifference(year1, month1, day1, year2, month2, day2));
    System.out.println(calculateDifference(2015, 1 , 1, 2017, 1, 1));
  }
}
