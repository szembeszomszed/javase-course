import java.io.DataInputStream;                         //1
import java.io.DataOutputStream;                        //2
import java.io.EOFException;                            //3
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SzámokFájlban {
  static File számFájl=new File("./files/számok.dat");

  static void fájlFeltölt() {                           //4
    try {
      DataOutputStream dos=new DataOutputStream(        //5
        new FileOutputStream(számFájl));
      int szám;
      for(int i=1; i<=1000; i++) {
        szám=(int)(Math.random()*1000+1);
        dos.writeInt(szám);                             //6
      }
      dos.close();                                      //7
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static void fájlFeldolgoz() {                         //8
    int összeg=0, db=0;
    try {
      DataInputStream dis=new DataInputStream(          //9
        new FileInputStream(számFájl));
      int szám;
      while(true) {                                    //10
        szám=dis.readInt();                            //11
        összeg+=szám;
        db++;
      }
    }
    catch(EOFException e) {                            //12
      System.out.println("A számok.dat fájlban lévő "+
        "számok összege "+összeg+", átlaga "+
        extra.Format.left(1.0*összeg/db, 0, 2));
    }
    catch(IOException e) {                             //13
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }
  
  public static void main(String[] args) {
    fájlFeltölt();
    fájlFeldolgoz();
  }
}