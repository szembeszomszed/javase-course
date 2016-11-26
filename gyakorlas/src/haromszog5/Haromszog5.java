package haromszog5;

class Háromszög {

  private double a;

  public Háromszög(double a) {
    setA(a);
  }

  public void setA(double a) {
    if(a<=0)
      a=1;
    this.a=a;
  }

  public double getA() {
    return a;
  }

  public double kerület() {
    return 3*a;
  }

  public double terület() {
    return a*a*Math.sqrt(3)/4;
  }

  @Override
  public String toString() {
    return "Egyenlőoldalú háromszög\n" +
      "  oldalának hossza: "+a+
      "  kerülete: "+extra.Format.left(kerület(), 0, 2)+
      "  területe: "+extra.Format.left(terület(), 0, 2);
  }

  public boolean equals(Háromszög háromszög) {
    return háromszög.getA()==a;
  }
}
