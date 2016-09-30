/**
 * bekért legalább háromjegyű pozitív egész szám osztható-e 15-tel
 * @author mate
 */
public class Feladat5323_Oszthato15tel {
  public static void main(String[] args) {
    System.out.println("Legalább háromjegyű pozitív egész szám osztható-e 15-tel?");
    int num = extra.Console.readInt("A vizsgálandó szám: ");
    if (num < 100) {
      System.out.println(num + " nem háromjegyű szám.");
    } else {
      System.out.println(num + (num % 3 == 0 && num % 5 == 0 ? "" : " nem") + " osztható 15-tel!");
//      if (num % 3 == 0 && num % 5 == 0) {
//        System.out.println(num + " osztható 15-tel!");
//      } else {
//        System.out.println(num + " nem osztható 15-tel");
//      }
    }
  }
}
