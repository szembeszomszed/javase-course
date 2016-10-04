/**
 * soronkénti csillagok, kettesével növekedve
 * @author mate
 */
public class Feladat6514_CsillagHaromszog {
  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      System.out.println("");
      for (int j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
    }
  }
}
