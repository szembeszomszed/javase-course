class OutOfRangeException extends RuntimeException {

  OutOfRangeException(String s) {
    super(s);
  }
}

public class BeolvasásHatárokKözött {

  static int beolvasSzám(int tól, int ig) {
    int szám=0;
    boolean ok=false;
    while(!ok) {
      try {
        szám=Integer.parseInt(extra.Console.readLine("Szám [10; 20]: "));
        if(szám<tól || szám>ig)
          throw new OutOfRangeException("Hiba: "+tól+"-től "+ig+"-ig!");
        ok=true;
      }
      catch (NumberFormatException e) {
        System.out.println("Illegális karakter!");
      }
      catch (OutOfRangeException e) {
        System.out.println(e.getMessage());
      }
    }
    return szám;
  }

  public static void main (String[] args) {
    int beolvasottSzám=beolvasSzám(10, 20);
    System.out.println("OK");
  }
}