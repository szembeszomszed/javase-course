public class MásodfokúEgyenlet1 {
  public static void main(String[] args) {
    System.out.println("Másodfokú egyenlet megoldása (a*x^2+b*x+c=0, a!=0)");
    double a=extra.Console.readDouble("a = ");
    if(a==0)                                  //ha lineáris
      System.out.println("Az egyenlet nem másodfokú!");
    else {                                   //ha másodfokú
      double b=extra.Console.readDouble("b = "),
        c=extra.Console.readDouble("c = "),
        d=b*b-4*a*c;
      if(d>0) {                       //pl.: a=2, b=3, c=-5
        double x1=((-1)*b+Math.sqrt(d))/(2*a),
          x2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("Két valós gyök: x1 = "+x1+" és x2 = "+x2);
      }
      if(d==0) {                       //pl.: a=2, b=4, c=2
        double x=(-b)/(2*a);
        System.out.println("Egy valós gyök: x = "+x);
      }
      if(d<0)                          //pl.: a=1, b=2, c=2
        System.out.println("Nincs valós gyök.");
    }
  }
}