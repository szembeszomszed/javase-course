package fejezet15;

import java.util.Vector;

class Pont {
  private int x, y;

  public Pont(int x, int y) {
    this.x=x;
    this.y=y;
  }

  public String felirat() {
    return "origó";
  }

  public String toString() {
    return felirat()+"pont: ("+x+", "+y+")";
  }
}

public class Pontok {
  public static void main(String[] args) {
    Vector pontok=new Vector();
    pontok.add(new Pont(0, 0));
    pontok.add(new Pont(5, 7) {
      @Override
      public String felirat() {
        return "kör közép";
      }
    });
    pontok.add(new Pont(-3, 4) {
      public String felirat() {
        return "háromszög magasság";
      }
    });
    System.out.println(pontok);
  }
}