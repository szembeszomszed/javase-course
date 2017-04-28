package arrays;

import java.util.Arrays;
import java.util.Scanner;
// integers in descending order
public class SortedArray {
  private static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    int[] myIntegers = getIntegers(5);
    int[] sortedIntegers = sortIntegers(myIntegers);
    //printArray(myIntegers);
    printArray(sortedIntegers);
  }
    
  public static int[] getIntegers(int capacity) {
    int[] myArray = new int[capacity];
    System.out.println("Enter " + capacity + " values: \r");
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = scanner.nextInt();      
    }
    return myArray;
  }
  
  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + ": " + array[i]);      
    }
  }
  
  public static int[] sortIntegers(int[] unsortedArray) {
//    int[] sortedArray = new int[unsortedArray.length];
//    for (int i = 0; i < unsortedArray.length; i++) {
//      sortedArray[i] = unsortedArray[i];      
//    }
    int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
    boolean flag = true;
    int temp;
    int whileExecution = 0;
    int forExecution = 0;
    int numberOfSwaps = 0;
    while (flag) {
      System.out.println("Array's current order: \r");
      printArray(sortedArray);
      System.out.println("While loop executing...");
      whileExecution++;
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        System.out.println("For loop executing... current value: " + sortedArray[i] + " next value: " + sortedArray[i + 1]);
        forExecution++;
        if (sortedArray[i] < sortedArray[i + 1]) {
          System.out.println("Swapping values...");
          numberOfSwaps++;
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }        
      }
    }
    System.out.println("While loop execution: " + whileExecution + ""
            + "\nFor loop execution: " + forExecution + ""
            + "\nSwaps: " + numberOfSwaps);
    return sortedArray;
  }
 
}
