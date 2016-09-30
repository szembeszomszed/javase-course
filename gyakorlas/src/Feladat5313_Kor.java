/**
 * köre kerülete, területe
 * @author mate
 */
public class Feladat5313_Kor {
  public static void main(String[] args) {
    double radius = extra.Console.readDouble("Adja meg a kör sugarát: ");
    if (radius <= 0) {
      System.out.println("Hiba! A kör sugara nem pozitív.");
    } else {
      double circumference = 2 * radius * Math.PI;
      double area = Math.pow(radius, 2) * Math.PI;
      System.out.println("A kör kerülete: " + circumference + "." +  
              "\nA kör területe: " + area + ".");
    }
  }
}
