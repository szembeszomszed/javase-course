/**
 * két bekért szám oszthatósága
 * @author mate
 */
public class Feladat465_Oszthatosag {
  public static void main(String[] args) {
    System.out.println("Adjon meg két egész számot!");
    int a = extra.Console.readInt("Első szám: ");
    int b = extra.Console.readInt("Második szám: ");
    boolean oszthato_e = a % b == 0;
    System.out.println(oszthato_e);
  }
}
