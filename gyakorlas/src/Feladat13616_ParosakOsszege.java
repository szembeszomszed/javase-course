
import java.util.ArrayList;

public class Feladat13616_ParosakOsszege {
  public static void main(String[] args) {
   ArrayList<Integer> numbers = new ArrayList<>(300);
   int sumOfEvens = 0;
    for (int i = 0; i < 300; i++) {
      numbers.add((int) (Math.random() * 101 - 50));
    }
    
    System.out.println("A véletlenszámok: " + numbers);
    
    for (Integer element : numbers) {
      if (element % 2 == 0) {
        sumOfEvens += element;
      }
    }
    
    System.out.println("A páros számok összege: " + sumOfEvens + ".");
  }
}
