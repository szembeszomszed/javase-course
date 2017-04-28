class Négyzet {

  public Négyzet(double a) {
    if(a<=0)
      throw new IllegalArgumentException(
        "Hiba! 'a'= "+a+" Nem pozitív!");
    System.out.println("A négyzet kerülete: "+4*a+
      ", területe: "+a*a+".");
  }
}

public class NégyzetKerületTerület {
  public static void main(String[] args) {
    try {
      new Négyzet(12);
      new Négyzet(-7.5);
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}