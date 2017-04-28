import java.io.*;
import java.util.*;

class ÁltalánosHáromszög implements Comparable, Serializable {
  private double a, b, c;

  public ÁltalánosHáromszög(double a, double b, double c) {
    if(a<=0)
      throw new IllegalArgumentException("Hiba: 'a<=0'!");
    if(b<=0)
      throw new IllegalArgumentException("Hiba: 'b<=0'!");
    if(c<=0)
      throw new IllegalArgumentException("Hiba: 'c<=0'!");
    if(!((a+b>c) && (a+c>b) && (b+c>a)))
      throw new IllegalArgumentException("Nincs háromszög!");
    this.a=a;
    this.b=b;
    this.c=c;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  public double kerület() {
    return a+b+c;
  }

  public double terület() {
    double s=kerület()/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }

  @Override
  public String toString() {
    return "Általános háromszög a="+a+" b="+b+" c="+c+" K="+kerület()+" T="+terület();
  }

  @Override
  public boolean equals(Object o) {
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

  public int compareTo(Object o) {
    double t1=terület();
    double t2=((ÁltalánosHáromszög)o).terület();
    return (t1<t2 ? -1 : (t1==t2 ? 0 : 1));
  }
}

class EgyenlőszárúHáromszög extends ÁltalánosHáromszög {

  public EgyenlőszárúHáromszög(double alap, double szár) {
    super(alap, szár, szár);
  }

  @Override
  public double kerület() {
    return getA()+2*getB();
  }

  @Override
  public double terület() {
    double magasság=Math.sqrt((getB()*getB()-(getA()/2)*(getA()/2)));
    return getA()*magasság/2;
  }

  @Override
  public String toString() {
    return "Egyenlőszárú háromszög alap="+getA()+" szár="+getB()+" K="+kerület()+" T="+terület();
  }
}

class EgyenlőoldalúHáromszög extends EgyenlőszárúHáromszög {

  public EgyenlőoldalúHáromszög(double alap) {
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
    return "Egyenlőoldalú háromszög alap="+getA()+" K="+kerület()+" T="+terület();
  }
}

public class HáromszögekTeszt3 {
  static File háromszögFájl=new File("./files/háromszög.dat");

  static void háromszögMent() {
    //előállítás
    Vector<ÁltalánosHáromszög> vektor=new Vector<ÁltalánosHáromszög>();
    int típus;
    double a, b, c;
    while(vektor.size()<10)
      try {
        típus=(int)(Math.random()*3);
        a=Math.rint(Math.random()*10);
        b=Math.rint(Math.random()*10);
        c=Math.rint(Math.random()*10);
        switch(típus) {
          case 0:
            vektor.add(new ÁltalánosHáromszög(a, b, c));
            break;
          case 1:
            vektor.add(new EgyenlőszárúHáromszög(a, b));
            break;
          case 2:
            vektor.add(new EgyenlőoldalúHáromszög(a));
        }
      }
      catch(IllegalArgumentException e) {
        ;
      }
    //mentés
    try {
      ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(háromszögFájl));
      for(ÁltalánosHáromszög háromszög: vektor)
        oos.writeObject(háromszög);
      oos.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  static void háromszögLista() {
    System.out.println("A háromszögek listája:");
    try {
      ObjectInputStream ois=new ObjectInputStream(new FileInputStream(háromszögFájl));
      for(int i=1; i<=10; i++)
        System.out.println(ois.readObject());
      ois.close();
    }
    catch(ClassNotFoundException e) {
      System.out.println("Hibás osztály!");
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }


  static void háromszögTerületÖsszeg() {
    double összeg=0;
    try {
      ObjectInputStream ois=new ObjectInputStream(new FileInputStream(háromszögFájl));
      for(int i=1; i<=10; i++)
        összeg+=((ÁltalánosHáromszög)ois.readObject()).terület();
      ois.close();
    }
    catch(ClassNotFoundException e) {
      System.out.println("Hibás osztály!");
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    System.out.println("A háromszögek területeinek összege: "+összeg);
  }

  static void egyenlőszárúHáromszögTerületÖsszeg() {
    double összeg=0;
    ÁltalánosHáromszög háromszög;
    try {
      ObjectInputStream ois=new ObjectInputStream(new FileInputStream(háromszögFájl));
      for(int i=1; i<=10; i++) {
        háromszög=(ÁltalánosHáromszög)ois.readObject();
        if(háromszög instanceof EgyenlőszárúHáromszög && !(háromszög instanceof EgyenlőoldalúHáromszög))
          összeg+=háromszög.terület();
      }
      ois.close();
    }
    catch(ClassNotFoundException e) {
      System.out.println("Hibás osztály!");
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
    System.out.println("Az egyenlőszárú háromszögek területeinek összege: "+összeg);
  }

  public static void main(String[] args) {
    háromszögMent();
    háromszögLista();
    háromszögTerületÖsszeg();
    egyenlőszárúHáromszögTerületÖsszeg();
  }
}