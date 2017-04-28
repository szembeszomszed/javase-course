public class Köszön2 {
  public static void main(String[] args) {
    String vezetékNév=null, keresztNév=null;            //1
    while((vezetékNév=extra.Console.
        readLine("Vezetékneve: ")).equals(""))          //2
      System.out.println("Hiányzó vezetéknév. Újra!");  //3
    while((keresztNév=extra.Console.
        readLine("Keresztneve: ")).equals(""))          //3
      System.out.println("Hiányzó keresztnév. Újra!");
    System.out.println("Üdvözlöm "+vezetékNév+" "+
      keresztNév+"!");                                  //4
  }
}