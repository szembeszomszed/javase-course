import java.io.*;
import java.util.*;

class SzámÉsDb implements Comparable {
  int szám, db;

  public SzámÉsDb(int szám, int db) {
    this.szám=szám;
    this.db=db;
  }

  public String toString() {
    return szám+": "+db;
  }

  public int compareTo(Object o) {
    int db1=this.db,
        db2=((SzámÉsDb)o).db;
    return db1<db2? -1: db1==db2? 0: 1;
  }
}

public class SokVéletlenszámFájlban4 {
  static File számFájl=new File("./files/számok.dat");

  static void fájlFeltölt() {
    try {
      DataOutputStream dos=new DataOutputStream(new FileOutputStream(számFájl));
      for(int i=1; i<=10000; i++)
        dos.writeInt((int)(Math.random()*100+1));
      dos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static void fájlFeldolgoz() {
    //betöltés
    Vector<Integer> vektorSzám=new Vector<Integer>();
    DataInputStream dis=null;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      while(true)
        vektorSzám.add(dis.readInt());
    }
    catch(EOFException e) {
      ;
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
    //rendezés
    Collections.sort(vektorSzám);
    Vector<SzámÉsDb> vektorSzámÉsDb=new Vector<SzámÉsDb>();
    //csoportváltás
    int i=0, aktuálisDb;
    while(i<vektorSzám.size()) {
      Integer aktuális=vektorSzám.get(i);
      aktuálisDb=0;
      while(i<vektorSzám.size() && vektorSzám.get(i).equals(aktuális)) {
        i++;
        aktuálisDb++;
      }
      vektorSzámÉsDb.add(new SzámÉsDb(aktuális, aktuálisDb));
    }
    Collections.sort(vektorSzámÉsDb);
    System.out.println("Az 5 leggyakrabban előforduló szám és darabszámuk");
    for(i=vektorSzámÉsDb.size()-1; i>=vektorSzámÉsDb.size()-5; i--)
      System.out.println(vektorSzámÉsDb.get(i));
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}