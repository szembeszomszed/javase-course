/**
 * a paraméterként kapott év szökőév-e + 1880 és 1930 közötti szökőévek kiíratása
 * @author mate
 */
public class Feladat733_Szokoevek1 {
  static boolean szokoev(int ev) {
    boolean ok = (ev >= 1582) && (ev % 4 == 0 && ev % 100 != 0) || (ev % 400 == 0);
    return ok;
  }
  
  public static void main(String[] args) {
    System.out.println("Adjon meg egy évet, megnézzük, hogy szökőév-e!");
    int ev = extra.Console.readInt("Év: ");
    System.out.println((szokoev(ev) ? "" :  "nem ") + "szökőév!");
    System.out.println("Az 1880 és 1930 közötti szökévek pedig: ");
    
    for (int i = 1880; i <= 1930; i++) {
      if(szokoev(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println("");
  }
}
