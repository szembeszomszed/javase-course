/**
 * 10 egyedi véletlenszám 1 és 80 között tízelemű tömbbel (kenó)
 * @author mate
 */
public class Feladat833_Keno2 {
  public static void main(String[] args) {
    System.out.println("Kenó!");
    int [] myArray = new int[10];
    int num, j;
    for (int goodNumbers = 1; goodNumbers <= 10; goodNumbers++) {
      do {        
        num = (int) (Math.random() * 80 + 1);
        j = 0;
        while (j < goodNumbers && !(myArray[j] == num)) {
          j++;
        }
      } while (j < goodNumbers); // ha j kisebb, az azt jelenti, hogy a belső while nem tudta végigléptetni, vagyis egyező számokat talált
      myArray[goodNumbers - 1] = num;
    }
    System.out.println("A szelvényen megjátszható számok: ");
    for (int i = 0; i < myArray.length; i++) {
      System.out.print(myArray[i] + " ");
    }
    System.out.println("  ");
  }
}
