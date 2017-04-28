public class NéhánySzámMaximuma1 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám "+
      "közül a legnagyobb (végjel: 0)");
    final int VÉGJEL=0;
    int db=0, max=-2147483648, szám;                    //1
    while((szám=extra.
        Console.readInt((db+1)+". szám: "))!=VÉGJEL) {
      if(szám>max)                                      //2
        max=szám;                                       //3
      db++;
    }
    if(db>0)
      System.out.println("A megadott "+db+
        " szám közül a legnagyobb: "+max);              //4
    else
      System.out.println("0 db számnak nincs maximuma.");
  }
}