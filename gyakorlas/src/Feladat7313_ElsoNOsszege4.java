/**
 * 1-től n-ig számok összeadva rekurzív függvénnyel
 * @author mate
 */
public class Feladat7313_ElsoNOsszege4 {
  static int sumOfNumbers(int n) {
    int sum = n;
    if (n > 1) {
      sum += sumOfNumbers(n - 1);
    }
    return sum;
  }
  
  public static void main(String[] args) {
    System.out.println("Számok összege 1-től n-ig");
    int n;
    do {      
      n = extra.Console.readInt("n = ");
      if (n < 1) {
        System.out.println("Pozitív számot adjon meg!");
      }
    } while (n < 1);
    System.out.println(sumOfNumbers(n));
  }
}
