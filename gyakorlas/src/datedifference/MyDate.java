package datedifference;

class MyDate {

  private int year;
  private int month;
  private int day;
  private static final int[] MONTHS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public MyDate(int year, int month, int day) {
    setDate(year, month, day);
  }

  public void setDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  
  public boolean isLeapYear(int year) {
    return ((year > 1582) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
  }
  
  public int dayOfTheYear() {    
    int dayId = this.day;
    if (isLeapYear(this.year)) {
      MONTHS[2] = 29;
    }
    if (this.month == 1) {
      return dayId;
    }
    for (int i = 0; i <= this.month - 1; i++) {
      dayId += MONTHS[i];
    }
    return dayId;
  }

  public int remainingDays() {
    int remainingDays;
    if (!isLeapYear(this.year)) {
      remainingDays = 365 - dayOfTheYear();
    } else {
      remainingDays = 366 - dayOfTheYear();
    }
    return remainingDays;
  }
  
  public int numberOfDaysBetweenYears(MyDate that) {
    int numberOfDays = 0;
    for (int i = this.year + 1; i < that.year; i++) {
      if (!isLeapYear(i)) {
        numberOfDays += 365;
      } else {
        numberOfDays += 366;
      }
    }
   int dayDifference = remainingDays() + numberOfDays + that.dayOfTheYear();
   return dayDifference;
  } 
}
