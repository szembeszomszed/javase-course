import java.util.*;

public class KeresésNagyVektorban {
  static int maxDb=2000000;                             //1
  static Vector<Integer> vektor=
    new Vector<Integer>(maxDb);                         //2

  static void lineárisKeresés(int keres, String üzenet) {
    System.out.print(üzenet);
    long időStart=System.currentTimeMillis();           //3
    int index=vektor.indexOf(keres);                    //4
    long időStop=System.currentTimeMillis();            //5
    System.out.println((időStop-időStart)+" ms");       //6
  }

  static void binárisKeresés(int keres, String üzenet) {
    System.out.print(üzenet);
    long időStart=System.currentTimeMillis();
    int index=Collections.binarySearch(vektor, keres);  //7
    long időStop=System.currentTimeMillis();
    System.out.println((időStop-időStart)+" ms");
  }

  public static void main(String[] args) {
    System.out.println("Műveletek "+maxDb+" db különböző "+
      "egész számot tartalmazó rendezett vektorban");
    for(int i=0; i<maxDb; i++)
      vektor.add(i);                                    //8
    System.out.println("1. Lineáris keresés");
    lineárisKeresés(1000000, "  1.1. Van találat: ");
    lineárisKeresés(maxDb, "  1.2. Nincs találat: ");
    System.out.println("2. Bináris keresés");
    Collections.sort(vektor);                          //10
    binárisKeresés(1000000, "  2.1. Van találat: ");
    binárisKeresés(maxDb, "  2.2. Nincs találat: ");
  }
}