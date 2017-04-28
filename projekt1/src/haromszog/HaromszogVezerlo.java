package haromszog;
// két különálló bájtkód készül: egy a szakértőből, egy a vezérlőből

// ctrl + shift + i-vel lehet importálni, ha nem történik meg automatikusan
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HaromszogVezerlo { // vezérlő
  // a final a memóriacímre, és nem a tartalmára vonatkozna
  // a zárójelbe beírható egy szám, de az is csak helyfoglalásra vonatkozó indikátor
  private static ArrayList<Haromszog> lista = new ArrayList<>();
  
  // ha nem static az eljárás, nem férne hozzá a main method (sem) példány nélkül
  private static void listaFeltolt() {
//    lista.add(new Haromszog(3, 4, 6));
//    lista.add(new Haromszog(3, 4, 5));
//    // ciklussal gyártjuk le a maradék háromszögeket
//    for (int i = 1; i <= 8; i++) {
//      Haromszog h = new Haromszog(10, 12, (int) (Math.random() * ( 21 - 3 + 1) + 3)); // 3-21 véletlenszámok, hogy megszerkeszthető legyen
//      lista.add(h);
//    }
    
    // másik megoldás, már kivételkezeléssel:
    
    lista.add(new Haromszog(3, 4, 6));
    lista.add(new Haromszog(3, 4, 5));
    // for-ral csak meghatározott darabszámú háromszöget fog készíteni, és a hibásakat is beleszámolja ebbe (csak persze azok nem készülnek el)
    // for (int i = 1; i <= 8; i++) {
    // ezzel a while-lal viszont addig próbálkozik, amíg nem lesz meg a kívánt megszerkeszthető háromszög
    while (lista.size() < 10) {
      try {
        int a = (int) (Math.random() * 11 + 10); // 10-20
        int b = (int) (Math.random() * 11 + 20); // 20-30
        int c = (int) (Math.random() * 11 + 30); // 30-40
        Haromszog h = new Haromszog(a, b, c); 
        lista.add(h);
      }
      catch (IllegalArgumentException e) {
        // üres utasítással benyeli a rendszer a kivételt
        // a ;-t nem kötelező kirakni, de így jelezzük, hogy itt tudatosan nem írtunk utasítást
        // körészervezni kell trycatch-t, de reagálni nem muszáj még a legsúlyosabb esetekben sem (pl IOException) - persze ez nem szép
        System.out.println("  Hibás háromszög fordult elő.");
      }
    }
    
    
  }
  
  private static void listaFeldolgoz() {
    System.out.println("A háromszögek listája: ");
    // bejáró ciklus
    for (Haromszog h : lista) {
      // a toStringet hívja meg
      System.out.println(h);
    }
    // az ArrayList lista már kiíratható ciklus nélkül - nem úgy, mint a tömb
    // végigmegy rajta egy ciklus, és a toStringgel írja ki - ha nem (felülírt) toStringgel csinálnánk, hanem saját metódussal, akkor ez nem menne, és csak memóriacímeket kapnánk a println-nal - ez igaz a fenti println-ra is (vagyis mindegyikre)
    //System.out.println(lista);
    
    
//    System.out.println("50-nél kisebb területű háromszögek és számuk: ");
//    int kisHaromszogDb = 0;
//    // megszámolás, kiválogatás (meg még egy)
//    for (Haromszog h : lista) {
//      if (h.terulet() < 50) {
//        System.out.println(h);
//        kisHaromszogDb++;
//      }
//    }
//    System.out.println(kisHaromszogDb + " db");
    
    System.out.println("A háromszögek rendezett listája: ");
    // a Collections nevű keretrendszerből szedjük a sort-ot - ez jó az ArrayListhez
    //Collections.sort(lista); - // ez magában is megy
    // ez az összetettebb verzió
    // a metódus második paramétere egy objektum lesz, amit szépen megírunk
    Collections.sort(lista, 
      new Comparator<Haromszog>() {
        @Override
        public int compare(Haromszog h1, Haromszog h2) {
          // ha az a oldalak egyenlők, c oldalak szerint rendezzen
          if (h1.getA() == h2.getA()) {
            return h1.getC() - h2.getC();
          }
          return h1.getA() - h2.getA();
          // ez itt a lényeg a rendezéshez
          // return h1.getC() - h2.getC();
        }        
      }
    );
    for (Haromszog h : lista) {    
      System.out.println(h);
    }
  }
  
  
  
  // ezt sem használjuk már, mert lesz helyette másik
  public static void main3(String[] args) {
    listaFeltolt();
    listaFeldolgoz();
  }
  
  
  
  // ezt már nem használjuk, ezért lett main2 (korábbi verzió)
  public static void main2(String[] args) {
    Haromszog h1 = new Haromszog(30, 40, 50);
    // csak a vezérlő tud a példányokra hivatkozni, az osztály még természetesen nem
    System.out.println(h1);
    // haromszog.Haromszog@7852e922 csomagnév.osztálynév@memóriacím - ha nem definiáljuk felül, memóriacímet ad vissza
    //System.out.println(h1.toString());
    Haromszog h2 = new Haromszog(40, 31, 50);
    System.out.println(h2);
    //System.out.println(h1.a); - ez így nem jó, mert az a változó privát
    //System.out.println(h1.d); - ez sem jó, mert nincs ilyen változó, nem találja
    //System.out.println(h1.getA()); - így már jó
    //System.out.println(h1.kerulet());
    //h1.a = 13; // ha publikus a változó, kívülről is megadható/felülírható, de ez nyilván nagyon kockázatos
    System.out.println(h1.equals(h2)); // az equals() alapból két memóriacímet hasonlít össze
    System.out.println(h1.compareTo(h2));
  }
  
  // -------------------------------------------
  
  
  // a . az aktuális mappát jelenti az útvonalban
  // a / a szeparátor és kompatibilis ( \ nem ajánlott, és amúgy kettő kell belőle)
  // csak az útvonalat adja meg, ez még nem olvassa, nem nézi a tartalmát - tehát egy mappa is lehet
  // java programban amúgy meghajtót nem szabad beleégetni, mert nem lesz kompatibilis minden gépen
  // ../-tal a szülő mappára hivatkozunk
  // /adat.dat - a gyökérre hivatkozik
  private static File fajl = new File("./adat.dat"); // ("c:/windows"); // ("c:/jfk12/projekt1/build.xml");   
  
  private static void fajlbaIr() {
    // objektumok kimeneti adatfolyamának létrehozása
    // ebből csak egyet gyártunk
    // konstruktorok összeláncolása
    // azért hozzuk itt létre az ojektumot, hogy túlélje a try blokkot - létrejön egy memóriacím
    // viszont értéket a try blokkban kap majd
    // null értéket kap, hogy legyen benne valami akkor is, ha később nem tudjuk felülírni
    ObjectOutputStream oos = null;
    try {
      // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fajl));
      oos = new ObjectOutputStream(new FileOutputStream(fajl));
      // minden lista serializable, tehát lehetne egyben is kiírni a listát
      // de objektumonként érdemes
      
      // most kétféle ciklust is írunk, de bármelyik jó
      
      for (int i = 0; i < lista.size(); i++) {
        oos.writeObject(lista.get(i));       
      }
      
      for (Haromszog haromszog : lista) {
        oos.writeObject(haromszog);
      }
//      oos.writeObject(new Haromszog(3, 4, 5));
//      oos.writeObject(new Haromszog(3, 4, 6));
      // objektum-adatfolyam lezárása - KÖTELEZŐ, de finally blokkban
      // oos.close();
    }
    // fontos a catch blokkok sorrendje - logikus is így (ha nincs meg a fájl, kit érdekel, hogy mi van benne)
    // a filenotfound egyébként az ioexception leszármazottja is - ezt is figyelembe kell venni, alulról megyünk felfelé
    catch(FileNotFoundException e) {
      System.out.println("Hiba: nincs meg a fájl."); // I18N probléma - Internationalization (nemzetköziesítés)
    }    
    catch(IOException e) {
      // a PrintStackTrace veremből szedi az adatokat - tesztelés során használhatjuk, hogy lássuk, mi a hiba pontosan
      e.printStackTrace();
      System.out.println("Hiba: a fájlba írás során.");
    }
    finally {
      // ha nem null, a try-ban lefutott rajta egy konstruktor
      // az if lehet a try-ban is
      if(oos != null) {
        try {
          oos.close();
        } 
        catch (IOException e) {
          System.out.println("Hiba: a fájl lezárása során.");
        }
      }      
    }
  }
  
  private static void fajlbolOlvas() {
    //System.out.println("eleje");
    ObjectInputStream ois = null;
    double teruletOsszeg = 0.0;
    int db = 0;
    try {
      ois = new ObjectInputStream(new FileInputStream(fajl));
      // végtelen ciklust kell szervezni, mely addig fog futni, amíg null-t nem talál, és ezzel befejezi az olvasást
      // egy utasítással csak egy objektumot adna vissza
      // a readObject utasítás lépteti a mutatót
      // ha kivétel keletkezik, az magasabb rendű kivétel, mint a végtelen ciklus
      // így a ciklusból is kilépünk
      // ez speciálisan javás megoldás - nagyon csúnya
      while (true) {
        // egy objektumhoz egyszer férek hozzá, nem lehet kétszer beolvasni
        System.out.println(ois.readObject());
        Object h = ois.readObject();
        if (h instanceof Haromszog) {
          // ha Háromszögként tud viselkedni, rákényszerítem, hogy viselkedjen is úgy
          // a minősítés precedenciája magasabb lenne, mint a típuskényszerítésé, ezért kell még zárójel
          teruletOsszeg += ((Haromszog) h).terulet();
          db++;
        }
      }
    }
    // így az IO előtt végre fog hajtódni az EOF, és a többi catch már nem, így nem hibaüzenettel ér véget az amúgy normális futás
    // EOF - end of file
    // azért írjuk a catch blokkba az eredményeket, mert a fájl végének elérése után lesz rá szükség
    // ezek az utasítások a finally-be is kerülhetnének
    // így EOF-nál röptében fel is dolgozom az adatokat - ez attól függ, mit szeretnénk csinálni
    catch (EOFException e) {
      double teruletAtlag = teruletOsszeg / db;
      System.out.println(teruletOsszeg + ", " + db);
      System.out.println("A háromszögek területeinek átlaga: " + teruletAtlag);
      //System.out.println("vége"); 
    }
    // ez a serializable-lel van összefüggésben
    catch (ClassNotFoundException e) {
      System.out.println("Hiba: a fájl értelmezésekor.");
    }
    catch (FileNotFoundException e) {
      System.out.println("Hiba: a fájl megnyitásakor.");
    }
    catch (Exception e) {
      System.out.println("Hiba: a fájlból olvasáskor.");
    }
    finally {
      try {
        if (ois != null) {
          ois.close();
        }
      } 
      catch (IOException e) { // a finally csak IOExceptiont tud már dobni
        System.out.println("Hiba: a fájl lezárásakor.");
      }
    }
    
  }  
  
  public static void main(String[] args) {
    listaFeltolt();
    // fajlbaIr();
    fajlbolOlvas();
  }
  
  
  
  public static void main4(String[] args) {
    System.out.println("Létezik? " + fajl.exists());
    System.out.println("Fájl? " + fajl.isFile());
    System.out.println("Neve: " + fajl.getName());
    System.out.println("Útvonal " + fajl.getAbsolutePath());
    System.out.println("Mérete: " + fajl.length() + " bájt");
    System.out.println("Utolsó módosítás: " + fajl.lastModified());
    Date datumido = new Date(fajl.lastModified());
    DateFormat datumIdoFormazo = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    System.out.println("Rövid formátum: " + datumIdoFormazo.format(datumido));
  }
}
