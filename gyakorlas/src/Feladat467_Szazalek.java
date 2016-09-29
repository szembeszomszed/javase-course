/**
 * bekért százalékalap és százalékláb alapján százalékértékszámítás
 * @author mate
 */
public class Feladat467_Szazalek {
  public static void main(String[] args) {
    System.out.println("Százalékszámítás!");
    int x = extra.Console.readInt("Adja meg a százalékalapot: ");
    int y = extra.Console.readInt("Most adja meg a százaléklábat: ");
    double result = (x * y) / (double) 100;
    System.out.println("Az eredmény pedig: " + result);
  }
}
