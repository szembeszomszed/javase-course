public class Téglalap2 {
  public static void main(String[] args) {
    System.out.println("Téglalap kerülete, területe");
    Téglalap téglalap1 = new Téglalap(5, 12);
    Téglalap téglalap2 = new Téglalap(12, 5);
    System.out.println("A két téglalap: "+
      téglalap1+téglalap2);
    System.out.println("\nMegegyezik-e a két téglalap? " +
      (téglalap1.equals(téglalap2)?"igen":"nem"));
  }
}

class Téglalap {

  private double a, b;

  public Téglalap(double a, double b) {
    if(a<=0)
      a=1;
    this.a=a;
    if(b<=0)
      b=1;
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
    return "\nTéglalap\n" +
      "  egyik oldalának hossza: "+a+
      "  másik oldalának hossza: "+b+
      "  kerülete: "+extra.Format.left(kerület(), 0, 2)+
      "  területe: "+extra.Format.left(terület(), 0, 2);
  }

  public boolean equals(Téglalap téglalap) {
    return (téglalap.getA()==a && téglalap.getB()==b) ||
           (téglalap.getA()==b && téglalap.getB()==a);
  }
}