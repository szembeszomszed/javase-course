public class NéhánySzámÁtlaga1 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám átlaga "+
      "(végjel: 0)");
    final int VÉGJEL=0;
    int db=0, szám;
    double átlag=0;                                     //1
    while((szám=extra.
        Console.readInt(db+1+". szám: "))!=VÉGJEL)
      átlag=(db*átlag+szám)/++db;                       //2
    if(db>0)                                            //3
      System.out.println("A megadott "+db+" szám átlaga "+
        extra.Format.left(átlag, 0 , 3)+".");
    else
      System.out.println("0 darab számnak nincs átlaga.");
  }
}