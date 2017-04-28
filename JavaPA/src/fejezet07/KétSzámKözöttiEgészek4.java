public class KétSzámKözöttiEgészek4 {

  static void kétSzámKözöttiEgészek(int a, int b) {
    System.out.println("Egész számok "+a+" és "+b+" között: ");
    for(int i=Math.min(a, b); i<=Math.max(a, b); i++)
      System.out.print(i+", ");
    System.out.println();
  }

  public static void main(String[] args) {
    kétSzámKözöttiEgészek(100, 112);
    kétSzámKözöttiEgészek(120, 112);
  }
}