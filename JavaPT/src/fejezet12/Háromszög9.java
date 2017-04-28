public class Háromszög9 {

  static double a, b, c;

  static void beolvas() {
    a=extra.Console.readDouble("'a' oldal: ");
    b=extra.Console.readDouble("'b' oldal: ");
    c=extra.Console.readDouble("'c' oldal: ");
  }

  static boolean megszerkeszthető() {
    return (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a);
  }

  public static void main(String[] args) {
    System.out.println("A háromszög köré írható körének sugara");
    beolvas();
    if (megszerkeszthető()) {
      System.out.println("A három szakasz háromszöget alkot.");
      double s=(a+b+c)/2;
      double terület=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      double sugár=(a*b*c)/(4*terület);
      System.out.println("A háromszög köré írható körének sugara: "+sugár);
    }
    else
      throw new IllegalArgumentException("A három szakasz nem alkot háromszöget.");
  }
}