/**
 * két beolvasott egész szám összege
 * @author mate
 */
public class Feladat355_KetSzamOsszege {
  public static void main(String[] args) {
    System.out.println("Adjon meg két számot, s megkapja az összegüket!");
    int x, y, sum;
    x = extra.Console.readInt("Első szám: ");
    y = extra.Console.readInt("Második szám: ");
    sum = x + y;
    System.out.println("A megadott számok összege: " + sum);
  }
}
