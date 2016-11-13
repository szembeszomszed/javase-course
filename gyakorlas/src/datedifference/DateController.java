package datedifference;

public class DateController {
  private static MyDate date1;
  private static MyDate date2;
  public static void main(String[] args) {
    date1 = new MyDate(2011, 12, 4);
    date2 = new MyDate(2016, 12, 1);
    int difference = date1.numberOfDaysBetweenYears(date2);
    System.out.println(difference);
  }
}
