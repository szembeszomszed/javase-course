/**
 *
 * @author mate
 */
public class Feladat1056_SzovegTartalmaz1 {
  public static void main(String[] args) {
    String text1 = null;
    String text2 = null;
    while ((text1 = extra.Console.readLine("1. szöveg: ")).equals("")) {      
      System.out.println("Ennél kicsit hosszabb kéne!");
    }
    while ((text2 = extra.Console.readLine("2. szöveg: ")).equals("")) {      
      System.out.println("Ennél kicsit hosszabb kéne!");
    }
    System.out.println("Az első szöveg " + (text1.indexOf(text2) > 0 ? "" : "nem ") + "tartalmazza a második szöveget.");
  }
}
