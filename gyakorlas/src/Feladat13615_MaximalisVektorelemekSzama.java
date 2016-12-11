
import java.util.ArrayList;

public class Feladat13615_MaximalisVektorelemekSzama {

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

  static void countBiggestItem() {
    int i = counter.size() - 1;
    int biggestItem = i;
    int numberOfOccurence = counter.get(i);
    while (counter.get(i) == 0) {
      i--;
      biggestItem = i;
      numberOfOccurence = counter.get(i);
    }
    System.out.println("A legnagyobb elem: " + (biggestItem - 50) + ", melyből " + numberOfOccurence + " darab van.");    
  }
  
  public static void main(String[] args) {
    loadNumbers(300, true, numbers);
    loadNumbers(101, false, counter);
    displayList(numbers, "A véletlenszámok: ");
    countOccurence();
    countBiggestItem();
  }
}
