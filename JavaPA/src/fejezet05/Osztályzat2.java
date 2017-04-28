public class Osztályzat2 {
  public static void main(String[] args) {
    System.out.println("Osztályzat számmal -> "+
      "Osztályzat szöveggel");
    int osztályzat = extra.Console.readInt("Osztályzat: ");
    System.out.print("Szöveges értékelés: ");
    switch(osztályzat) {                                //1
      case 1: System.out.println("elégtelen"); break;
      case 2: System.out.println("elégséges"); break;   //2
      case 3: System.out.println("közepes"); break;
      case 4: System.out.println("jó"); break;
      case 5: System.out.println("jeles"); break;
      default:                                          //3
        System.out.println("érvénytelen osztályzat!");
    }
  }
}