/**
 * a * x + b = 0 egyenlet megoldása
 * @author mate
 */
public class Feladat462_ElsofokuEgyenlet1 {
  public static void main(String[] args) {
    System.out.println("Egyenletmegoldás jön! a * x + b = 0");
    int a, b;
    double x;
    a = extra.Console.readInt("Adja meg az 'a' értékét: ");
    b = extra.Console.readInt("Adja meg a 'b' értékét: ");
    x = (-1.0 * b) / a;
    System.out.println("Az x értéke: " + x);
  }
}
