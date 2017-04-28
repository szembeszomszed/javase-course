public class LogikaiÉrték2 {
  public static void main(String[] args) {
    System.out.println("Pozitív-e a szám?");
    double szám = extra.Console.readDouble("Szám: ");
    boolean pozitív_e = szám>0;                         //1
    System.out.println("A szám pozitív? "+pozitív_e);
  }
}