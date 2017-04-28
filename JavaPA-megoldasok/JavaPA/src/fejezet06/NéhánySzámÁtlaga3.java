public class NéhánySzámÁtlaga3 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám átlaga");
    int db=extra.Console.readInt("Darab (>0): ");
    if(db>=2) {
      int összeg=0;
      for(int i=1; i<=db; i++)
        összeg+=extra.Console.readInt(i+". szám: ");
      double átlag=(double)összeg/db;
      System.out.println("A megadott "+db+" szám átlaga "+
        extra.Format.left(átlag, 0 , 3)+".");
    }
    else
      System.out.println("Legalább 1 számot kell átlagolni!");
  }
}