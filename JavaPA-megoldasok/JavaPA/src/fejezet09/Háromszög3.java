package fejezet09_Háromszög3;

public class Háromszög3 {                               //1

  private static Háromszög háromszög1, háromszög2,
                           háromszög3;                  //2

  public static void main(String[] args) {              //3
    System.out.println("Műveletek egyenlőoldalú "+
      "háromszöget megvalósító objektumokkal\n");

    háromszög1 = new Háromszög(15);                     //4
    System.out.println("A háromszög1 objektum osztálya: "+
      háromszög1.getClass());                           //5
    System.out.println("A Háromszög osztály ősosztálya: "+
      háromszög1.getClass().getSuperclass());           //6
    System.out.print("A háromszög1 oldalának hossza: ");
    //System.out.println(háromszög1.a);                 //7
    System.out.println(háromszög1.getA());              //8
    System.out.println("A háromszög1 kerülete: "+
      háromszög1.kerület());                            //9
    System.out.println("A háromszög1 területe: "+
      háromszög1.terület());                           //10
    System.out.println("\nA háromszög1 objektum " +
      "megszólítva:\n"+háromszög1);                    //11
    System.out.println("\nA háromszög1 oldalának " +
      "módosítási kísérlete -3-ra (setA(-3)).");
    háromszög1.setA(-3);                               //12
    System.out.println("\nA háromszög1 objektum " +
      "toString() metódusának meghívása:\n"+
      háromszög1.toString());                          //13

    háromszög2 = new Háromszög(10.5);
    System.out.println("\nA háromszög2 objektum " +
      "megszólítva:\n"+háromszög2);                    //14
    System.out.println("\nMegegyezik-e a két háromszög " +
      "(háromszög1 és háromszög2)? "+
      (háromszög1.equals(háromszög2)?"igen":"nem"));   //15

    háromszög3 = new Háromszög(1);
    System.out.println("\nA háromszög3 objektum " +
      "megszólítva:\n"+háromszög3);                    //16
    System.out.println("\nMegegyezik-e a két háromszög " +
      "(háromszög1 és háromszög3)? "+
      (háromszög1.equals(háromszög3)?"igen":"nem"));   //17
  }
}

class Háromszög {                                      //18

  private double a;                                    //19

  public Háromszög(double a) {                         //20
    setA(a);                                           //21
  }

  public void setA(double a) {                         //22
    if(a<=0)                                           //23
      a=1;                                             //24
    this.a=a;                                          //25
  }

  public double getA() {                               //26
    return a;
  }

  public double kerület() {                            //27
    return 3*a;
  }

  public double terület() {                            //28
    return a*a*Math.sqrt(3)/4;
  }

  @Override                                            //29
  public String toString() {                           //30
    return "Egyenlőoldalú háromszög\n" +
      "  oldalának hossza: "+a+
      "  kerülete: "+extra.Format.left(kerület(), 0, 2)+
      "  területe: "+extra.Format.left(terület(), 0, 2);
  }

  public boolean equals(Háromszög háromszög) {         //31
    return háromszög.getA()==a;                        //32
  }
}