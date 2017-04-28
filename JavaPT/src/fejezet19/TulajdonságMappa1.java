import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class TulajdonságMappa1 {
  
  static String dátumIdő(long utc) {
    DateFormat dátumIdőFormázó=
      DateFormat.getDateTimeInstance(
        DateFormat.SHORT, DateFormat.SHORT);
    return
      dátumIdőFormázó.format(new Date(utc)).toString();
  }

  static void mappa(File mappa) {                       //1
    System.out.println("\nA bejegyzés egy mappa.\n"+
      "Útvonal: "+mappa.getPath()+"\n"+
      "Abszolút útvonal: "+mappa.getAbsolutePath()+"\n"+
      "Szülőmappa: "+mappa.getParent()+"\n"+
      "Mappa neve: "+mappa.getName()+"\n"+
      "Utolsó módosítás: "+dátumIdő(mappa.lastModified()));
  }

  public static void main(String[] args) {
    System.out.println("Mappa tulajdonságai");
    String útvonal=extra.Console.readLine("Útvonal: ");
    File bejegyzés=new File(útvonal);
    if(bejegyzés.exists()) {                            //2
      if(bejegyzés.isDirectory())                       //3
        mappa(bejegyzés);
      else
        System.out.println("Nem mappa.");
    }
    else
      System.out.println("Nem létező bejegyzés.");
  }
}