
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mate
 */
public class Feladat11411_ParosEsParatlanElemekKulonRendezve {

  static final int N = 20;
  public static int[] tempArrayPositive = new int[N];
  public static int[] tempArrayNegative = new int[N];

  public static int[] loadArray() {
    int[] randomArray = new int[N];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = (int) (Math.random() * 60 - 30);
    }
    return randomArray;
  }

  public static void selectNumbers(int[] array) {
    int countPositive = 0;
    int countNegative = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        tempArrayPositive[countPositive++] = array[i];
      } else {        
        tempArrayNegative[countNegative++] = array[i];
      }
    }
    int[] positiveNumbers = new int[countPositive];
    int[] negativeNumbers = new int[countNegative];
    
    for (int i = 0; i < countPositive; i++) {
      positiveNumbers[i] = tempArrayPositive[i];
    }

    for (int i = 0; i < countNegative; i++) {
      negativeNumbers[i] = tempArrayNegative[i];
    }

    sortArray(negativeNumbers);
    sortArray(positiveNumbers);
    System.out.print("A pozitív számok: ");
    for (int i = 0; i < countPositive; i++) {
      System.out.print(positiveNumbers[i] + " ");
    }
    System.out.println("");
    System.out.print("A negatív számok: ");
    for (int i = 0; i < countNegative; i++) {
      System.out.print(negativeNumbers[i] + " ");
    }
    System.out.println("");
  }

  public static int[] sortArray(int[] array) {
    int temp;
    for (int i = array.length; i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    return array;
  }

  public static void displayArray(int[] array, String message) {
    System.out.print(message + ": ");
    System.out.println(Arrays.toString(array));
  }

  public static void main(String[] args) {
    int randomArray[] = loadArray();
    displayArray(randomArray, "Az eredeti tömb");
    selectNumbers(randomArray);
  }
}
