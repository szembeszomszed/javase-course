/**
 * két beolvasott szám közti páros és páratlan számok összege és darabszáma
 * @author mate
 */
public class Feladat6519_ParosParatlanOsszegDarab {
  public static void main(String[] args) {
    System.out.println("Két szám közti páros és páratlan számok összege és darabszáma.");
    int a = extra.Console.readInt("a = ");
    int b = extra.Console.readInt("b = ");
    int sumEven = 0;
    int countEven = 0;
    int sumOdd = 0;
    int countOdd = 0;
    if (a > b) {
      int c = a;
      a = b;
      b = c;
    }
    for (int i = a; i <= b; i++) {
      if (i % 2 == 0) {
        sumEven += i;
        countEven++;
      } else {
        sumOdd += i;
        countOdd++;        
      }
    }
    System.out.println(a + " és " + b + " között " + "\n" + countEven + " páros szám van, melyeknek összege: " + sumEven + "\n" + countOdd + " páratlan szám van, melyeknek összege: " + sumOdd);
  }
}
