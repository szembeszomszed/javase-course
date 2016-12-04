
import java.util.ArrayList;
import java.util.Collections;

public class Feladat1363_Hatoslotto3 {

  static ArrayList<Integer> numbers = new ArrayList<>(45);
  static ArrayList<Integer> selectedNumbers = new ArrayList<>(6);

  static void loadNumbers() {
    for (int i = 1; i <= 45; i++) {
      numbers.add(i);
    }
  }

  static int randomInt() {
    int number = (int) (Math.random() * 45 + 1);
    return number;
  }

  static void selectNumbers() {
    while (selectedNumbers.size() < 6) {
      int number = randomInt();
      if (!selectedNumbers.contains(number)) {
        selectedNumbers.add(number);
        for (int i = numbers.size() - 1; i > 0; i--) {
          if (numbers.get(i) == number) {
            numbers.remove(i);
          }
        }
      }
    }
  }
  
  static void sortNumbers() {
    Collections.sort(selectedNumbers);
  }

  public static void main(String[] args) {
    loadNumbers();
    selectNumbers();
    System.out.println("A megjátszható számok a megjátszott számok nélkül: " + numbers);
    System.out.println("A megjátszott számok: " + selectedNumbers);
    sortNumbers();
    System.out.println("A megjátszott számok sorba rendezve: " + selectedNumbers);
    
  }
}
