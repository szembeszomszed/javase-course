package fejezet15;

public class EgyenlőoldalúHáromszögTeszt {
  public static void main(String[] args) {
    EgyenlőoldalúHáromszög h1=
      new EgyenlőoldalúHáromszög(12);                   //1
    EgyenlőszárúHáromszög h2=
      new EgyenlőszárúHáromszög(12, 12);
    ÁltalánosHáromszög h3=
      new ÁltalánosHáromszög(12, 12, 12);

    System.out.println("h1: "+h1);
    System.out.println("Osztály: "+
      h1.getClass().getName());                         //2
    System.out.println("Ősosztály: "+
      h1.getClass().getSuperclass().getName());         //3
    //System.out.println("'a' oldal: "+h1.a);
    System.out.println("'a' oldal: "+h1.getA());
    System.out.println("'b' oldal: "+h1.getB());
    System.out.println("'c' oldal: "+h1.getC());
    System.out.println("Kerület: "+h1.kerület());
    System.out.println("Terület: "+h1.terület());

    System.out.println("\nh2: "+h2);
    System.out.println("h1=h2? "+
      (h1.equals(h2)?"igen":"nem"));                    //4

    System.out.println("Megegyezik a h1 és h2 " +
      "háromszögek területe? "+
      (h1.compareTo(h2)==0?"igen":"nem"));              //5

    System.out.println("\nh3: "+h3);

    System.out.println("h1=h3? "+
      (h1.equals(h3)?"igen":"nem"));                    //6

    System.out.println("Megegyezik a h1 és h3 " +
      "háromszögek területe? "+
      (h1.compareTo(h3)==0?"igen":"nem"));              //7
  }
}