public class KétSzámKözöttiEgészek2 {

  static void kétSzámKözöttiEgészek(int a, int b) {
    System.out.println("Egész számok "+a+" és "+b+" között: ");
    if(a<=b) {
      for(int i=a; i<=b; i++)
        System.out.print(i+", ");
      System.out.println();
    }
    else
      System.out.println("A határok nem megfelelőek!");
  }

  public static void main(String[] args) {
    kétSzámKözöttiEgészek(100, 112);
    kétSzámKözöttiEgészek(120, 112);
  }
}