public class PárosPáratlanÖsszegDb {
  public static void main(String[] args) {
    System.out.println("Páros és páratlan számok összege és száma egy intervallumban");
    int a=extra.Console.readInt("Alsó határ: ");
    int b=extra.Console.readInt("Felső határ: ");
    if(b>=a) {
      int párosDb=0, párosÖsszeg=0,
        páratlanDb=0, páratlanÖsszeg=0;
      for(int i=a; i<=b; i++) {
        if(i%2==0) { //páros
          párosDb++;
          párosÖsszeg+=i;
        }
        else { //páratlan
          páratlanDb++;
          páratlanÖsszeg+=i;
        }  
      }
      System.out.println("Intervallum: ["+a+";"+b+"]\n"+
        "  párosak száma: "+párosDb+
        ", párosak összege: "+párosÖsszeg+"\n"+
        "  páratlanok száma: "+páratlanDb+
        ", páratlanok összege: "+páratlanÖsszeg);
    }
    else
      System.out.println("Hibás intervallum határok!");
  }
}