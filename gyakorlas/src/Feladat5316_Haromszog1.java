/**
 * egyenlő oldalú háromszög kerülete, területe bekért adat alapján
 * @author mate
 */
public class Feladat5316_Haromszog1 {
  public static void main(String[] args) {
    System.out.println("Háromszög kerület- és területszámítása.");
    double a = extra.Console.readDouble("a = ");
    if (a > 0) {
      double perimeter = 3 * a;
      double area = (0.25) * Math.sqrt(3) * Math.pow(a, 2);
      System.out.println("Kerület = " + perimeter + 
              "\nTerület = " + area);
    } else {
      System.out.println("Hiba: a háromszög oldala nem pozitív!");
    }
  }
}
