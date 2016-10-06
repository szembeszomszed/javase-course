/**
 * megadott számú, beolvasott számok összege
 * @author mate
 */
public class Feladat6524_NehanySzamOsszege3 {
  public static void main(String[] args) {
    int plan;
    int count = 0;
    int num;
    int sum = 0;
    System.out.println("Összeadás!");
    plan = extra.Console.readInt("Összeadandó számok darabszáma: ");
    if (plan > 0) {
      while (plan > count) {
        num = extra.Console.readInt("Szám: ");
        sum += num;
        count++;  
      }
      System.out.println("A megadott " + plan + " szám összege: " + sum);
    } else {
      System.out.println("Akkor viszlát!");
    }
  }
}
