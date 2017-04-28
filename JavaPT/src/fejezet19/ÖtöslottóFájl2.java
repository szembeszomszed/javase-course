import java.io.*;

public class ÖtöslottóFájl2 {

  static int[] lottószelvényBetölt() {                  //1
    File lottóFájl=new File("./files/ötöslottó.dat");
    int[] lottóTömb=new int[5];
    try {
      FileInputStream bemenet=
        new FileInputStream(lottóFájl);                 //2
      int i=0, szám;
      while((szám=bemenet.read())!=-1)                  //3
        lottóTömb[i++]=szám;
      bemenet.close();                                  //4
    }
    catch(IOException e) {                              //5
      System.out.println("I/O hiba: "+e.getMessage());
    }
    return lottóTömb;
  }

  static void lottószelvényKiír(int[] lottóTömb) {      //6
    System.out.println("A files/ötöslottó.dat fájlból "+
      "betöltött ötöslottó szelvény:");
    for(int szám: lottóTömb)
      System.out.print(szám+"  ");
    System.out.println();
  }

  public static void main(String[] args) {
    lottószelvényKiír(lottószelvényBetölt());
  }
}