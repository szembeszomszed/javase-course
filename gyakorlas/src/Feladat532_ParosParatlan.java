
/**
 * bekért szám vizsgálata - páros vagy páratlan
 * @author mate
 */
public class Feladat532_ParosParatlan {
  public static void main(String[] args) {
    int num = extra.Console.readInt("Adjon meg egy egész számot: ");
    if (num % 2 == 0) {
      System.out.println("A szám páros.");
    } else {
      System.out.println("A szám páratlan.");
    }
  }
}
