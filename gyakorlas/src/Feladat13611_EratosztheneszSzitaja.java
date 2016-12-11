
import java.util.TreeSet;

public class Feladat13611_EratosztheneszSzitaja {
  static TreeSet<Integer> numbers = new TreeSet<>();
  static TreeSet<Integer> primeNumbers = new TreeSet<>();
  static int max = 1000000;
  
  static void loadNumbers() {
    for (int i = 2; i <= max; i++) {
      numbers.add(i);      
    }
  }
  
  static void selectPrimes() {    
    int number = 0;
    while(number <= Math.sqrt(max)) {
      number = numbers.first();
      primeNumbers.add(number);
      int mult = 1;
      while(number * mult <= max)
        numbers.remove(number * mult++);
    }
    primeNumbers.addAll(numbers);
    System.out.println("A prímszámok 1-től " + max + "-ig:\n" + primeNumbers);
  }
  
  public static void main(String[] args) {
    loadNumbers();
    selectPrimes();
  }  
}
