/**
 * 500 elemű tömb feltöltése kétjegyű számokkal, majd a számok gyakoriságának kiírása
 * @author mate
 */
public class Feladat834_SzamokElofordulasa {
  public static void main(String[] args) {
    System.out.println("500 elemű tömb");
    int [] myArray = new int[500];
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = (int) (Math.random() * 90 + 10);      
    }    
    int [] countArray = new int[100];
    for (int i = 0; i < countArray.length; i++) {
      countArray[i] = 0;
    }
    for (int i = 0; i < myArray.length; i++) {
      countArray[myArray[i]]++;
//      for (int j = 10; j < countArray.length; j++) {
//        if (myArray[i] == j) {
//          countArray[j]++;
//        }
//      }
    }    
//    System.out.println("A tömb elemei: ");
//    for (int i = 0; i < myArray.length; i++) {
//      System.out.print(myArray[i] + " ");
//    }
//    System.out.println("");    
    System.out.println("Az alábbi előfordulások voltak: ");
    for (int i = 10; i < countArray.length; i++) {
      System.out.println(extra.Format.right(i, 4) + ": " + countArray[i] + " db.");
    }
  }
}
