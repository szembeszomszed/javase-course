/**
 * bekért szám alapján hónap nevének kiírása
 * @author mate
 */
public class Feladat535_HonapNev {
  public static void main(String[] args) {
    int month = extra.Console.readInt("Adja meg a hónap sorszámát: ");
    switch (month) {
      case 1: System.out.println("A hónap neve január."); break;
      case 2: System.out.println("A hónap neve február."); break;
      case 3: System.out.println("A hónap neve március."); break;
      case 4: System.out.println("A hónap neve április."); break;
      case 5: System.out.println("A hónap neve május."); break;
      case 6: System.out.println("A hónap neve június."); break;
      case 7: System.out.println("A hónap neve július."); break;
      case 8: System.out.println("A hónap neve augusztus."); break;
      case 9: System.out.println("A hónap neve szeptember."); break;
      case 10: System.out.println("A hónap neve október."); break;
      case 11: System.out.println("A hónap neve november."); break;
      case 12: System.out.println("A hónap neve december."); break;
      default: System.out.println("Hibás adat.");
    }
  }
}
