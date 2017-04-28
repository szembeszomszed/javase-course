public class Háromszög8 {
  public static void main(String[] args) {
    System.out.println("Általános háromszög " +
      "kerülete, területe");
    double a=extra.Console.readDouble("a = "),
      b=extra.Console.readDouble("b = "),
      c=extra.Console.readDouble("c = ");
                       //azonos mértékegységet feltételezve
    if(!((a+b>c) && (a+c>b) && (b+c>a)))                //1
      throw new IllegalArgumentException(               //2
        "A három szakasz nem alkot háromszöget.");
    System.out.println("Kerület: "+(a+b+c));            //3
    double s=(a+b+c)/2,
      terület=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Terület: "+terület);
  }
}