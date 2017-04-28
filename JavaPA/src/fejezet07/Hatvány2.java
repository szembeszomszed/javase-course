public class Hatvány2 {

  static long hatványozás1(int hatványAlap,
                           int hatványKitevő) {
    return (long)Math.pow(hatványAlap, hatványKitevő);
  }

  static long hatványozás2(int hatványAlap,
                           int hatványKitevő) {
    long hatvány=1;                      //nincs ellenőrzés
    for(long i=1; i<=hatványKitevő; i++)
      hatvány*=hatványAlap;
    return hatvány;
  }

  public static void main(String[] args) {
    System.out.println("Hatványozás\n4^3 = ?");
    System.out.println("Beépített függvénnyel: "+
      hatványozás1(4, 3));
    System.out.println("Saját függvénnyel: "+
      hatványozás2(4, 3));
  }
}