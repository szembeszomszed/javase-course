/**
 * megadott számú számok maximuma
 * @author mate
 */
public class Feladat6525_NehanySzamMaximuma3 {
  public static void main(String[] args) {
    int plan, num;
    int max = -2147483648;
    int count = 0;
    System.out.println("Maximumkiválasztás!");
    plan = extra.Console.readInt("Vizsgálandó számok darabszáma: ");
    if (plan > 0) {
      while (plan > count) {
        num = extra.Console.readInt("Szám: ");
        if (num > max) {
          max = num;
        }
        count++;
      }
      System.out.println("A megadott " + count + " darab számok közül " + max + " a legnagyobb!");
    } else {
      System.out.println("Akkor viszlát!");
    }
  }
}
