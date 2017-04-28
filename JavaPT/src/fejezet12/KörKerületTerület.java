class Kör {

  public Kör(double r) {
    if(r<=0)
      throw new IllegalArgumentException(
        "Hiba! 'r'= "+r+" Nem pozitív!");
    System.out.println("A kör kerülete: "+2*r*Math.PI+
                         ", területe: "+r*r*Math.PI+".");
  }
}

public class KörKerületTerület {
  public static void main(String[] args) {
    new Kör(12);
    new Kör(-7.5);
  }
}