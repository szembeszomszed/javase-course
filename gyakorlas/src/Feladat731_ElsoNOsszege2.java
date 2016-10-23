/**
 * számok 1-től n-ig összeadva
 * @author mate
 */
public class Feladat731_ElsoNOsszege2 {
  public static long sum (int n) {
    return n * (n + 1) / 2;
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
