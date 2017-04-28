public class Háromszög2 {
  public static void main(String[] args) {
    System.out.println("Háromszög megszerkeszthetősége");
    double a=extra.Console.readDouble("'a' oldal: ");
    double b=extra.Console.readDouble("'b' oldal: ");
    double c=extra.Console.readDouble("'c' oldal: ");
    boolean megszerkeszthető=
      a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a;
    if(megszerkeszthető)
      System.out.println("A háromszög megszerkeszthető.");
    else
      System.out.println("A háromszög nem szerkeszthető meg.");
  }
}