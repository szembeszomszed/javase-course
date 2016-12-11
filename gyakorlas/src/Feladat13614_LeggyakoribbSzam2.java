
import java.util.ArrayList;

public class Feladat13614_LeggyakoribbSzam2 {

  static ArrayList<Integer> numbers = new ArrayList<>(300);
  static ArrayList<Integer> counter = new ArrayList<>(101);

  static int randomInt() {
    int num = (int) (Math.random() * 101 - 50);
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
      int key = element + 50;
      counter.set(key, counter.get(key) + 1);
    }
  }

  static void getMaximum() {
    int max = counter.get(0);
    int maxIndex = 0;

    for (int i = 0; i < counter.size(); i++) {
      if (counter.get(i) > max) {
        max = counter.get(i);
        maxIndex = i;
      }
    }
    System.out.println("A leggyakrabban előforduló elem: " + (maxIndex - 50) + ", melynek darabszáma: " + max + ".");
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
    loadNumbers(300, true, numbers);
    loadNumbers(101, false, counter);
    displayList(numbers, "A véletlenszámok: ");
    countOccurence();
    getMaximum();
  }
}
