import java.util.Date;

public class KisebbDátum {

  static boolean kisebbDátum(Date dátum1, Date dátum2) {
    return (dátum2.getTime()-dátum1.getTime())>0;
  }

  public static void main(String[] args) {
    Date dátum1=new Date(2000, 9, 2);
    Date dátum2=new Date(2005, 4, 25);
    System.out.println(dátum1+" kisebb-e, mint "+dátum2+"?\n"+
      (kisebbDátum(dátum1, dátum2)?"Igen.":"Nem."));
  }
}