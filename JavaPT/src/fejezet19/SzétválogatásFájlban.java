import java.io.*;

public class SzétválogatásFájlban {
  static File számFájl=new File("./files/számok.dat");
  static File számPárosFájl=new File("./files/párosszámok.dat");
  static File számPáratlanFájl=new File("./files/páratlanszámok.dat");

  static void fájlFeltölt() {
    try {
      DataOutputStream dos=new DataOutputStream(new FileOutputStream(számFájl));
      for(int i=1; i<=1000; i++)
        dos.writeInt((int)(Math.random()*1000+1));
      dos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static void fájlFeldolgoz() {
    int szám;
    DataInputStream dis=null;
    DataOutputStream dosPáros=null;
    DataOutputStream dosPáratlan=null;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      dosPáros=new DataOutputStream(new FileOutputStream(számPárosFájl));
      dosPáratlan=new DataOutputStream(new FileOutputStream(számPáratlanFájl));
      while(true) {
        szám=dis.readInt();
        if(szám%2==0)
          dosPáros.writeInt(szám);
        else
          dosPáratlan.writeInt(szám);
      }
    }
    catch(EOFException e) {
      System.out.println("A páros és páratlan számok szétválogatása megtörtént.");
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    finally {
      try {
        dis.close();
        dosPáros.close();
        dosPáratlan.close();
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