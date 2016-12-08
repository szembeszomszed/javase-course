
import java.util.ArrayList;



public class Feladat1366_ArmstrongSzamok2 {
  static ArrayList<Integer> armstrong = new ArrayList<>();
  static boolean isArmstrong(int num) {
    int numberToCompare = num;
    int third = num % 10;
    num /= 10;
    int second = num % 10;
    num /= 10;
    int first = num % 10;
    return numberToCompare == (Math.pow(first, 3) + Math.pow(second, 3) + Math.pow(third, 3));
  }
  
  public static void main(String[] args) {
    for (int i = 100; i < 1000; i++) {
      if (isArmstrong(i)) {
        armstrong.add(i);
      }
    }
    System.out.println(armstrong);
  }
}
