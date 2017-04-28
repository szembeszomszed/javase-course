public class TömbLétrehozásFeltöltésListázás4 {
  public static void main(String[] args) {
    int[] tömb=new int[10];
    System.out.println("A tömb elemei: ");
    int szám;                                           //1
    for(int i=0; i<tömb.length; i++) {
      szám=(int)(Math.random()*90+10);                  //2
      tömb[i]=szám;                                     //3
      System.out.print(tömb[i]+", ");                   //4
    }
    System.out.println();
  }
}