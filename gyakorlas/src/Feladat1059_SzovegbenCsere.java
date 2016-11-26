/**
 *
 * @author mate
 */
public class Feladat1059_SzovegbenCsere {
  public static void main(String[] args) {
    String text = null;
    char char1;
    char char2;
    while ((text = extra.Console.readLine("Szöveg: ")).equals("")) {      
      System.out.println("Ennél kicsit hosszabb kéne!");
    }
    char1 = extra.Console.readChar("Cserélendő karakter: ");
    char2 = extra.Console.readChar("Új karakter: ");
    System.out.println("Az új szöveg: " + text.replace(char1, char2));
  }

}
