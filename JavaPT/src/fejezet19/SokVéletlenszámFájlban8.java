import java.io.*;
import java.util.*;

public class SokVéletlenszámFájlban8 {
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
    //csoportváltás
    int i=vektorSzám.size()-1, különbözőDb=0, összeg=0;
    while(i>=0 && különbözőDb<10) {
      Integer aktuális=vektorSzám.get(i);
      összeg+=aktuális;
      while(i>=0 && vektorSzám.get(i).equals(aktuális))
        i--;
      különbözőDb++;
    }
    System.out.println("A 10 legnagyobb előforduló szám átlaga: "+(double)összeg/10);
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}