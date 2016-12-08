
import java.util.ArrayList;


public class Feladat1365_ArmstrongSzamok1 {
  static ArrayList<Integer> armstrongNumbers = new ArrayList<>();
  
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
        for (int k = 0; k <= 9; k++) {
          int number = i * 100 + j * 10 + k;
          if (number == (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3))) {
            armstrongNumbers.add(number);
          }          
        }        
      }      
    }
    System.out.println(armstrongNumbers);
  }
}
