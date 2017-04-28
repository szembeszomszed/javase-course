public class EgészEllenőrzöttBeolvasása {
  public static void main (String[] args) {
    int szam;
    boolean ok=false;
    do {
      try {
        String str=extra.Console.readLine("Egész szám: ");
        szam=Integer.parseInt(str);
        ok=true;
        System.out.println("OK");
      }
      catch (NumberFormatException ex) {
        System.out.println("Hiba: a szám nem egész, vagy betűt tartalmaz!");
      }
    } while (!ok);
  }
}