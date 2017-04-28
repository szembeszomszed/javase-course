public class NéhánySzámÖsszege1 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám összege "+
      "(végjel: 0)");
    final int VÉGJEL=0;                                 //1
    int db=0, összeg=0, szám;                           //2
    while((szám=extra.
        Console.readInt((db+1)+". szám: "))!=VÉGJEL) {  //3
      összeg+=szám;
      db++;
    }  
    System.out.println("A megadott "+db+
      " szám összege "+összeg+".");
  }
}