
class OutOfRangeException extends RuntimeException {

  OutOfRangeException(String s) {
    super(s);
  }
  
}

public class Feladat1552_BeolvasasHatarokKozott {

  public static int getNumber(int min, int max) {
    boolean ok = false;
    int num = 0;
    while (!ok) {
      try {        
        num = Integer.parseInt(extra.Console.readLine("Szám [" + min + "; " + max + "]: "));
        if (num < min || num > max) {
          throw new OutOfRangeException("Hiba! " + min + " és " + max + " közötti számot várunk.");
        }
        ok = true;
      }      
      catch (OutOfRangeException e) {
        System.out.println(e.getMessage());
      }      
      catch (NumberFormatException e) {
        System.out.println("Illegális karakter!");
      }      
    }
    return num;
  }
  
  public static void main(String[] args) {
    getNumber(2, 4);            
    System.out.println("OK");
  }
}
