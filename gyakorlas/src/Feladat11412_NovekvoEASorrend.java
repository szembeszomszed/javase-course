
public class Feladat11412_NovekvoEASorrend {
  public static int[] myArray = {4, 8, 34, 47, 53, 65, 99};
  
  public static boolean isAscending(int[] array) {

    int swap = 0;
    for (int i = array.length; i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (array[j] > array[j + 1]) {
          swap++;
        }        
      }      
    }
    return swap == 0;
  }
  
  public static void main(String[] args) {
    System.out.println("A tömbelemek " + (isAscending(myArray) ? "" : "nem ") + "növekvő sorrendbe vannak rendezve");
  }
}
