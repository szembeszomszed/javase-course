/**
 * 3 bekért szám közül melyik a legkisebb
 * @author mate
 */
public class Feladat5321_Legkisebb3Kozul {
  public static void main(String[] args) {
    System.out.println("Legkisebb szám kiválasztása.");
    double a = extra.Console.readDouble("1. szám: ");
    double b = extra.Console.readDouble("2. szám: ");
    double c = extra.Console.readDouble("3. szám: ");
    double min = Math.min(Math.min(a, b), c);
    System.out.println("A legkisebb szám: " + min + ".");
  }
}
