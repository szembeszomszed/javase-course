public class PárosPáratlan {
  public static void main(String[] args) {
    System.out.println("Páros vagy páratlan");
    int szám = extra.Console.readInt("Szám: ");
    System.out.println("A szám pár"+((szám%2==0)?"os":"atlan")+".");
  }
}