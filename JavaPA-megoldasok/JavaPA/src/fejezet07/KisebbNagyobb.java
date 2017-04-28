public class KisebbNagyobb {

  static void kisebbNagyobb(int szám) {
    System.out.println("A megelőző szám: "+(szám-1));
    System.out.println("A következő szám: "+(szám+1));
  }

  public static void main(String[] args) {
    System.out.println("Melyik a számot megelőző és követő szám?");
    int szám=extra.Console.readInt("Szám: ");
    kisebbNagyobb(szám);
  }
}