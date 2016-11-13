/**
 *
 * @author mate
 */
public class Feladat821s_ProgramozasiTetelek {
  static final int N = 20;
  static int[] myArray = new int[N];
  
  static int[] loadArray() {
    int[] tempArray = new int[N];
    int j, num;
    for (int i = 0; i < tempArray.length; i++) {
      do {        
        num = (int) (Math.random() * 51 + 50);
        j = 0;
        while (j < i && !(tempArray[j] == num)) {
          j++;
        }
      } while (j < i);
      tempArray[i] = num;
    }
    return tempArray;
  }
  
  static void displayArray(int[] array) {
    System.out.println("Array elements: ");
    for (int i = 0; i < myArray.length; i++) {
      System.out.print(myArray[i] + " ");
    }
    System.out.println("");
  }
  
  static void osszegzes() {
    int sum = 0;
    for (int i = 0; i < myArray.length; i++) {
      sum += myArray[i];
    }
    System.out.println("Sum of array elements: " + sum + ".");
  }
  
  static void eldontes() {
    int i = 0;
    while (i < myArray.length && !(myArray[i] % 15 == 0)) {      
      i++;
    }
    boolean exists = (i < myArray.length);
    System.out.println("Is there element that can be divided by 15? " + (exists ? "Yes" : "No"));
  }
  
  static void kivalasztas() {
    int i = 0;
    while (i < myArray.length && !(myArray[i] % 2 == 1)) {      
      i++;
    }
    System.out.println("First odd element in array: " + myArray[i] + " at index " + i);
  }
  
  static void linearisKereses() {
    int i = 0;
    while (i < myArray.length && !(myArray[i] == 59)) {      
      i++;
    }
    boolean found = (i < myArray.length);
    System.out.println("Is 59 in the array? " + (found ? "Yes, at index " + i + "." : "No."));
  }
  
  static void megszamolas() {
    int i = 0, countEven = 0, countOdd = 0;
    while (i < myArray.length) {      
      if (myArray[i] % 2 == 0) {
        countEven++;
      } else {
        countOdd++;
      }
      i++;
    }
    System.out.println("Number of even elements: " + countEven);
    System.out.println("Number of odd elements: " + countOdd);
  }
  
  static void maximumKivalasztas() {
    int maxIndex = 0, max = myArray[maxIndex];
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] > max) {
        max = myArray[i];
        maxIndex = i;
      }
    }
    System.out.println("Highest element in the array: " + max + " at index " + maxIndex + ".");
  }
  
  static void minimumKivalasztas() {
    int minIndex = 0, min = myArray[minIndex];
    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] < min) {
        min = myArray[i];
        minIndex = i;
      }
    }
    System.out.println("Lowest element in the array: " + min + " at index " + minIndex);
  }
  
  public static void main(String[] args) {
    myArray = loadArray();
    displayArray(myArray);
    osszegzes();
    eldontes();
    kivalasztas();
    linearisKereses();
    megszamolas();
    maximumKivalasztas();
    minimumKivalasztas();
  }
  
}
