/**
 * két szám közötti prímek kiíratása
 * @author mate
 */
public class Feladat7315_KetSzamKozottiPrimek {
  static boolean isPrime (int n) {
    if (n < 1) {
      return false;
    }
    int numOfDivs = 1;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        numOfDivs++;
      }
    }
    return (numOfDivs == 1);
  }
  
  static void allPrimes(int n1, int n2) {
    for (int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Két szám közti prímek.");
    int num1 = extra.Console.readInt("Szám1: ");
    int num2 = extra.Console.readInt("Szám2: ");
    allPrimes(num1, num2);
    System.out.println(0.1 * 10);
    System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
  }
}
