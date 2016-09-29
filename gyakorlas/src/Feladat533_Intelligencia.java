
/**
 * bekért szám (iq) kategorizálása
 * @author mate
 */
public class Feladat533_Intelligencia {
  public static void main(String[] args) {
    int iq = extra.Console.readInt("Adjon meg egy egész számot: ");
    if (iq > 0 && iq < 90) {
      System.out.println("90 alatt alacsony intelligencia.");
    } else if (iq < 110) {
      System.out.println("90 és 110 között normál, átlagos intelligencia.");
    } else {
      System.out.println("110 fölött magas intelligencia!");
    }
  }
}
