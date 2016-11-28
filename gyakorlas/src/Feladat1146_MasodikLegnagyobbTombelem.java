
import java.util.Arrays;


/**
 *
 * @author mate
 */
public class Feladat1146_MasodikLegnagyobbTombelem {

  public static int[] loadArray() {
    int[] randomArray = new int[20];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = (int) (Math.random() * 90 + 10);
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
  
  public static void getSecond(int[] array) {
    int i = 1;
    boolean exists = false;
    while (array[i] == array[0] && i <= array.length) {
      i++;
    }
    if (i <= array.length) {
      exists = true;
    }
    System.out.println("Második legnagyobb tömbelem " + (exists ? "létezik, mégpedig a(z) " + array[i] + ", a " + i + ". indexen." : "nem létezik."));
  }
  
  public static void main(String[] args) {
    int[] myArray = loadArray();
    displayArray(myArray, "Rendezetlen tömb");
    sortArray(myArray);
    displayArray(myArray, "Csökkenő sorrendbe rendezett tömb:");
    getSecond(myArray);
  }
}
