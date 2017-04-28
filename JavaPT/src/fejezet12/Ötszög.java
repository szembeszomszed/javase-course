public class Ötszög {
  public static void main(String[] args) {
    System.out.println("Ötszög kerülete, területe");
    double a=extra.Console.readDouble("Ötszög oldalának hossza: ");
    if (a<=0)
      throw new RuntimeException("Az ötszög oldala nem pozitív.");
    double kerulet=5*a;
    double terulet=(5*a*a*Math.tan(Math.toRadians(54)))/4;
    System.out.println("Az ötszög kerülete: "+kerulet+
                      "\nAz ötszög területe: "+terulet);
  }
}