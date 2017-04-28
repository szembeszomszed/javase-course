public class SzövegekTömbje {
  public static void main(String[] args) {
    String[] szövegTömb=new String[10];
    System.out.println("Szövegek beolvasása (üres végjel, vagy legfeljebb "+szövegTömb.length+" db)");
    boolean mégFérVagyVége=true;
    int db=0;
    String s;
    while(mégFérVagyVége)
      try {
        s=extra.Console.readLine((db+1)+". szöveg: ");
        if(!s.equals("")) {
          szövegTömb[db++]=s;
          if(db==szövegTömb.length)
            throw new RuntimeException("Most telt be a tömb.");
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
      System.out.println("A beolvasott szöveg(ek):");
      for(int i=0; i<db; i++)
        System.out.println(szövegTömb[i]);
    }
  }
}