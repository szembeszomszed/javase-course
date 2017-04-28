class Szakasz {
  Pont p1, p2;

  public Szakasz() {                                    //1
    p1=new Pont(0, 0); p2=new Pont(6, 8);
  }

  double hossz(Pont p1, Pont p2) {                      //2
    return Math.sqrt(Math.pow(p1.x-p2.x, 2)+
                     Math.pow(p1.y-p2.y, 2));
  }

  @Override
  public String toString() {
    return "szakasz:\nkezdő"+p1+"\nvég"+p2+
      "\nhossz: "+hossz(p1, p2);
  }

  class Pont {
    int x, y;

    public Pont(int x, int y) {                         //3
      this.x=x; this.y=y;
    }

    @Override
    public String toString() {
      return "pont: ("+x+", "+y+")";
    }
  }
}

public class PontokTávolsága {
  public static void main(String[] args) {
    Szakasz szakasz=new Szakasz();
    System.out.println(szakasz);
  }
}