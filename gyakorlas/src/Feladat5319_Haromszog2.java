/**
 * bekért adatok alapján háromszög szerkeszthető-e
 * @author mate
 */
public class Feladat5319_Haromszog2 {
  public static void main(String[] args) {
    System.out.println("Megszerkeszthető-e a háromszög?");
    double a = extra.Console.readDouble("a = ");
    double b = extra.Console.readDouble("b = ");
    double c = extra.Console.readDouble("c = ");
    if ((a + b) > c && (a + c) > b && (b + c) > a)
      System.out.println("A háromszög megszerkeszthető.");
    else
      System.out.println("A háromszög nem szerkeszthető meg.");
  }
}
