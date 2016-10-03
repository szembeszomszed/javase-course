/**
 * van-e a két, konzolról beolvasott szám között 0-ra végződő szám?
 * @author mate
 */
public class Feladat6513_VanEKetSzamKozott0raVegzodoSzam2 {
  public static void main(String[] args) {
    System.out.println("Van-e a két szám között nullára végződő szám?");
    int a = extra.Console.readInt("a = ");
    int b = extra.Console.readInt("b = ");
    if (b < a) {
      int c;
      c = a;
      a = b;
      b = c;
    }
    int i = a;
    while (i % 10 != 0 && i <= b) {
      i++;
    }
    if (i > b) {
      System.out.println(a + " és " + b + " között nincs nullára végződő szám.");
    } else {
      System.out.println("Találat: " + i);
    }
  }
}
