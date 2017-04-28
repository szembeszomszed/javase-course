public class Pozitív1 {
  public static void main(String[] args) {
    System.out.println("Pozitív-e a megadott szám?");
    int szám = extra.Console.readInt("Szám: ");
    if(szám>0)                                          //1
      System.out.println("A szám pozitív.");            //2
  }
}