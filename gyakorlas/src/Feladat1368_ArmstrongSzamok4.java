
import java.util.ArrayList;

public class Feladat1368_ArmstrongSzamok4 {

  static ArrayList<Integer> armstrong = new ArrayList<>();

  static boolean isArmstrong(int num) {
    int numberOfDigits = ("" + num).length();
    int copy = num;
    int sum = 0;
    int digit;
    while (num != 0) {
      digit = num % 10;
      num /= 10;
      sum += Math.pow(digit, numberOfDigits);
    }
    
    return sum == copy;
  }

  static void getArmstrongNumbers() {
    for (int i = 0; i < 10000000; i++) {
      if (isArmstrong(i)) {
        armstrong.add(i);
      }
    }
    System.out.println(armstrong);
  }

  public static void main(String[] args) {
    getArmstrongNumbers();
  }
}
