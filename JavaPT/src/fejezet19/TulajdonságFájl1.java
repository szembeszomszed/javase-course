import java.io.File;                                    //1
import java.text.DateFormat;
import java.util.Date;

public class TulajdonságFájl1 {

  static String dátumIdő(long utc) {
    DateFormat dátumIdőFormázó=
      DateFormat.getDateTimeInstance(
        DateFormat.SHORT, DateFormat.SHORT);
    return
      dátumIdőFormázó.format(new Date(utc)).toString();
  }

  static void fájl(File fájl) {                         //2
    System.out.println("\nA bejegyzés egy fájl.\n"+
      "Útvonal: "+fájl.getPath()+"\n"+                  //3
      "Abszolút útvonal: "+fájl.getAbsolutePath()+"\n"+ //4
      "Szülőmappa: "+fájl.getParent()+"\n"+             //5
      "Fájl neve: "+fájl.getName()+"\n"+                //6
      "Méret: "+fájl.length()+" bájt\n"+                //7
      "Olvasható? "+(fájl.canRead()?"igen":"nem")+"\n"+ //8
      "Írható? "+(fájl.canWrite()?"igen":"nem")+"\n"+   //9
      "Rejtett? "+(fájl.isHidden()?"igen":"nem")+"\n"+ //10
      "Utolsó módosítás: "+
        dátumIdő(fájl.lastModified()));                //11
  }

  public static void main(String[] args) {
    System.out.println("Fájl tulajdonságai");
    String útvonal=extra.Console.readLine("Útvonal: ");//12
    File bejegyzés=new File(útvonal);                  //13
    if(bejegyzés.exists()) {                           //14
      if(bejegyzés.isFile())                           //15
        fájl(bejegyzés);
      else
        System.out.println("Nem fájl.");
    }
    else
      System.out.println("Nem létező bejegyzés.");
  }
}