public class Kör {
  public static void main(String[] args) {
    System.out.println("Kör kerülete, területe");
    double r=extra.Console.readInt("A kör sugara: ");
    if(r>0)
      System.out.println("A kör kerülete: "+2*r*Math.PI+
                         ", területe: "+r*r*Math.PI+".");
    else
      System.out.println("Hiba: a kör sugara nem pozitív!");
  }
}