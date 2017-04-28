package fejezet13;

import java.util.Vector;

class Téglalap {

  private double a, b;

  public Téglalap(double a, double b) {
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
    return getClass().getName()+": "+
      " a= "+extra.Format.right(a, 6, 2)+
      " b= "+extra.Format.right(b, 6, 2)+
      " K= "+extra.Format.right(kerület(), 6, 2)+
      " T= "+extra.Format.right(terület(), 6, 2);
  }

  public boolean equals(Téglalap téglalap) {
    return (téglalap.getA()==a && téglalap.getB()==b) ||
           (téglalap.getA()==b && téglalap.getB()==a);
  }
}

public class TéglalapokVektorban2 {
  public static void main(String[] args) {
    Vector téglalapVektor=new Vector();
    téglalapVektor.add(new Téglalap(6, 8));
    téglalapVektor.add(new Téglalap(10, 5));
    téglalapVektor.add(new Téglalap(8, 6));
    téglalapVektor.add(new Téglalap(4, 16));
    téglalapVektor.add(new Téglalap(15, 40));
    System.out.println("A téglalapok:\n"+téglalapVektor);
    Téglalap téglalapMinta=new Téglalap(6, 8);
    System.out.println("Az összehasonlításhoz használt " +
      "téglalap:\n"+téglalapMinta);
    System.out.println("Az oldalak összehasonlítása " +
      "alapján megegyező téglalapok:");
    for(int i=0; i<téglalapVektor.size()-1; i++) {
      Téglalap téglalap=(Téglalap)téglalapVektor.get(i);
      if(téglalap.equals(téglalapMinta))
        System.out.println(téglalap);
    }
  }
}