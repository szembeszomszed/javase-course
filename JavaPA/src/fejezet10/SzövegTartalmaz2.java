public class SzövegTartalmaz2 {
  public static void main(String[] args) {
    System.out.println("A hoszabb szöveg tartalmazza-e a rövidebb szöveget?");
    String szöveg1=extra.Console.readLine("1. szöveg: ");
    String szöveg2=extra.Console.readLine("2. szöveg: ");
    if(szöveg1.length()>=szöveg2.length())
      System.out.println((szöveg1.indexOf(szöveg2)>=0)?"Igen.":"Nem.");
    else
      System.out.println((szöveg2.indexOf(szöveg1)>=0)?"Igen.":"Nem.");
  }
}