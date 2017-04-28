import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;                            //1
import java.util.TreeSet;

class Lottó implements Serializable {                   //2
  private String típus;
  private TreeSet<Integer> szelvény=new TreeSet<Integer>();

  public Lottó(String típus, int max, int db) {         //3
    this.típus=típus;
    while(szelvény.size()<db)
      szelvény.add((int)(Math.random()*max+1));
  }

  @Override
  public String toString() {                            //4
    return típus+": "+szelvény.toString();
  }
}

public class LottóFájl {                                //5
  static File lottóFájl=new File("./files/lottó.dat");

  static void lottóMent() {                             //6
    System.out.println("3 db lottószelvény mentése a "+
      lottóFájl+" fájlba.");
    try {
      ObjectOutputStream oos=new ObjectOutputStream(
        new FileOutputStream(lottóFájl));
      Lottó lottó5=new Lottó("Ötöslottó", 90, 5);       //7
      Lottó lottó6=new Lottó("Hatoslottó", 45, 6);
      Lottó lottó7=new Lottó("Heteslottó", 35, 7);
      oos.writeObject(lottó5);                          //8
      oos.writeObject(lottó6);
      oos.writeObject(lottó7);
      oos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static void lottóBetölt() {                           //9
    System.out.println("A 3 db - fájlból betöltött - "+
      "lottószelvény:");
    try {
      ObjectInputStream ois=new ObjectInputStream(
        new FileInputStream(lottóFájl));
      System.out.println(ois.readObject());            //10
      System.out.println(ois.readObject());
      System.out.println(ois.readObject());
      ois.close();
    }
    catch(ClassNotFoundException e) {
      System.out.println("Hibás osztály!");
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    lottóMent();
    lottóBetölt();
  }
}