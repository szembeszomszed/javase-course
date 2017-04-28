package fejezet15;

public class EgyenlőszárúHáromszögTeszt {
  public static void main(String[] args) {
    EgyenlőszárúHáromszög h1=
      new EgyenlőszárúHáromszög(4, 5);                  //1
    EgyenlőszárúHáromszög h2=
      new EgyenlőszárúHáromszög(5, 4);
    ÁltalánosHáromszög h3=new ÁltalánosHáromszög(5, 4, 5);

    System.out.println("h1: "+h1);
    System.out.println("Osztály: "+h2.getClass());
    System.out.println("Ősosztály: "+
      h2.getClass().getSuperclass());                   //2
    //System.out.println("'a' oldal: "+h2.a);
    System.out.println("'a' oldal: "+h2.getA());        //3
    System.out.println("'b' oldal: "+h2.getB());
    System.out.println("'c' oldal: "+h2.getC());
    System.out.println("Kerület: "+h2.kerület());       //4
    System.out.println("Terület: "+h2.terület());

    System.out.println("\nh2: "+h2);
    System.out.println("h1=h2? "+
      (h1.equals(h2)?"igen":"nem"));                    //5

    System.out.println("Megegyezik a h1 és h2 " +
      "háromszögek területe? "+
      (h1.compareTo(h2)==0?"igen":"nem"));              //6

    System.out.println("\nh3: "+h3);

    System.out.println("h1=h3? "+
      (h1.equals(h3)?"igen":"nem"));                    //7

    System.out.println("Megegyezik a h1 és h3 " +
      "háromszögek területe? "+
      (h1.compareTo(h3)==0?"igen":"nem"));              //8
  }
}