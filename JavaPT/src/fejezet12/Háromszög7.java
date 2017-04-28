public class Háromszög7 {
  public static void main(String[] args) {
    System.out.println("Általános háromszög " +
      "kerülete, területe");
    double a=extra.Console.readDouble("a = "),
      b=extra.Console.readDouble("b = "),
      c=extra.Console.readDouble("c = ");
                       //azonos mértékegységet feltételezve
    if((a+b>c) && (a+c>b) && (b+c>a)) {                 //1
      System.out.println("Kerület: "+(a+b+c));
      double s=(a+b+c)/2,
        terület=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Terület: "+terület);
    }
    else                                                //2
      System.out.println("A három szakasz " +
        "nem alkot háromszöget.");
  }
}