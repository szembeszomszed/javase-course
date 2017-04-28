import java.io.*;
import java.util.*;

public class SokVéletlenszámFájlban9 {
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
    Vector<Integer> vektor=new Vector<Integer>();
    DataInputStream dis=null;
    int szám, db=0, összeg=0;
    double átlag=0;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      while(true) {
        szám=dis.readInt();
        vektor.add(szám);
        db++;
        összeg+=szám;
      }
    }
    catch(EOFException e) {
      átlag=(double)összeg/db;
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
    System.out.println("Az átlag feletti számok:");
    for(int elem: vektor)
      if(elem>átlag)
        System.out.println(elem);
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}