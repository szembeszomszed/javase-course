
import java.util.ArrayList;


public class Feladat1367_ArmstrongSzamok3 {
  static ArrayList<Integer> armstrong = new ArrayList<>();
  static ArrayList<Integer> numberCheck = new ArrayList<>();
  static int copy;
  static int sum = 0;
  
  static boolean isArmstrong(int num) {
    copy = num;
    int digit;
    sum = 0;
    while (num != 0) {
      digit = num % 10;
      num /= 10;
      numberCheck.add(digit);
    }
    for (int n : numberCheck) {
      sum += Math.pow(n, numberCheck.size());
    }    
    numberCheck.clear();
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
