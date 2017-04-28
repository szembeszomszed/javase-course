import java.util.*;

class ÖsszehasonlíthatóTéglalap implements Comparable { //1

  private double a, b;

  public ÖsszehasonlíthatóTéglalap(double a, double b) {
    if(a<0 || b<0)
      throw new IllegalArgumentException(
        "A téglalap oldalai nem pozitívak!");
    this.a=a;
    this.b=b;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double kerület() {
    return 2*(a+b);
  }

  public double terület() {
    return a*b;
  }

  @Override
  public String toString() {
    return "Téglalap: "+
      " a= "+extra.Format.right(a, 6, 2)+
      " b= "+extra.Format.right(b, 6, 2)+
      " K= "+extra.Format.right(kerület(), 6, 2)+
      " T= "+extra.Format.right(terület(), 6, 2);
  }

  @Override
  public boolean equals(Object o) {                     //2
    ÖsszehasonlíthatóTéglalap téglalap=
      (ÖsszehasonlíthatóTéglalap)o;                     //3
    return (téglalap.getA()==a && téglalap.getB()==b) ||
           (téglalap.getA()==b && téglalap.getB()==a);
  }

  public int compareTo(Object o) {                      //4
    double t1=terület();                                //5
    double t2=((ÖsszehasonlíthatóTéglalap)o).terület(); //6
    return (t1<t2 ? -1 : (t1==t2 ? 0 : 1));             //7
  }
}

public class TéglalapokVektorban3 {
  public static void main(String[] args) {
    Vector<ÖsszehasonlíthatóTéglalap> téglalapok=
      new Vector<ÖsszehasonlíthatóTéglalap>();
    téglalapok.add(new ÖsszehasonlíthatóTéglalap(6, 8));
    téglalapok.add(new ÖsszehasonlíthatóTéglalap(10, 5));
    téglalapok.add(new ÖsszehasonlíthatóTéglalap(8, 6));
    téglalapok.add(new ÖsszehasonlíthatóTéglalap(4, 16));
    System.out.println("A téglalapok eredeti sorrendje:\n"+
      téglalapok);
    System.out.println("A (8,6) paraméterű téglalap "+
      "sorszáma: "+(1+téglalapok.
        indexOf(new ÖsszehasonlíthatóTéglalap(8, 6)))); //8
    Collections.sort(téglalapok);                       //9
    System.out.println("A téglalapok területük szerinti " +
      "növekvő sorrendje:\n"+téglalapok);
  }
}