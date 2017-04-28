import java.io.*;
import java.util.*;

public class SokVéletlenszámFájlban2 {
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
    //betöltés
    Vector<Integer> vektor=new Vector<Integer>();
    DataInputStream dis=null;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      while(true)
        vektor.add(dis.readInt());
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
    //rendezés, megfordítás
    Collections.sort(vektor);
    Collections.reverse(vektor);
    //mentés
    try {
      DataOutputStream dos=new DataOutputStream(new FileOutputStream(számFájl));
      for(Integer szám: vektor)
        dos.writeInt(szám);
      dos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    System.out.println("A fájlban lévő 10000 db szám sorrendje csökkenő.");
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}