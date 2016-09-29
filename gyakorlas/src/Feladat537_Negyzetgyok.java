/**
 * bekért valós szám négyzetgyöke
 * @author mate
 */
public class Feladat537_Negyzetgyok {
  public static void main(String[] args) {
    double num = extra.Console.readDouble("Adjon meg egy valós számot, amiből négyzetgyököt vonhatunk: ");
    if (num >= 0) {
      double squareRoot = Math.sqrt(num);
      System.out.println(num + " négyzetgyöke: " + squareRoot);
    } else {
      System.out.println("Hibás adat. Negatív számból nem vonunk gyököt.");
    }
  }
}
