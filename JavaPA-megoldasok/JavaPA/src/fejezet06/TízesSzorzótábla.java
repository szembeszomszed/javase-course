public class TízesSzorzótábla {
  public static void main(String[] args) {
    System.out.println(
      "Tízes szorzótábla\n"+
      "   |   1   2   3   4   5   6   7   8   9  10\n"+
      "--------------------------------------------");
    for(int i=1; i<=10; i++) {
      System.out.print(extra.Format.right(i, 2)+" |");
      for(int j=1; j<=10; j++)
        System.out.print(extra.Format.right(i*j, 4));
      System.out.println();
    }
  }
}