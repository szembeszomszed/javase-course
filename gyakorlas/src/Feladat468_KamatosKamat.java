/**
 * bekért adatok alapján kamatos kamat számítása
 * @author mate
 */
public class Feladat468_KamatosKamat {
  public static void main(String[] args) {
    System.out.println("Kamatos kamat számítása!");
    int betet = extra.Console.readInt("Betét: ");
    int futamido = extra.Console.readInt("Futamidő: ");
    double kamatlab = extra.Console.readDouble("Éves kamatláb: ");
    double novekmeny = 1 + kamatlab / (double) 100;
    double ertek = betet * Math.pow(novekmeny, futamido);
    System.out.println("A kamatos kamattal növelt érték a futamidő végére: " + ertek);
  }
}
