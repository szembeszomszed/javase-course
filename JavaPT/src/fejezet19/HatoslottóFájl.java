import java.io.*;
import java.util.TreeSet;

public class HatoslottóFájl {
  static File lottóFájl=new File("./files/hatoslottó.dat");

  static int[] ötöslottó() {
    TreeSet lottóHalmaz=new TreeSet();
    while(lottóHalmaz.size()<6)
      lottóHalmaz.add((int)(Math.random()*45+1));
    Object[] objektumTömb=lottóHalmaz.toArray();
    int[] segédTömb=new int[6];
    for(int i=0; i<objektumTömb.length; i++)
      segédTömb[i]=((Integer)objektumTömb[i]).intValue();
    return segédTömb;
  }

  static void lottószelvényMent(int[] lottóTömb) {
    try {
      FileOutputStream kimenet=new FileOutputStream(lottóFájl);
      for(int i=0; i<lottóTömb.length; i++)
        kimenet.write(lottóTömb[i]);
      kimenet.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static int[] lottószelvényBetölt() {
    int[] lottóTömb=new int[6];
    try {
      FileInputStream bemenet=new FileInputStream(lottóFájl);
      int i=0, szám;
      while((szám=bemenet.read())!=-1)
        lottóTömb[i++]=szám;
      bemenet.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    return lottóTömb;
  }

  static void lottószelvényKiír(int[] lottóTömb) {
    System.out.println("A files/hatoslottó.dat fájlból betöltött hatoslottó szelvény:");
    for(int szám: lottóTömb)
      System.out.print(szám+"  ");
    System.out.println();
  }

  public static void main(String[] args) {
    lottószelvényMent(ötöslottó());
    lottószelvényKiír(lottószelvényBetölt());
  }
}