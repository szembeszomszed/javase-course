public class TömbTúlindexelés3 {

  static void index() {
    int[] tömb=new int[20];
    tömb[32]=4;
  }

  public static void main (String[] args) {
    try {
      index();
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Indexelési hiba a tömbben!");
    }
    System.out.println("Folytatás...");
  }
}