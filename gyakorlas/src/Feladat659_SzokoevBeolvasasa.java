/**
 * szökőév beolvasása
 * @author mate
 */
public class Feladat659_SzokoevBeolvasasa {
  public static void main(String[] args) {
    System.out.println("Szökőév beolvasása");
    int year;
    boolean ok;
    do {
      year = extra.Console.readInt("Adja meg az évszámot: ");
      ok = (year >= 1582) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
      if (!ok) {
        System.out.println("Nem szökőév! Újra!");
      }
    } while (!ok);
    System.out.println("Elfogadva: " + year);
  }
}
