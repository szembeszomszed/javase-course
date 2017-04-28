import java.util.Vector;

public class SzövegekVektora {
  public static void main(String[] args) {
    final int maxDb=3;
    Vector<String> szövegVektor=new Vector<String>(maxDb);
    System.out.println("Szövegek beolvasása (üres végjel, vagy legfeljebb 10 db)");
    boolean mégFérVagyVége=true;
    int db=0;
    String s;
    while(mégFérVagyVége)
      try {
        s=extra.Console.readLine((db+1)+". szöveg: ");
        if(!s.equals("")) {
          szövegVektor.add(s);
          db++;
          if(szövegVektor.size()==maxDb)
            throw new RuntimeException("Most telt be a vektor.");
        }
        else
          mégFérVagyVége=false;
      }
      catch(RuntimeException e) {
        mégFérVagyVége=false;
      }
    System.out.println();
    if(db==0)
      System.out.println("Nincs beolvasott szöveg.");
    else {
      System.out.println("A beolvasott szöveg(ek):\n"+
        szövegVektor);
    }
  }
}