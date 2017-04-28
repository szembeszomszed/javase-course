public class NéhánySzámÖsszege2 {
  public static void main(String[] args) {
    final int VÉGJEL=0;
    int db=0, összeg=0, szám;
    do {
      szám=extra.Console.readInt((db+1)+". szám: ");
      if(szám!=VÉGJEL) {
        összeg+=szám;
        db++;
      }
    } while(szám!=VÉGJEL);
    System.out.println("A megadott "+db+
      " szám összege "+összeg+".");
  }
}