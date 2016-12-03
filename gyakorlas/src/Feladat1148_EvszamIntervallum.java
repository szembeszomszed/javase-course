
import java.util.ArrayList;

/**
 *
 * @author mate
 */
public class Feladat1148_EvszamIntervallum {
  public static ArrayList<Integer> getYears() {
    System.out.println("Adjon meg évszámokat! Ha már nem óhajt többet, írjon egy 0-t!");
    int input;
    int i = 0;
    ArrayList<Integer> years = new ArrayList<>(); 
    do {
      input = extra.Console.readInt("Évszám: ");
      if (input != 0) {
        years.add(input);
      }
    } while (input != 0);
    return years;
  }
  
  public static void displayYears(ArrayList<Integer> years, String message) {
    System.out.println(message);
    for (int year : years) {
      System.out.print(year + " ");
    }
    System.out.println("");
  }
  
  public static ArrayList<Integer> sortYears(ArrayList<Integer> years) {
    int temp;
    for (int i = years.size(); i > 0; i--) {
      for (int j = 0; j < i - 1; j++) {
        if (years.get(j) > years.get(j + 1)) {
          temp = years.get(j);
          years.set(j, years.get(j + 1));
          years.set(j + 1, temp);
        }
      }
    }    
    return years;
  }
  
  public static void groupYears(ArrayList<Integer> years) {
    int min = years.get(0);
    int max = years.get(years.size() - 1);
    System.out.println("A legkisebb évszám: " + min + "\nA legnagyobb évszám: " + max);
    int length = (max - min) / 4;
    int[] frameArray={min, min + length, min + 2 * length, min + 3 * length, max + 1};
    int year = 0;
    for (int i = 1; i <= 4; i++) {
      System.out.println(frameArray[i - 1] + " és " + (frameArray[i] - 1) + " közé eső évszámok " );
      while ((year < years.size() && years.get(year) < frameArray[i])) {
        System.out.print(years.get(year++) + " ");
      }
      System.out.println("");
    }
  }
  
  public static void main(String[] args) {
    ArrayList<Integer> years = getYears();
    displayYears(years, "A megadott évszámok: ");
    sortYears(years);
    displayYears(years, "A megadott évszámok növekvő sorrendben: ");
    groupYears(years);
  }
  
}
