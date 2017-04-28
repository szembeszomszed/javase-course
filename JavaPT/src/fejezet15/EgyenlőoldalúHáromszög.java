package fejezet15;

public class EgyenlőoldalúHáromszög
    extends EgyenlőszárúHáromszög {                     //1

  public EgyenlőoldalúHáromszög(double alap) {          //2
    super(alap, alap);
  }

  @Override
  public double kerület() {
    return 3*getA();
  }

  @Override
  public double terület() {
    return Math.pow(getA(),2)*Math.sqrt(3)/4;
  }

  @Override
  public String toString() {
    return "Egyenlőoldalú háromszög "+
      "alap="+getA()+" K="+kerület()+" T="+terület();
  }
}