public class Időtartam1 {

  static void időtartam(int mp) {        //nincs ellenőrzés
    int másodperc=mp;                                   //1
    int óra=másodperc/3600;
    másodperc%=3600;                                    //2
    int perc=másodperc/60;
    másodperc%=60;
    System.out.println(mp+" másodperc = "+              //3
      óra+":"+perc+":"+másodperc);
  }

  public static void main(String[] args) {
    System.out.println("Időtartam: "+
      "másodperc -> óra:perc:másodperc");
    időtartam(11502);                                   //4
  }
}