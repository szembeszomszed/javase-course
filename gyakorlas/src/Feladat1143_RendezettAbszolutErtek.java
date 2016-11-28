
import java.util.Arrays;

/**
 *
 * @author mate
 */
public class Feladat1143_RendezettAbszolutErtek {
  public static int[] loadArray() {
    int[] randomArray = new int[20];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = (int) (Math.random() * 100 - 50);
    }
    return randomArray;      
  }
  
  public static int[] sortArray(int[] array) {
    int tempVar;
    for (int i = array.length; i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (array[j] > array[j + 1]) {
          tempVar = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tempVar;
        }
      }
    }
    return array;
  }
  
  public static int[] makeAbsArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.abs(array[i]);
    }
    return array;    
  }
  
  public static void displayArray(int[] array, String message) {
    System.out.println(message + ": ");
    System.out.println(Arrays.toString(array));
  }
  
  public static void main(String[] args) {
    int[] myArray = loadArray();
    displayArray(myArray, "Rendezetlen tömb");
    myArray = sortArray(myArray);
    displayArray(myArray, "Rendezett tömb");
    myArray = makeAbsArray(myArray);
    displayArray(myArray, "Rendezetlen abszolútértékek");
    myArray = sortArray(myArray);
    displayArray(myArray, "Rendezett abszolútértékek");
    
  }
}
