public class Időtartam2 {

  static int időtartam(int óra, int perc, int másodperc) {
    return óra*3600+perc*60+másodperc;                  //1
  }                                      //nincs ellenőrzés

  public static void main(String[] args) {
    System.out.println("Időtartam: "+
      "óra:perc:másodperc -> másodperc");
    System.out.println("3:11:42 = "+
      időtartam(3, 11, 42)+" másodperc");               //2
  }
}