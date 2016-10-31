/**
 * 300 elemű tömb -50 és +50 közti véletlenszámokkal, majd a pozitív és negatív számok viszonyának eldöntése
 * @author mate
 */
public class Feladat837_MelyikbolVanTobb {
  public static void main(String[] args) {
    System.out.println("300 elemű, véletlenszámokkal megtűzdelt tömb pozitív és negatív számainak aránya.");
    int[] myArray = new int[300];
    for (int i = 0; i < 300; i++) {
      myArray[i] = (int) (Math.random() * 101 - 50);
    }
    int countPos = 0, countNeg = 0, countZero = 0;
    for (int i = 0; i < 300; i++) {
      if (myArray[i] > 0) {
        countPos++;
      } else if (myArray[i] < 0) {
        countNeg++;
      } else {
        countZero++;
      }
    }
    System.out.println("A pozitív számok darabszáma: " + countPos);
    System.out.println("A negatív számok darabszáma: " + countNeg);
    System.out.println("A nulla előfordulása: " + countZero);
    System.out.print("Tehát ");
    if (countPos > countNeg) {
      System.out.println("pozitív számból van több.");
    } else if (countPos < countNeg) {
      System.out.println("negatív számból van több.");
    } else {
      System.out.println("a pozitív és negatív számok darabszáma megegyezik.");
    }  
  }
}
