/**
 * Karakter bekérése, majd háromszor egymás után történő kiírása
 * @author mate
 */
public class Feladat354_EgyKarakter2 {
  public static void main(String[] args) {
    char x;
    x = extra.Console.readChar("Adjon meg egy karaktert: ");
    System.out.println("Íme a megadott karakter egymás után háromszor: " + x + x + x);
  }
}
