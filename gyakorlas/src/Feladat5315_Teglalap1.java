/**
 * téglalap kerület- és területszámítása bekért adatokból
 * @author mate
 */
public class Feladat5315_Teglalap1 {
  public static void main(String[] args) {
    System.out.println("Téglalap kerület- és területszámítása.");
    double a = extra.Console.readDouble("Adja meg az a oldal hosszát: ");
    double b = extra.Console.readDouble("Adja meg a b oldal hosszát: ");    
    if (a > 0 && b > 0) {
      double perimeter = 2 * (a + b);
      double area = a * b;
      System.out.println("A téglalap kerülete: " + extra.Format.left(perimeter, 0, 2));
      System.out.println("A téglalap területe: " + extra.Format.left(area, 0, 2));
    } else {
      System.out.println("Hiba: a téglalap oldalai nem pozitívak!");
    }
  }
}
