public class TömbLétrehozásFeltöltésListázás4 {
  public static void main(String[] args) {
    // random feltöltés
    // new hozza létre a memóriacím mögötti adatterületet, ő egy konstruktor (lsd majd később az oop-t)
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