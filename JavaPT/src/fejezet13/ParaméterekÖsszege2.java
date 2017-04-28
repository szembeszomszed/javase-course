public class ParaméterekÖsszege2 {

  static void listaÉsÖsszeg(int[] tömb) {
    System.out.print("A számok: ");
    int s=0;
    for(int elem: tömb) {
      System.out.print(elem+", ");
      s+=elem;
    }
    System.out.println("\nÖsszegük: "+s);
  }

  public static void main(String[] args) {
    listaÉsÖsszeg(new int[] {6, 7, -1, 0, 16});         //1
  }
}