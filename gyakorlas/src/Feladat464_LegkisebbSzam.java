/**
 * 3 bekért számból a legkisebb kiválasztása
 * @author mate
 */
public class Feladat464_LegkisebbSzam {
  public static void main(String[] args) {
    System.out.println("Adjon meg három számot!");
    int a = extra.Console.readInt("Első szám: ");
    int b = extra.Console.readInt("Második szám: ");
    int c = extra.Console.readInt("Harmadik szám: ");
    System.out.println("A legkisebb szám ezek közül: " + Math.min(Math.min(a, b), c));
  }
}
