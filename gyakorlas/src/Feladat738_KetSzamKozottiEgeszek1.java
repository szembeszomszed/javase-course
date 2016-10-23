/**
 * két szám közötti egész számok
 * @author mate
 */
public class Feladat738_KetSzamKozottiEgeszek1 {
  static void numOfIntegers(int num1, int num2) {
    System.out.println(num1 + " és " + num2 + " közötti egész számok: ");
    for (int i = num1 + 1; i < num2; i++) {
      System.out.print(i + " ");      
    }
  }
  public static void main(String[] args) {
    numOfIntegers(123, 198);
  }
}
