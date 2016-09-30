/**
 * másodfokú egyenlet - negatív diszkrimináns esetén "nincs valós gyök"
 * @author mate
 */
public class Feladat539_MasodfokuEgyenlet1 {
  public static void main(String[] args) {
    System.out.println("Másodfokú egyenlet megoldása. A másodfokú egyenlet általános alakja: a^2 + bx + c = 0");
    double a = extra.Console.readDouble("Adja meg az a értékét: ");
    double b = extra.Console.readDouble("Adja meg az b értékét: ");
    double c = extra.Console.readDouble("Adja meg az c értékét: ");
    double disc = Math.pow(b, 2) - 4 * a * c;
    if (disc < 0) {
      System.out.println("Nincs valós gyök!");
    } else if (disc == 0) {
      double x = (-b) / (2 * a);
      System.out.println("x = " + x);
    } else {
      double x1 = ((-1) * b + Math.sqrt(disc)) / (2 * a);
      double x2 = (-b - Math.sqrt(disc)) / (2 * a);
      System.out.println("x1 = " + x1 + 
              "\nx2 = " + x2);
    }
  }
}
