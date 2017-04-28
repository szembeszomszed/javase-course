import java.io.File;
import java.io.IOException;                             //1

public class BejegyzésMűveletek {

  static void fájlLétrehozás(
      String útvonal, String név) {                     //2
    File fájl=new File(útvonal, név);
    if(!fájl.exists()) {
      try {
        if(fájl.createNewFile())                        //3
          System.out.println(
            "A fájl létrejött: "+fájl.getPath());
      }
      catch(IOException e) {                            //4
        System.out.println(
          "A fájl nem jött létre: "+fájl.getPath());
      }
    }
    else
      System.out.println(
        "A fájl már létezik: "+fájl.getPath());
  }

  static void mappaLétrehozás(
      String útvonal, String név) {                     //5
    File mappa=new File(útvonal, név);
    if(!mappa.exists()) {
      if(mappa.mkdir())                                 //6
        System.out.println(
          "A mappa létrejött: "+mappa.getPath());
      else
        System.out.println(
          "A mappa nem jött létre: "+mappa.getPath());
    }
    else
      System.out.println(
        "A mappa már létezik: "+mappa.getPath());
  }

  static void mappaLista(String útvonal) {              //7
    File mappa=new File(útvonal);
    System.out.print(
      "A "+mappa.getPath()+" mappa tartalma: ");
    if(mappa.isDirectory()) {
      String[] mappatartalom=mappa.list();
      if(mappatartalom==null)
        System.out.println("üres mappa");
      else {
        for(String bejegyzés: mappatartalom)
          System.out.print(bejegyzés+", ");
        System.out.println();
      }
    }
    else
      System.out.println("Nem létezik a mappa.");
  }

  static void fájlÁtnevezés(
     String útvonal, String régiNév, String újNév) {    //8
    File régiFájl=new File(útvonal, régiNév);
    File újFájl=new File(útvonal, újNév);
    System.out.println(
      "A fájl régi neve: "+régiFájl.getPath());
    System.out.println(
      "A fájl új neve: "+újFájl.getPath());
    if(régiFájl.exists() & !újFájl.exists()) {
      if(régiFájl.renameTo(újFájl))                     //9
        System.out.println("A fájl átnevezése sikerült.");
    }
    else
      System.out.println(
        "A fájl átnevezése nem sikerült.");
  }

  static void fájlTörlés(String útvonal, String név) { //10
    File fájl=new File(útvonal, név);
    if(fájl.exists()) {
      if(fájl.delete())                                //11
        System.out.println(
          "A fájl törlése sikerült: "+fájl.getPath());
      else
        System.out.println(
          "A fájl törlése nem sikerült: "+fájl.getPath());
    }
    else
      System.out.println(
        "A fájl nem létezik: "+fájl.getPath());
  }

  static void mappaTörlés(String útvonal) {            //12
    File mappa=new File(útvonal);
    if(mappa.exists()) {
      File[] mappatartalom=mappa.listFiles();          //13
      if(mappatartalom!=null)                          //14
        for(File fájl: mappatartalom)                  //15
          fájlTörlés(útvonal, fájl.getName());         //16
      if(mappa.delete())                               //17
        System.out.println(
          "A mappa törlése sikerült: "+mappa.getPath());
      else
        System.out.println(
          "A mappa törlése nem sikerült: "+mappa.getPath());
    }
    else
      System.out.println(
        "A mappa nem létezik: "+mappa.getPath());
  }

  public static void main(String[] args) {
    fájlLétrehozás("./files", "fájl1.txt");
    mappaLétrehozás("./files", "tárol");
    fájlLétrehozás("./files/tárol", "fájl2.txt");
    fájlLétrehozás("./files/tárol", "fájl3.txt");
    mappaLista("./files");
    mappaLista("./files/tárol");
    fájlÁtnevezés("./files", "fájl1.txt", "fájl1.~txt");
    System.out.println("" +
      "\nMost megtekinthető Intézőben a ./files mappa...");
    extra.Console.pressEnter();                        //18
    fájlTörlés("./files", "fájl1.~txt");
    mappaTörlés("./files/tárol");
  }
}