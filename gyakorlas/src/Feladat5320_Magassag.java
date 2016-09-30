/**
 * tengerszint feletti magasság kategorizálása
 * @author mate
 */
public class Feladat5320_Magassag {
  public static void main(String[] args) {
    int alt = extra.Console.readInt("Adja meg a tengerszint feletti magasságot: ");
    if (alt > 0) {
      if (alt < 200)
        System.out.println("Alföld");
      else if (alt < 500)
        System.out.println("Dombság");
      else if (alt < 1500)
        System.out.println("Középhegység");
      else
        System.out.println("Hegység");
    } else {
      System.out.println("Hiba: nem értelmezhető magasság.");
    }
  }
}
