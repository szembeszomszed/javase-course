import java.io.*;
import java.util.*;

public class SokVéletlenszámFájlban3 {
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
    //rendezés
    Collections.sort(vektor);
    //csoportváltás
    System.out.println("Az előforduló számok és darabszámuk:");
    int i=0, aktuálisDb;
    while(i<vektor.size()) {
      Integer aktuális=vektor.get(i);
      System.out.print(aktuális+": ");
      aktuálisDb=0;
      while(i<vektor.size() && vektor.get(i).equals(aktuális)) {
        i++;
        aktuálisDb++;
      }
      System.out.println(aktuálisDb+" db");
    }
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}