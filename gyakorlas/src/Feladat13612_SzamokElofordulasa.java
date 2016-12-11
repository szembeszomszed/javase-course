
import java.util.ArrayList;

public class Feladat13612_SzamokElofordulasa {
  static ArrayList<Integer> numbers = new ArrayList<>(500);
  static ArrayList<Integer> counter = new ArrayList<>(90);
  
  static int randomInt() {
    int num = (int) (Math.random() * 90 + 10);
    return num;
  }
  
  static void loadNumbers(int max, boolean randomize, ArrayList<Integer> al) {
    for (int i = 0; i < max; i++) {
      if (randomize) {
        al.add(randomInt()); 
      } else {
        al.add(0);
      }
    }
  }
  
  static void displayList(ArrayList<Integer> al, String message) {
    System.out.println(message + "\n" + al);
  }
  
  
  static void countOccurence() {
    for (Integer element : numbers) {
      int key = element - 10;
      counter.set(key, counter.get(key) + 1);
    }
  }
  
  static void displayOccurence() {
    int countedNum = 10;
    for (Integer element : counter) {
      System.out.print(countedNum + ": " + element + ", ");
      countedNum++;
    }
  }
  
  static int countSpecificElement(int num) {
    int count = 0;
    for (Integer element : numbers) {
      if (element == num) {
        count++;
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
    loadNumbers(500, true, numbers);
    displayList(numbers, "A generált számok:");    
    loadNumbers(90, false, counter);
    countOccurence();
    displayOccurence();
    System.out.println(countSpecificElement(12));    
  }
}
