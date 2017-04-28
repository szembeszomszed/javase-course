public class ElsőfokúEgyenlet1 {
  public static void main(String[] args) {
    System.out.println("a*x+b=0 alakú egyenlet megoldása");
    int a = extra.Console.readInt("a = ");
    int b = extra.Console.readInt("b = ");
    double x = (-1.0*b)/a;
    System.out.println("A megoldás: x = "+x);
  }
}