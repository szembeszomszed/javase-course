import java.io.*;
import java.util.*;

public class SokVéletlenszámFájlban6 {
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
    //medián
    int db=vektor.size();
    double medián;
    if(db%2==0) { //ha páros számú elem van
      int középsőBal=vektor.get(db/2-1),
          középsőJobb=vektor.get(db/2);
      medián=(double)(középsőBal+középsőJobb)/2; //két középső elem átlaga
    }
    else //ha páratlan számú elem van
      medián=vektor.get(db/2); //középső elem
    System.out.println("Medián: "+medián);
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}