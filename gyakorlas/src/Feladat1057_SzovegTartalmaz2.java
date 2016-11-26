/**
 *
 * @author mate
 */
public class Feladat1057_SzovegTartalmaz2 {
  public static void main(String[] args) {
    String text1 = null;
    String text2 = null;
    while ((text1 = extra.Console.readLine("1. szöveg: ")).equals("")) {      
      System.out.println("Ennél kicsit hosszabb kéne!");
    }
    while ((text2 = extra.Console.readLine("2. szöveg: ")).equals("")) {      
      System.out.println("Ennél kicsit hosszabb kéne!");
    }    
    String longText = text1;
    String shortText = text2;
    if (text1.length() < text2.length()) {
      longText = text2;
      shortText = text1;
    }
    System.out.println("A hosszabb szöveg " + (longText.indexOf(shortText) > 0 ? "" : "nem ") + "tartalmazza a rövidebb szöveget.");
  }
}
