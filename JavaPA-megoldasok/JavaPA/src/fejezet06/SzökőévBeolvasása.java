public class SzökőévBeolvasása {
  public static void main(String[] args) {
    System.out.println("Szökőév ellenőrzött beolvasása");
    int év;
    boolean ok;
    do {
      év=extra.Console.readInt("Év: ");
      ok=(év>=1582) &&
         ((év%4==0 && év%100!=0) || (év%400==0));
      if(!ok)
        System.out.println("Nem szökőév. Újra!");
    } while(!ok);
    System.out.println("Elfogadva: "+év);
  }
}