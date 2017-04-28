public class SzövegÁtlósan {
  public static void main(String[] args) {
    System.out.println("Szöveg kiírása karakterenként átlósan");
    String szöveg=extra.Console.readLine("Szöveg: ");
    if(!szöveg.equals("")) {
      System.out.println("\nJobbra:");
      for(int i=0; i<szöveg.length(); i++) {
        for(int j=0; j<i; j++)
          System.out.print("  ");
        System.out.println(szöveg.charAt(i));
      }
      System.out.println("\nBalra:");
      for(int i=0; i<szöveg.length(); i++) {
        for(int j=0; j<szöveg.length()-i-1; j++)
          System.out.print("  ");
        System.out.println(szöveg.charAt(i));
      }
    }
    else
      System.out.println("Hiba: üres szöveg!");
  }
}