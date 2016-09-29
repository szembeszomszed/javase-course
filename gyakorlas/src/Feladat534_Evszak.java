/**
 * bekért szám alapján hónap évszakba sorolása
 * @author mate
 */
public class Feladat534_Evszak {
  public static void main(String[] args) {
    int month = extra.Console.readInt("Adja meg a hónap sorszámát: ");
    if (month >= 1 && month <= 2 || month == 12) {
      System.out.println("Ez egy téli hónap.");
    } else if (month >= 3 && month <= 5) {
      System.out.println("Ez egy tavaszi hónap.");
    } else if (month >= 6 && month <= 8) {
      System.out.println("Ez egy nyári hónap.");
    } else if (month >= 9 && month <= 11) {
      System.out.println("Ez egy őszi hónap.");
    } else {
      System.out.println("Hibás adat.");
    }
  }
}
