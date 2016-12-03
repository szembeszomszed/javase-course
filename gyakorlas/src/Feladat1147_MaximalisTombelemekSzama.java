
import java.util.Arrays;

/**
 *
 * @author mate
 */
public class Feladat1147_MaximalisTombelemekSzama {

  public static int[] loadArray() {
    int[] randomArray = new int[20];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = (int) (Math.random() * 20 + 10);
    }
    return randomArray;
  }

  public static int[] sortArray(int[] array) {
    int temp;
    for (int i = array.length; i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (array[j] < array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }        
      }      
    }
    return array;
  }

  public static void displayArray(int[] array, String message) {
    System.out.println(message + ":");
    System.out.println(Arrays.toString(array));
  }
  
  public static void getOccurence(int[] array) {
    int i = 1;
    int count = 1;
    while (i < array.length && array[i] == array[0]) {
      i++;
      count++;
    }
    System.out.println("A legnagyobb tömbelem: " + array[0] + ", mely " + count + " alkalommal fordul elő.");
  }
  
  public static void main(String[] args) {
    int[] array = loadArray();
    displayArray(array, "rendezetlen tömb");
    sortArray(array);
    displayArray(array, "rendezett tömb");
    getOccurence(array);
  }
}
