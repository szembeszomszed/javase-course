/**
 * 10 egyedi véletlenszám 1 és 80 között logikai tömbbel (kenó)
 * @author mate
 */
public class Feladat832_Keno1 {
  public static void main(String[] args) {
    System.out.println("Kenószelvény kitöltése, vagyis 10 db egyedi szám 1 és 80 között");
    boolean [] myArray = new boolean[81];
    for (int i = 1; i <= 80; i++) {
      myArray[i] = false;
    }
    int count = 1, num;
    while (count <= 10) {
      num = (int) (Math.random() * 80 + 1);
      if (!myArray[num]) {
        myArray[num] = true;
        count++;
      }
    }
    System.out.println("A szelvényen megjátszható számok: ");
    for (int i = 1; i <= 80; i++) {
      if (myArray[i]) {
        System.out.print(i + " ");
      }
    }
    System.out.println("");
  }
}
