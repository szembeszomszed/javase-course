public class InicializálatlanTömb {
  public static void main(String[] args) {
    int[] tömb=null;
    // ez itt előbb lesz NullPointerException, és aztán lenne ArrayIndexOutOfBound
    System.out.println(tömb[2]);
  }
}
