/**
 * számot megelőző és követő szám kiíratása
 * @author mate
 */
public class Feladat7314_KisebbNagyobb {
  static void numbers(int num) {
    int numLeft = num - 1;
    int numRight = num + 1;
    System.out.println("A megelőző szám: " + numLeft);
    System.out.println("A következő szám: " + numRight);    
  }
  
  public static void main(String[] args) {
    int num = extra.Console.readInt("Szám: ");
    numbers(num);
  }
}
