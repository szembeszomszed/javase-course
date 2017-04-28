public class ElsőfokúEgyenlet2 {
  public static void main(String[] args) {
    System.out.println("a*x+b=0 alakú egyenlet megoldása");
    double a=extra.Console.readInt("a = ");
    if(a==0)
      System.out.println("Az x együtthatója nem lehet nulla!");
    else {
      double b=extra.Console.readInt("b = ");
      System.out.println("A megoldás:  x = "+(-b)/a);
    }
  }
}