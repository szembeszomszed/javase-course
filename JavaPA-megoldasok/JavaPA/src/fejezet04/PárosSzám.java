public class PárosSzám {
  public static void main(String[] args) {
    System.out.println("Páros-e a szám?");
    int szám = extra.Console.readInt("Szám: ");
    boolean páros_e = szám%2==0;                        //1
    System.out.println("Páros-e? "+páros_e);
  }
}