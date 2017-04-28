public class SzövegTartalmaz1 {
  public static void main(String[] args) {
    System.out.println("Az 1. szöveg tartalmazza-e a 2. szöveget?");
    String szöveg1=extra.Console.readLine("1. szöveg: ");
    String szöveg2=extra.Console.readLine("2. szöveg: ");
    System.out.println((szöveg1.indexOf(szöveg2)>=0)?"Igen.":"Nem.");
  }
}