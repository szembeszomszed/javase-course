public class TömbLétrehozásFeltöltésListázás3 {
  public static void main(String[] args) {
    int[] tömb=new int[10];
    System.out.println("A tömb feltöltése");
    for(int i=0; i<=9; i++)
      tömb[i]=extra.Console.readInt((i+1)+". elem: ");  //1
    System.out.println("A tömb elemei: ");
    for(int i=0; i<tömb.length; i++)                    //2
      System.out.print(tömb[i]+", ");
    System.out.println();
  }
}