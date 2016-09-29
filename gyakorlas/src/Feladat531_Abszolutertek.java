/**
 * bekért valós szám abszolútértéke elágazással
 * @author mate
 */
public class Feladat531_Abszolutertek {
  public static void main(String[] args) {
    double num = extra.Console.readInt("Adjon meg egy valós számot: ");
    System.out.println("A szám abszolútértéke: " + (num >= 0 ? num : num * -1));
    
//    if (num >= 0) {
//      System.out.println("A szám abszolútértéke: " + num );
//    } else {
//      System.out.println("A szám abszolútértéke: " + num * -1);
//    }
  }
}
