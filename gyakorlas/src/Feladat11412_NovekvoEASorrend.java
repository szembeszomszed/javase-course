
public class Feladat11412_NovekvoEASorrend {

  public static int[] myArray = {14, 8, 34, 47, 53, 65, 99};

  public static boolean isAscending(int[] array) {
//    for (int i = 0; i < array.length - 1; i++) {
//      if (array[i] > array[i + 1]) {
//        return false;
//      }
//    }
//    return true;
    int i = 0;
    while(i < array.length - 1 && array[i] <= array[i+1]) {
      i++;
    }
    return i == array.length - 1;

//    int swap = 0;
//    for (int i = array.length; i > 0; i--) {
//      for (int j = 0; j < i - 1; j++) {
//        if (array[j] > array[j + 1]) {
//          swap++;
//        }        
//      }      
//    }
//    return swap == 0;
}

public static void main(String[] args) {
    System.out.println("A tömbelemek " + (isAscending(myArray) ? "" : "nem ") + "növekvő sorrendbe vannak rendezve");
  }
}
