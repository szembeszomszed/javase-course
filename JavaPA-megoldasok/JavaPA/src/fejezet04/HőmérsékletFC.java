public class HőmérsékletFC {
  public static void main(String[] args) {
    System.out.println("Fahrenheit -> Celsius");
    double f=extra.Console.readDouble("Fahrenheit fok: ");
    double c=(f-32)*5/9;                                //1
    System.out.println("Celsius fok: "+c);
  }
}