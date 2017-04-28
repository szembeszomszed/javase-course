public class Háromszög6 {
  public static void main(String[] args) {
    System.out.println("Általános háromszög " +
      "kerülete, területe");
    double a=extra.Console.readDouble("a = "),
      b=extra.Console.readDouble("b = "),
      c=extra.Console.readDouble("c = ");
                       //azonos mértékegységet feltételezve
    System.out.println("Kerület: "+(a+b+c));
    double s=(a+b+c)/2,                                 //1
      terület=Math.sqrt(s*(s-a)*(s-b)*(s-c));           //2
    System.out.println("Terület: "+terület);
  }
}