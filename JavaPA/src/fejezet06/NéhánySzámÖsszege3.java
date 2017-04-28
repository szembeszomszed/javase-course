public class NéhánySzámÖsszege3 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám összege");
    int db=extra.Console.readInt("Darab (>0): ");
    if(db>=2) {
      int összeg=0;
      for(int i=1; i<=db; i++)
        összeg+=extra.Console.readInt(i+". szám: ");
      System.out.println("A megadott "+db+
        " szám összege "+összeg+".");
    }
    else
      System.out.println("Legalább 1 számot kell összegezni!");
  }
}