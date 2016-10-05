/**
 * megadott számú beolvasott számok átlaga
 * @author mate
 */
public class Feladat6523_NehanySzamAtlaga3 {
  public static void main(String[] args) {
    int plan;
    int count = 0;
    int num;
    int sum = 0;
    double average = 0;
    System.out.println("Átlagszámítás!");
    plan = extra.Console.readInt("Átlagolandó számok darabszáma: ");
    if (plan > 0) {
      while (plan > count) {
        num = extra.Console.readInt("Szám: ");
        sum += num;
        count++;  
      }
      average = sum / count;
      System.out.println("A megadott " + plan + " szám átlaga: " + average);
    } else {
      System.out.println("Akkor viszlát!");
    }
  }
}
