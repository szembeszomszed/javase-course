public class HőmérsékletCF {
  public static void main(String[] args) {
    System.out.println("Celsius -> Fahrenheit");
    double c=extra.Console.readDouble("Celsius fok: ");
    double f=c*9/5+32;                                  //1
    System.out.println("Fahrenheit fok: "+f);           //2
  }
}