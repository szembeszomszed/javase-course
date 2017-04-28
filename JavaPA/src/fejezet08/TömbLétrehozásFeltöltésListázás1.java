public class TömbLétrehozásFeltöltésListázás1 {
  public static void main(String[] args) {
    // ha nem kell sok érték, tudjuk előre, mik azok, nem nagyon változnak
    int[] tömb={6, 12, -5, 0, 8, 2, 6, 44, 9, 7};       //1
    System.out.println("A tömb elemei: ");
    for(int i=0; i<=9; i++)                             //2
      System.out.print(tömb[i]+", ");                   //3
    System.out.println();
    System.out.println(tömb[5]);
    System.out.println(tömb); // ez csak memóriacímet adna meg
  }
}