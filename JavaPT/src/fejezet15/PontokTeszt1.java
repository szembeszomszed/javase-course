import java.util.*;

class Pont2D implements Comparable {
  public double x, y;

  public Pont2D(double x, double y) {
    this.x=x;
    this.y=y;
  }

  public void eltol(Pont2D p) {
    this.x=p.x;
    this.x=p.y;
  }

  public void eltol(double x, double y) {
    this.x=x;
    this.y=y;
  }

  public void origóraTükröz() {
    this.x=-x;
    this.y=-y;
  }

  @Override
  public String toString() {
    return "Pont2D ("+extra.Format.left(x, 0, 2)+", "+
                      extra.Format.left(y, 0, 2)+")";
  }

  @Override
  public boolean equals(Object o) {
    return this.x==((Pont2D)o).x && this.y==((Pont2D)o).y;
  }

  public double távolság(Pont2D p) {
    return Math.sqrt(Math.pow(this.x-p.x, 2)+
                     Math.pow(this.y-p.y, 2));
  }

  public double távolságOrigótól() {
    return Math.sqrt(Math.pow(this.x, 2)+
                     Math.pow(this.y, 2));
  }

  public int compareTo(Object o) {
    double t1=this.távolságOrigótól();
    double t2=((Pont2D)o).távolságOrigótól();
    return (t1<t2 ? -1 : (t1==t2 ? 0 : 1));
  }
}

class Pont3D extends Pont2D implements Comparable {
  public double z;

  public Pont3D(double x, double y, double z) {         //1
    super(x, y);
    this.z=z;
  }

  public void eltol(Pont3D p) {                         //2
    super.eltol(p.x, p.y);
    this.z=p.z;
  }

  public void eltol(double x, double y, double z) {     //3
    super.eltol(x, y);
    this.z=z;
  }

  @Override
  public void origóraTükröz() {                         //4
    super.origóraTükröz();
    this.z=-z;
  }

  @Override
  public String toString() {
    return "Pont3D ("+extra.Format.left(x, 0, 2)+", "+
                      extra.Format.left(y, 0, 2)+", "+
                      extra.Format.left(z, 0, 2)+")";
  }

  @Override
  public boolean equals(Object o) {                     //5
    Pont3D p=((Pont3D)o);
    return super.equals(new Pont2D(p.x, p.y)) &&
             this.z==((Pont3D)o).z;
  }

  public double távolság(Pont3D p) {                    //6
    return Math.sqrt(Math.pow(super.távolság(
             new Pont2D(p.x, p.y)), 2))+
               Math.pow(this.z-p.z, 2);
  }

  @Override
  public double távolságOrigótól() {                    //7
    return Math.sqrt(Math.pow(super.távolságOrigótól(), 2)+
             Math.pow(this.z, 2));
  }

  @Override
  public int compareTo(Object o) {                      //8
    double t1=távolságOrigótól();
    double t2=((Pont3D)o).távolságOrigótól();
    return (t1<t2 ? -1 : (t1==t2 ? 0 : 1));
  }
}

public class PontokTeszt1 {
  private static Vector pontVektor=new Vector();        //9
  private static Vector<Pont2D> pont2DVektor=
    new Vector<Pont2D>();
  private static Vector<Pont3D> pont3DVektor=
    new Vector<Pont3D>();

  private static void pontFeltölt() {
    while(pontVektor.size()<10)
      if(Math.random()<1.0/2)                          //10
        pontVektor.add(new Pont2D(Math.random()*20-10,
                                  Math.random()*20-10));
      else
        pontVektor.add(new Pont3D(Math.random()*20-10,
                                  Math.random()*20-10,
                                  Math.random()*20-10));
  }

  private static void pontLista(String üzenet, Vector v) {
    System.out.println("\n"+üzenet);
    int db=0;
    for(int i=0; i<v.size(); i++) {
      System.out.print(extra.Format.left(
                       v.get(i).toString(), 30));
      if(++db%2==0)                                    //11
        System.out.println();
    }
    if(db%2==1)
      System.out.println();
  }

  private static void pontSzétválogat() {
    for(int i=0; i<pontVektor.size(); i++) {
      Object o=pontVektor.get(i);
      if(o instanceof Pont3D)                          //12
        pont3DVektor.add((Pont3D)o);
      else
        pont2DVektor.add((Pont2D)o);
    }
  }

  public static void main(String[] args) {
    pontFeltölt();
    pontLista("A pontok vegyesen:", pontVektor);
    pontSzétválogat();
    System.out.println("\nA pontok listája origótól való "+
      "távolságuk szerint rendezve:");
    Collections.sort(pont2DVektor);                    //13
    pontLista("A síkbeli pontok:", pont2DVektor);
    Collections.sort(pont3DVektor);                    //14
    pontLista("A térbeli pontok:", pont3DVektor);
  }
}