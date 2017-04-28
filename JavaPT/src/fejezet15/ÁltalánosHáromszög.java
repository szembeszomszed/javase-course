package fejezet15;

import java.util.Collections;
import java.util.Vector;

public class ÁltalánosHáromszög implements Comparable { //1
  private double a, b, c;                               //2
  
  public ÁltalánosHáromszög(double a, double b, double c) {
    if(a<=0)                                            //3
      throw new IllegalArgumentException("Hiba: 'a<=0'!");
    if(b<=0)  
      throw new IllegalArgumentException("Hiba: 'b<=0'!");
    if(c<=0)      
      throw new IllegalArgumentException("Hiba: 'c<=0'!");
    if(!((a+b>c) && (a+c>b) && (b+c>a)))                //4
      throw new IllegalArgumentException(
        "Nincs háromszög!");
    this.a=a;                                           //5
    this.b=b;
    this.c=c;
  }

  public double getA() {                                //6
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }
  
  public double kerület() {                             //7
    return a+b+c;
  }
  
  public double terület() {                             //8
    double s=kerület()/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
  
  @Override
  public String toString() {                            //9
    return "Általános háromszög a="+a+" b="+b+" c="+c+
      " K="+kerület()+" T="+terület();
  }

  @Override
  public boolean equals(Object o) {                    //10
    ÁltalánosHáromszög h=(ÁltalánosHáromszög)o;
    Vector<Double> h1=new Vector<Double>();
    Vector<Double> h2=new Vector<Double>();
    h1.add(a);   h1.add(b);   h1.add(c);
    h2.add(h.a); h2.add(h.b); h2.add(h.c);
    Collections.sort(h1); Collections.sort(h2);
    int egyformaDb=0;
    for(int i=1; i<=3; i++)
      if((double)h1.get(i-1)==(double)h2.get(i-1))
        egyformaDb++;
    return (egyformaDb==3);
  }

  public int compareTo(Object o) {                     //11
    double t1=terület();
    double t2=((ÁltalánosHáromszög)o).terület();
    return (t1<t2 ? -1 : (t1==t2 ? 0 : 1));
  }
}