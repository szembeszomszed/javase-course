import java.util.*;

public class PontokTeszt2 {                             //1

  class Pont3D implements Comparable {                  //2
    public double x, y, z;

    public Pont3D(double x, double y, double z) {       //3
      this.x=x;
      this.y=y;
      this.z=z;
    }

    public void eltol(Pont3D p) {                       //4
      this.x=p.x;
      this.y=p.y;
      this.z=p.z;
    }

    public void eltol(double x, double y, double z) {   //5
      this.x=x;
      this.y=y;
      this.z=z;
    }

    public void origóraTükröz() {                       //6
      this.x=-x;
      this.y=-y;
      this.z=-z;
    }

    @Override
    public String toString() {
      return "Pont3D ("+extra.Format.left(x, 0, 2)+", "+
                        extra.Format.left(y, 0, 2)+", "+
                        extra.Format.left(z, 0, 2)+")";
    }

    @Override
    public boolean equals(Object o) {                   //7
      Pont3D p=((Pont3D)o);
      return (this.x==p.x && this.y==p.y && this.z==p.z);
    }

    public double távolság(Pont3D p) {                  //8
      return Math.sqrt(Math.pow(this.x-p.x, 2)+
                       Math.pow(this.y-p.y, 2)+
                       Math.pow(this.z-p.z, 2));
    }

    public double távolságOrigótól() {                  //9
      return Math.sqrt(Math.pow(this.x, 2)+
                       Math.pow(this.y, 2)+
                       Math.pow(this.z, 2));
    }

    @Override
    public int compareTo(Object o) {                   //10
      double t1=this.távolságOrigótól();
      double t2=((Pont3D)o).távolságOrigótól();
      return (t1<t2 ? -1 : (t1==t2 ? 0 : 1));
    }
  }

  class Pont2D extends Pont3D {                        //11

    public Pont2D(double x, double y) {
      super(x, y, 0);                                  //12
    }

    @Override
    public String toString() {                         //13
      return "Pont2D ("+extra.Format.left(x, 0, 2)+", "+
                        extra.Format.left(y, 0, 2)+")";
    }
  }

  private Vector pontVektor=new Vector();
  private Vector<Pont2D> pont2DVektor=new Vector<Pont2D>();
  private Vector<Pont3D> pont3DVektor=new Vector<Pont3D>();

  private void pontFeltölt() {
    while(pontVektor.size()<10)
      if(Math.random()<1.0/2)
        pontVektor.add(new Pont2D(Math.random()*20-10,
                                  Math.random()*20-10));
      else
        pontVektor.add(new Pont3D(Math.random()*20-10,
                                  Math.random()*20-10,
                                  Math.random()*20-10));
  }

  private void pontLista(String üzenet, Vector v) {
    System.out.println("\n"+üzenet);
    int db=0;
    for(int i=0; i<v.size(); i++) {
      System.out.print(extra.Format.left(
                       v.get(i).toString(), 30));
      if(++db%2==0)
        System.out.println();
    }
    if(db%2==1)
      System.out.println();
  }

  private void pontSzétválogat() {
    for(int i=0; i<pontVektor.size(); i++) {
      Object o=pontVektor.get(i);
      if(o instanceof Pont2D)                          //14
        pont2DVektor.add((Pont2D)o);
      else
        pont3DVektor.add((Pont3D)o);
    }
  }

  public void run() {
    pontFeltölt();
    pontLista("A pontok vegyesen:", pontVektor);
    pontSzétválogat();
    System.out.println("\nA pontok listája origótól való "+
      "távolságuk szerint rendezve:");
    Collections.sort(pont2DVektor);
    pontLista("A síkbeli pontok:", pont2DVektor);
    Collections.sort(pont3DVektor);
    pontLista("A térbeli pontok:", pont3DVektor);
  }

  public static void main(String[] args) {
    new PontokTeszt2().run();
  }
}