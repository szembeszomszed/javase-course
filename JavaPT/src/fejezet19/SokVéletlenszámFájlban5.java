import java.io.*;
import java.util.*;

public class SokVéletlenszámFájlban5 {
  static File számFájl=new File("./files/számok.dat");

  static void fájlFeltölt() {
    try {
      DataOutputStream dos=new DataOutputStream(new FileOutputStream(számFájl));
      for(int i=1; i<=10000; i++)
        dos.writeInt((int)(Math.random()*1000+1));
      dos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static void fájlFeldolgoz() {
    //átlag kiszámítása
    int összeg=0, db=0;
    double átlag=0;
    DataInputStream dis=null;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      while(true) {
        összeg+=dis.readInt();
        db++;
      }
    }
    catch(EOFException e) {
      átlag=1.0*összeg/db;
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    finally {
      try {
        dis.close();
      }
      catch(IOException e) {
        System.out.println("I/O hiba: "+e.getMessage());
      }
    }
    //átlag körüliek feldolgozása
    TreeSet<Integer> halmaz=new TreeSet<Integer>();
    int átlagKörüliekDb=0, átlagKörüliekÖsszeg=0;
    double átlagKörüliekÁtlaga=0;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      int szám;
      while(true) {
        szám=dis.readInt();
        if(átlag*0.8<=szám & szám<=átlag*1.2) {
          halmaz.add(szám);
          átlagKörüliekDb++;
          átlagKörüliekÖsszeg+=szám;
        }
      }
    }
    catch(EOFException e) {
      átlagKörüliekÁtlaga=1.0*átlagKörüliekÖsszeg/átlagKörüliekDb;
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    finally {
      try {
        dis.close();
      }
      catch(IOException e) {
        System.out.println("I/O hiba: "+e.getMessage());
      }
    }
    System.out.println("Az átlag körüli (+/- 20%) számok:\n"+halmaz);
    System.out.println("Az átlag körüli számok darabszáma: "+átlagKörüliekDb+
                       ", ezek átlaga: "+átlagKörüliekÁtlaga);
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}