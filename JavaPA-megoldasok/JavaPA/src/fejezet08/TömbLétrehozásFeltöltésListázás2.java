public class TömbLétrehozásFeltöltésListázás2 {
  public static void main(String[] args) {
    int[] tömb=new int[10];                             //1
    tömb[0]= 6;  tömb[1]=12;  tömb[2]=-5;  tömb[3]= 0;  //2
    tömb[4]= 8;  tömb[5]= 2;  tömb[6]= 6;  tömb[7]=44;  //3
    tömb[8]= 9;  tömb[9]= 7;                            //4
    System.out.println("A tömb elemei: ");
    for(int i=0; i<=9; i++)
      System.out.print(tömb[i]+", ");
    System.out.println();
  }
}