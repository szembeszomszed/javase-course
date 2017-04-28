import java.util.Date;                                  //1
import java.text.DateFormat;                            //2

public class Dátumok2 {
  public static void main(String[] args) {
    System.out.println("Pontos dátum és idő");
    Date dátumIdő=new Date();                           //3

    DateFormat dátumIdőFormázó=
      DateFormat.getDateTimeInstance(                   //4
        DateFormat.FULL, DateFormat.FULL);              //5
    System.out.println("Teljes formátum: "+
      dátumIdőFormázó.format(dátumIdő));                //6

    dátumIdőFormázó=DateFormat.getDateTimeInstance(
        DateFormat.SHORT, DateFormat.SHORT);            //7
    System.out.println("Rövid formátum: "+
      dátumIdőFormázó.format(dátumIdő));

    dátumIdőFormázó=DateFormat.getDateInstance(         //8
        DateFormat.MEDIUM);
    System.out.println("Csak dátum: "+
      dátumIdőFormázó.format(dátumIdő));

    dátumIdőFormázó=DateFormat.getTimeInstance(         //9
        DateFormat.MEDIUM);
    System.out.println("Csak idő: "+
      dátumIdőFormázó.format(dátumIdő));
  }
}