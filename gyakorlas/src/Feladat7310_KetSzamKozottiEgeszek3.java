/**
 * két szám közötti egészek
 * @author mate
 */
public class Feladat7310_KetSzamKozottiEgeszek3 {
  static void numOfIntegers(int num1, int num2) {
    if (num1 > num2) {
      int x = num1;
      num1 = num2;
      num2 = x;
    } 
    for (int i = num1 + 1; i < num2; i++) {
      System.out.print(i + " ");      
    } 
  }
  
  public static void main(String[] args) {
    numOfIntegers(123, 129);
  }
}
