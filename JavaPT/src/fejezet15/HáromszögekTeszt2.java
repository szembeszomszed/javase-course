package fejezet15;

import java.util.Vector;

public class HáromszögekTeszt2 {
  private static Vector<ÁltalánosHáromszög> vektor=
    new Vector<ÁltalánosHáromszög>();                   //1

  static void vektorFeltölt() {
    int típus;
    double a, b, c;
    while(vektor.size()<10)                             //2
      try {
        típus=(int)(Math.random()*3);                   //3
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
        ;                                               //4
      }
  }

  static void vektorLista(String üzenet) {              //5
    System.out.println(üzenet);
    for(ÁltalánosHáromszög elem: vektor)
      System.out.println(elem.getClass().getName()+
        " T="+elem.terület());
    System.out.println();
  }

  static void háromszögTerületÖsszeg() {
    double összeg=0;
    for(ÁltalánosHáromszög elem: vektor)                //6
      összeg+=elem.terület();                           //7
    System.out.println("A háromszögek területeinek " +
      "összege: "+összeg);
  }

  static void egyenlőszárúHáromszögTerületÖsszeg() {
    double összeg=0;
    for(ÁltalánosHáromszög elem: vektor)                //8
      if(elem instanceof EgyenlőszárúHáromszög &&       //9
          !(elem instanceof EgyenlőoldalúHáromszög))   //10
        összeg+=elem.terület();
    System.out.println("Az egyenlőszárú háromszögek " +
      "területeinek összege: "+összeg);
  }

  public static void main(String[] args) {
    vektorFeltölt();
    vektorLista("A háromszögek listája:");
    háromszögTerületÖsszeg();
    egyenlőszárúHáromszögTerületÖsszeg();
  }
}