public class NéhánySzámMinimuma1 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám közül a legkisebb (végjel: 0)");
    final int VÉGJEL=0;
    int db=0, min=2147483647, szám;
    while((szám=extra.
        Console.readInt((db+1)+". szám: "))!=VÉGJEL) {
      if(szám<min)
        min=szám;
      db++;
    }
    if(db>0)
      System.out.println("A megadott "+db+" szám közül a legkisebb: "+min);
    else
      System.out.println("0 db számnak nincs minimuma.");
  }
}