/**
 * tízes szorzótábla
 * @author mate
 */
public class Feladat6518_TizesSzorzoTabla {
  public static void main(String[] args) {
    System.out.println("Tízes szorzótábla.");
    for (int i = 1; i <= 10; i++) {
      System.out.println("");
      for (int j = 1; j <= 10; j++) {
        System.out.print(extra.Format.left(i * j, 3));
      }
    }
  }
}
