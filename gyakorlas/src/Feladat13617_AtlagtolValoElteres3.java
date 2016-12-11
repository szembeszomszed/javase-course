

import java.util.ArrayList;

public class Feladat13617_AtlagtolValoElteres3 {
  static final int N = 20;
  static ArrayList<Integer> numbers = new ArrayList<>(N);

  public static void loadNumbers() {
    for (int i = 0; i < N; i++) {
      numbers.add((int) (Math.random() * 90 + 10));
    }
  }

  public static void sortNumbers() {
    int temp;
    for (int i = numbers.size() - 1; i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (numbers.get(j) > numbers.get(j + 1)) {
          temp = numbers.get(j);
          numbers.set(j, numbers.get(j + 1));
          numbers.set(j + 1, temp);
        }
      }
    }
  }

  public static void getNumbers() {
    int sum = 0;
    int average;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    average = sum / N;
    int difference = average / 5;
    int min = average - difference;
    int max = average + difference;
    int count = 0;
    
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) >= min && numbers.get(i) <= max) {
        count++;
      }      
    }
    System.out.println("Az elemek átlaga: " + average + ".\nAz átlag 20 százaléka: " + difference + "\nAz átlagtól legfeljebb 20 százalékkal eltérő elemek száma: " + count + ".");    
  }

  public static void displayArray(ArrayList<Integer> al, String message) {
    System.out.println(message + ":");
    System.out.println(al);
  }

  public static void main(String[] args) {
    loadNumbers();
    displayArray(numbers, "rendezetlen számok");
    sortNumbers();
    displayArray(numbers, "rendezett számok");
    getNumbers();
  }
}
