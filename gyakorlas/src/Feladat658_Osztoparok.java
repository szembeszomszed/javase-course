/**
 * beolvasott szám osztópárjai
 * @author mate
 */
public class Feladat658_Osztoparok {
  public static void main(String[] args) {
    System.out.println("Beolvasott szám osztópárjai.");
    int num = extra.Console.readInt("szám = ");
    while (num <= 0) {
      System.out.println("Hiba: pozitív egész számot adjon meg!");
      num = extra.Console.readInt("szám = ");
    }
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        int d = num / i;
        System.out.println(i + " * " + d);
      }
    }
  }
}
