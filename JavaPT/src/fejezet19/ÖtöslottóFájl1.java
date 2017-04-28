import java.io.*;
import java.util.TreeSet;

public class ÖtöslottóFájl1 {

  static int[] ötöslottó() {                            //1
    TreeSet lottóHalmaz=new TreeSet();
    while(lottóHalmaz.size()<5)
      lottóHalmaz.add((int)(Math.random()*90+1));
    Object[] objektumTömb=lottóHalmaz.toArray();        //2
    int[] segédTömb=new int[5];
    for(int i=0; i<objektumTömb.length; i++)
      segédTömb[i]=
        ((Integer)objektumTömb[i]).intValue();          //3
    return segédTömb;
  }

  static void lottószelvényMent(int[] lottóTömb) {      //4
    File lottóFájl=new File("./files/ötöslottó.dat");
    try {
      FileOutputStream kimenet=
        new FileOutputStream(lottóFájl);                //5
      for(int i=0; i<lottóTömb.length; i++)             //6
        kimenet.write(lottóTömb[i]);                    //7
      kimenet.close();                                  //8
    }
    catch(IOException e) {                              //9
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    lottószelvényMent(ötöslottó());
    System.out.println("Az ötöslottó szelvény "+
      "megtalálható a files/ötöslottó.dat fájlban.");
  }
}