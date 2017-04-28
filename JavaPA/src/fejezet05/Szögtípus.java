public class Szögtípus {
  public static void main(String[] args) {
    System.out.println("Szög típusa");
    double fok=extra.Console.readDouble(
      "Szög mértéke (fokban 0-tól 360-ig): ");
    if(fok>=0 && fok<=360) {
      if(fok==0)
        System.out.println("Nullszög.");
      else if(fok<90)
        System.out.println("Hegyesszög.");
      else if(fok==90)
        System.out.println("Derékszög.");
      else if(fok<180)
        System.out.println("Tompaszög.");
      else if(fok==180)
        System.out.println("Egyenesszög");
      else if(fok<360)
	System.out.println("Homorúszög.");
      else //if(fok==360
	System.out.println("Teljesszög.");
    }
    else
      System.out.println("Hiba: a szögnek 0 és 360 közé kell esnie!");
  }
}