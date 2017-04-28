public class Megfeleltetés1 {
  public static void main(String[] args) {
    Object objektum = new Integer(0);
    // Integer nem castolható szöveggé - olyan még van, hogy az érték igen, de a típusa akkor sem
    // mint pl xls fájl megnyitása worddel
    // - ez segíthetne a dolgon: if (objektum instanceof String)
      System.out.println((String)objektum);
  }
}