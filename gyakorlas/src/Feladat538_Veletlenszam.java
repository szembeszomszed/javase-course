/**
 * két tetszőleges szám közti véletlenszám, szükség esetén a határok felcserélésével
 * @author mate
 */
public class Feladat538_Veletlenszam {
  public static void main(String[] args) {
    System.out.println("Véletlenszámot generálunk!");
    int a = extra.Console.readInt("Adja meg az egyik határt: ");
    int b = extra.Console.readInt("Adja meg a másik határt: ");
    int randomNum;
    if (a == b) {
      System.out.println("Ebben az esetben a véletlenszám sem lehet más, mint: " + a);
    } else if (a < b) {
      randomNum = (int) (Math.random() * (b - a) + 1 + a);
      System.out.println("A véletlenszám pedig: " + randomNum);
    } else {
      randomNum = (int) (Math.random() * (a - b) + 1 + b);
      System.out.println("A véletlenszám pedig: " + randomNum);
    }
  }
}
