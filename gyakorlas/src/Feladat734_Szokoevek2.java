/**
 * a paraméterként kapott év szökőév-e + 1880 és 1930 közötti szökőévek kiíratása eljárással
 * @author mate
 */
public class Feladat734_Szokoevek2 {
  static boolean szokoev(int ev) {
    boolean ok = (ev >= 1582) && (ev % 4 == 0 && ev % 100 != 0) || (ev % 400 == 0);
    return ok;
  }
  
  static void szokoevek(int ev1, int ev2) {
    for (int i = ev1; i <= ev2; i++) {
      if (szokoev(i)) {
        System.out.print(i + " ");
      }
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Először adjon meg egy évet - megnézzük, szökőév-e!");
    int ev = extra.Console.readInt("Év: ");
    System.out.println((szokoev(ev) ? "" :  "nem ") + "szökőév!");
    int ev1 = 1769;
    int ev2 = 1995;
    System.out.println("És aztán íme a " + ev1 + " és " + ev2 + " közti szökévek:");
    szokoevek(ev1, ev2);
  }
}
