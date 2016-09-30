/**
 * Fibonacci-sorozat első 80 tagja sorszámozva
 * @author mate
 */
public class Feladat654_FibonacciSorozat2 {
  public static void main(String[] args) {
    long a = 0, b = 1, c;
    for (int i = 1; i <= 80; i++) {
      c = a + b;
      System.out.println(i + ". " + c);
      b = a;
      a = c;
    }
  }
}
