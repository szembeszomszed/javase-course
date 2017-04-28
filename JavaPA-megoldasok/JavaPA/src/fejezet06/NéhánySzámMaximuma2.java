public class NéhánySzámMaximuma2 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám közül a legnagyobb (végjel: 0)");
    final int VÉGJEL=0;
    int db=0, max=-2147483648, szám;
    do {
      szám=extra.Console.readInt(db+1+". szám: ");
      if(szám!=VÉGJEL)
        if(szám>max)
          max=szám;
        db++;
    } while(szám!=VÉGJEL);
    if(db>0)
      System.out.println("A megadott "+db+" szám közül a legnagyobb: "+max);
    else
      System.out.println("0 db számnak nincs maximuma.");
  }
}