import java.io.*;

public class SokVéletlenszámFájlban1 {
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

  static boolean prím(int x) {
    if(x<2)
      return false;
    int osztókSzáma=1;   //mert az 1 minden számnak osztója
    for(int i=2; i<=Math.sqrt(x); i++)
      if(x%i==0)
        osztókSzáma++;
    return (osztókSzáma==1);  //a szám gyökéig
  }

  static void fájlFeldolgoz() {
    int prímDb=0;
    DataInputStream dis=null;
    try {
      dis=new DataInputStream(new FileInputStream(számFájl));
      while(true)
        if(prím(dis.readInt()))
          prímDb++;
    }
    catch(EOFException e) {
      System.out.println("A számok.dat fájlban lévő prímszámok száma: "+prímDb);
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