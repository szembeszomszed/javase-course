/**
 * kocka felszíne, térfogata bekért élhosszból
 * @author mate
 */
public class Feladat5314_Kocka {
  public static void main(String[] args) {
    System.out.println("Kocka felszín- és térfogatszámítása.");
    int a = extra.Console.readInt("Adja meg a kocka élét: ");
    if (a <= 0) {
      System.out.println("Hiba: a kocka élének hossza nem pozitív!");
    } else {
      int surfaceArea = 6 * (int) Math.pow(a, 2);
      int volume = (int) Math.pow(a, 3);
      System.out.println("A kocka felszíne: " + surfaceArea + "." + 
              "\nA kocka térfogata: " + volume + ".");
    }      
  }
}
