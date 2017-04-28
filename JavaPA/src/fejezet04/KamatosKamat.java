public class KamatosKamat {
  public static void main(String[] args) {
    System.out.println("Kamatos kamat kiszámítása");
    int betét=extra.Console.readInt("Betett összeg (Ft): ");
    int futamidő=extra.Console.readInt("Futamidő (év): ");
    double kamatláb=extra.Console.readDouble("Kamatláb (%): ");
    double kivét=betét*Math.pow(1+kamatláb/100, futamidő);
    System.out.println("A futamidő végén kivehető összeg (Ft): "+
      extra.Format.left(kivét, 0, 0));
  }
}