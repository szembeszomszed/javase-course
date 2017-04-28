public class Háromszög1 {
  public static void main(String[] args) {
    System.out.println("Egyenlő oldalú háromszög kerülete, területe");
    int a=extra.Console.readInt("A háromszög oldala: ");
    if(a>0)
      System.out.println("A háromszög kerülete: "+3*a+
                         ", területe: "+a*a*Math.sqrt(3)/4+".");
    else
      System.out.println("Hiba: a háromszög területe nem pozitív!");
  }
}