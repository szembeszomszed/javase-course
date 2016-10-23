/**
 * két szám közötti egészek
 * @author mate
 */
public class Feladat739_KetSzamKozottiEgeszek2 {
  static void numOfIntegers(int num1, int num2) {
    if (num1 > num2) {
      System.out.println("Hibás sorrend!");
    } else {
      for (int i = num1 + 1; i < num2; i++) {
      System.out.print(i + " ");      
      }
    } 
  }
  
  public static void main(String[] args) {
    numOfIntegers(123, 125);
  }
}
