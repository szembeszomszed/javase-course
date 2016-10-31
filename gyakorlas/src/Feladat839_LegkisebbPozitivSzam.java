/**
 * 300 elemű tömb -50 és +50 közti véletlenszámokkal, majd legkisebb pozitív szám kiválasztása
 * @author mate
 */
public class Feladat839_LegkisebbPozitivSzam {
  public static void main(String[] args) {
    System.out.println("300 elemű, véletlenszámokkal megtűzdelt tömb legkisebb pozitív száma.");
    int[] myArray = new int[300];
    for (int i = 0; i < 300; i++) {
      myArray[i] = (int) (Math.random() * 101 - 50);
    }
    int min = 51;
    for (int i = 0; i < 300; i++) {
      if (myArray[i] > 0 && myArray[i] < min) {
        min = myArray[i];
      }
    }
    System.out.println("A tömb elemei: ");
    for (int i = 0; i < 300; i++) {
      System.out.print(myArray[i] + " ");
    }
    System.out.println("");    
    System.out.println("A legkisebb pozitív szám a tömbben: " + min);
  }
}
