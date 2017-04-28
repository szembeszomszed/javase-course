public class KétSzámKözöttiEgészek1 {

  static void kétSzámKözöttiEgészek(int a, int b) {
    System.out.println("Egész számok "+a+" és "+b+" között: ");
    for(int i=a; i<=b; i++)
      System.out.print(i+", ");
    System.out.println();
  }

  public static void main(String[] args) {
    kétSzámKözöttiEgészek(100, 112);
  }
}