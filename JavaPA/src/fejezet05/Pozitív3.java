public class Pozitív3 {
  public static void main(String[] args) {
    System.out.println("Pozitív-e a megadott szám?");
    int szám = extra.Console.readInt("Szám: ");
    System.out.println(
      "A szám "+((szám>0)?"pozitív.":"nem pozitív."));  //1
  }
}
