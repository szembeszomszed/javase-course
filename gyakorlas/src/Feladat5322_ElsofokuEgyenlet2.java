/**
 * a * x + b = 0 elsőfokú egyenlet megoldása
 * @author mate
 */
public class Feladat5322_ElsofokuEgyenlet2 {
  public static void main(String[] args) {
    System.out.println("a * x + b = 0 egyenlet megoldása.");
    double a = extra.Console.readDouble("a = ");
    double b = extra.Console.readDouble("b = ");
    if (a != 0) {
      double x = -b / a;
      System.out.println("x = " + x);
    } else {
      System.out.println("Hiba: az a változó értéke ne legyen nulla!");
    }
    
  }
}
