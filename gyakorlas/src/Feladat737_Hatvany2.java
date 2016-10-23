/**
 * egész szám egész kitevős hatványra emelése
 * @author mate
 */
public class Feladat737_Hatvany2 {
  static long powerIt1(int base, int power) {
    return (long) Math.pow(base, power);
  }
  static long powerIt2(int base, int power) {
    int result = base;
    for (int i = 1; i < power; i++) {
      result *= base;
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(powerIt1(5, 4));
    System.out.println(powerIt2(5, 4));
  }
}
