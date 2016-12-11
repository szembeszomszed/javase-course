
import java.util.ArrayList;

public class Feladat1369_SzovegekTombje {
  static ArrayList<String> texts = new ArrayList<>(10);
  
  public static void main(String[] args) {
    System.out.println("Írjon be dolgokat! Ha végzett, küldjön be üres szöveget! Maximum 10 szöveg adható meg!");
    int i = 1;
    String input = " ";
    try {
      while (!input.isEmpty()) {
        if (i > 10) {
          throw new RuntimeException("Maximum 10 szövegről volt szó!");
        }
        input = extra.Console.readLine(i + ". szöveg: ");
        texts.add(input);
        i++;
      }
    }
    catch (RuntimeException e) {
      e.printStackTrace();
    }
      
  }
}
