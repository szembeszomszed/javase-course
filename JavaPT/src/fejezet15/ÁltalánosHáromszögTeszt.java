package fejezet15;

public class ÁltalánosHáromszögTeszt {
  public static void main(String[] args) {
    ÁltalánosHáromszög h1=
      new ÁltalánosHáromszög(3, 4, 5);                  //1
    ÁltalánosHáromszög h2=new ÁltalánosHáromszög(5, 3, 4);
    ÁltalánosHáromszög h3=new ÁltalánosHáromszög(5, 8, 9);

    System.out.println("h1: "+h1);                      //2
    System.out.println("Osztály: "+h1.getClass());      //3
    System.out.println("Ősosztály: "+
      h1.getClass().getSuperclass());                   //4
    //System.out.println("'a' oldal: "+h1.a);           //5
    System.out.println("'a' oldal: "+h1.getA());        //6
    System.out.println("Kerület: "+h1.kerület());       //7
    System.out.println("Terület: "+h1.terület());       //8

    System.out.println("\nh2: "+h2);
    System.out.println("h1=h2? "+
      (h1.equals(h2)?"igen":"nem"));                    //9

    System.out.println("\nh3: "+h3);

    System.out.println("\nA h1 és h3 közül melyik " +
      "háromszögnek nagyobb a területe? "+
      (h1.compareTo(h3)==1?"h1":"h3"));                //10
  }
}