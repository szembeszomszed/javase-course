public class SzövegFüggőlegesen {
  public static void main(String[] args) {
    System.out.println("Szöveg kiírása karakterenként függőlegesen");
    String szöveg=extra.Console.readLine("Szöveg: ");
    if(!szöveg.equals(""))
      for(int i=0; i<szöveg.length(); i++)
        System.out.println(szöveg.charAt(i));
    else
      System.out.println("Hiba: üres szöveg!");
  }
}