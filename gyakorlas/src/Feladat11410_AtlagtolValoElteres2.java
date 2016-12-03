

import java.util.Arrays;


public class Feladat11410_AtlagtolValoElteres2 {

  static final int N = 20;

  public static int[] loadArray() {
    int[] randomArray = new int[N];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = (int) (Math.random() * 90 + 10);
    }
    return randomArray;
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

  public static void getNumbers(int[] array) {
    int sum = 0;
    int average;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    average = sum / N;
    int difference = average / 5;
    System.out.println(difference);
    int min = average - difference;
    int max = average + difference;
    System.out.println("A tömb elemeinek átlaga: " + average + ", melynek 20 százaléka: " + difference + ".");
    System.out.print("A tömb elemeinek átlagától legfeljebb 20 százalékkal az alábbi elemek térnek el:");
    for (int i = 0; i < array.length; i++) {
      if (array[i] >= min && array[i] <= max) {
        System.out.print(" " + array[i]);
      }      
    }
    System.out.println("");
  }

  public static void displayArray(int[] array, String message) {
    System.out.println(message + ":");
    System.out.println(Arrays.toString(array));
  }

  public static void main(String[] args) {
    int[] array = loadArray();
    displayArray(array, "rendezetlen tömb");
    sortArray(array);
    displayArray(array, "rendezett tömb");
    getNumbers(array);
  }
}

