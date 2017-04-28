public class FejVagyÍrás1 {
  public static void main(String[] args) {
    System.out.print("Pénzérme 1000 db feldobásából "); // mondat elkezdése
    int fejDb=0, írásDb=0; //dobás; // megszámolás programozási tétel // a második változó akár elhagyható
    for(int db=1; db<=1000; db++) { // darabszámot léptetjük
      double dobás; // kérünk egy rekeszt a memóriában, és az így mindig rendelkezésre áll
      dobás=Math.random(); //(int)(Math.random()*2); // véletlenszám előállítása (0 v 1)
      if(dobás < 0.5) // 1 -> fej
        fejDb++;
      else // 0 -> írás
        írásDb++;
    }  
    System.out.println(fejDb+" db fej és "+
      írásDb+" írás volt."); // mondat befejezése
  }
}