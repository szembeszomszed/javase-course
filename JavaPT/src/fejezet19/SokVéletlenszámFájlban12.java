import java.io.*;

public class SokVéletlenszámFájlban12 {
  static File számFájl=new File("./files/számok.dat");

  static void fájlFeltölt() {
    try {
      DataOutputStream dos=new DataOutputStream(new FileOutputStream(számFájl));
      for(int i=1; i<=10000; i++)
        dos.writeInt((int)(Math.random()*1000-500));
      dos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static void fájlFeldolgoz() {
    int pozitívDb=0, negatívDb=0, szám;
    DataInputStream dis=null;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      while(true) {
        szám=dis.readInt();
        if(szám>0)
          pozitívDb++;
        if(szám<0)
          negatívDb++;
      }
    }
    catch(EOFException e) {
      System.out.println("Az előforduló pozitív számok száma: "+pozitívDb+", negatív számok száma: "+negatívDb);
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
  }

  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}