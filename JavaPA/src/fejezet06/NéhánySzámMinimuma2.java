public class NéhánySzámMinimuma2 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám minimuma");
    int db=extra.Console.readInt("Darab (>0): "); // választási ígéret
    if(db>0) { // itt már nincs megszámolás programozási tétel, hiszen előre tudjuk, hány szám lesz
      int min=2147483647, szám;
      for(int i=1; i<=db; i++) {
        szám=extra.Console.readInt(i+". szám: ");
        if(szám<min)
          min=szám;
        System.out.println("Az eddigi számok minimuma: " + min);
      }
      System.out.println("A megadott "+db+" szám közül a legkisebb: "+min);
    }
    else
      System.out.println("Legalább 1 szám közül kell a legkisebbet kiválasztani!");
  }
}