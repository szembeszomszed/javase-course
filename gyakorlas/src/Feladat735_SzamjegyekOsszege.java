/**
 * egész szám számjegyeinek összege
 * @author mate
 */
public class Feladat735_SzamjegyekOsszege {
  static int sumOfDigits(int num) {
    num = Math.abs(num);
    int sum = 0;
    int remainder;
    while (num != 0) {
      remainder = num % 10;
      sum += remainder;
      num /= 10;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(sumOfDigits(-567));
  }
}
