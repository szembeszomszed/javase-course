public class NéhánySzámMaximuma3 {
  public static void main(String[] args) {
    System.out.println("Beolvasott néhány szám maximuma");
    int db=extra.Console.readInt("Darab (>0): ");
    if(db>0) {
      int max=-2147483648, szám;
      for(int i=1; i<=db; i++) {
        szám=extra.Console.readInt(i+". szám: ");
        if(szám>max)
          max=szám;
      }
      System.out.println("A megadott "+db+" szám közül a legnagyobb: "+max);
    }
    else
      System.out.println("Legalább 1 szám közül kell a legnagyobbat kiválasztani!");
  }
}