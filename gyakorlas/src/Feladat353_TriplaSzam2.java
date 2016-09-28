/**
 * a program 4 tizedesjegyre írja ki a beolvasott valós szám háromszorosát
 * @author mate
 */
public class Feladat353_TriplaSzam2 {
  public static void main(String[] args) {
    double x, tripleX;
    x = extra.Console.readDouble("Adjon meg egy valós számot: ");
    tripleX = x * 3;
    System.out.println("A szám háromszorosa: " + extra.Format.right(tripleX, 0, 4));
  }  
}
