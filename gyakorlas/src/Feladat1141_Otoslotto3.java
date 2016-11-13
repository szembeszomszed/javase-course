/**
 * ötöslottó-szelvén rendezett számokkal
 * @author mate
 */
public class Feladat1141_Otoslotto3 {
  static int[] numbers = new int[5];
  
  static int randomInt() {
    int num = (int) (Math.random() * 90 + 1);
    return num;
  }
  
  static boolean isDuplicate(int num) {
    for (int i : numbers) {
      if (i == num) {
        return true;
      }
    }
    return false;
  }
  
  static void createNumbers() {
    int num;
    for (int i = 0; i < numbers.length; i++) {
      do {        
        num = randomInt();
      } while (isDuplicate(num));
      numbers[i] = num;
    }
  }
  
  static void sortNumbers() {
    int temp;
    for (int i = numbers.length; i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }
  
  static void displayNumbers() {
    System.out.println("A szelvényen megjátszható számok: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println("");
  }
  
  public static void main(String[] args) {
    createNumbers();
    sortNumbers();
    displayNumbers();
  }
}
