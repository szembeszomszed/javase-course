
import java.util.ArrayList;

class Pont {

  private int x;
  private int y;
  private String felirat;

  public Pont(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String felirat() {
    return "origó";
  }

  @Override
  public String toString() {
    return felirat() + ": x = " + x + ", y = " + y;
  }

}

public class Feladat1554_Pontok {

  static ArrayList<Pont> pontLista = new ArrayList<Pont>();
//  public static void load(int num) {
//    int x;
//    int y;
//    String felirat;
//    while (pontLista.size() < num) {
//      x = (int) (Math.random() * 50 + 10);
//      y = (int) (Math.random() * 50 + 10);
//      Pont p = new Pont(x, y);
//      pontLista.add(p);
//    }
//  }

  public static void display() {
    for (Pont p : pontLista) {
      System.out.println(p);
    }
  }

  public static void main(String[] args) {
    pontLista.add(new Pont(10, 5) {
      @Override
      public String felirat() {
        return "máshol lévő pont";
      }
    });

    pontLista.add(new Pont(22, 3) {
      @Override
      public String felirat() {
        return "teljesen máshol lévő pont";
      }
    });
    
    pontLista.add(new Pont(2, 5));
    
    display();
  }
}
