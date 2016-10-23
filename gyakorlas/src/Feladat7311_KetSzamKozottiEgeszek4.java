/**
 * két szám közötti egészek
 * @author mate
 */

//public class Feladat7311_KetSzamKozottiEgeszek4 {
//
//  static void kétSzámKözöttiEgészek(int a, int b) {
//    System.out.println("Egész számok "+a+" és "+b+" között: ");
//    for(int i=Math.min(a, b); i<=Math.max(a, b); i++)
//      System.out.print(i+", ");
//    System.out.println();
//  }
//
//  public static void main(String[] args) {
//    kétSzámKözöttiEgészek(100, 112);
//    kétSzámKözöttiEgészek(120, 112);
//  }
//}
public class Feladat7311_KetSzamKozottiEgeszek4 {
  static void numOfIntegers(int num1, int num2) {
    if (num1 < num2) {
      for (int i = num1 + 1; i < num2; i++) {
        System.out.print(i + " "); 
      }
    } else {
      for (int i = num2 + 1; i < num1; i++) {
        System.out.print(i + " ");      
      } 
    } 
  }
  
  public static void main(String[] args) {
    numOfIntegers(123, 129);
  } 
}
