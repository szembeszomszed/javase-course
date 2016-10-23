/**
 * számok 1-től n-ig ciklussal
 * @author mate
 */
public class Feladat732_ElsoNOsszege3 {
    static long sum (int n) {
      long sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += i;
      }
      return sum;
  }
  
  public static void main(String[] args) {
    System.out.println("Számok összege 1-től n-ig");
    boolean ok;
    int userInput;
    do {      
      userInput = extra.Console.readInt("n = ");
      ok = userInput > 1;
      if (!ok) {
        System.out.println("A szám legyen nagyobb 1-nél!");
      }      
    } while (!ok);
    System.out.println("A számok összege 1-től " + userInput + "-ig: " + sum(userInput));
  }
}
