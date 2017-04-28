import java.util.Date;

public class NapokKétDátumKözött {

  static long napokSzáma(Date dátum1, Date dátum2) { // nincs ellenőrzés
    return (dátum2.getTime()-dátum1.getTime())/1000/60/60/24;
  }

  public static void main(String[] args) {
    Date dátum1=new Date(2000, 9, 2);
    Date dátum2=new Date(2005, 4, 25);
    System.out.println(dátum1+" és "+dátum2+" között eltelt napok száma: "+
      napokSzáma(dátum1, dátum2));
  }
}