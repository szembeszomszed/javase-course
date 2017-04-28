package fejezet15;

public class EgyenlőszárúHáromszög
    extends ÁltalánosHáromszög {                        //1

  public EgyenlőszárúHáromszög (double alap, double szár) {
    super(alap, szár, szár);                            //2
  }

  @Override
  public double kerület() {
    return getA()+2*getB();  //return super.kerület();
  }

  @Override
  public double terület() {
    double magasság=
      Math.sqrt((getB()*getB()-(getA()/2)*(getA()/2)));
    return getA()*magasság/2;
  }

  @Override
  public String toString() {
    return "Egyenlőszárú háromszög "+
      "alap="+getA()+" szár="+getB()+
      " K="+kerület()+" T="+terület();
  }
}