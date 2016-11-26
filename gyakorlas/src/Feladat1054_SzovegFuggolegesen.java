/**
 * beolvasott szöveg betűi soronként, függőlegesen kiírva
 * @author mate
 */
public class Feladat1054_SzovegFuggolegesen {
  public static void main(String[] args) {
    String text = null;
    while ((text = extra.Console.readLine("Írjon be valamit: ")).equals("")) {
      System.out.println("Ez így kevés...");
    }
      System.out.println("");
    for (int i = 0; i < text.length(); i++) {
      System.out.println(text.charAt(i));      
    }
  } 
}
