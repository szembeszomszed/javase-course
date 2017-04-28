public class TriplaSzám2 {
  public static void main(String[] args) {
    System.out.println("Szám háromszorosa");
    double x = extra.Console.readDouble("Szám: ");
    System.out.println("A szám háromszorosa: "+
      extra.Format.left(3*x, 0, 4));
  }
}