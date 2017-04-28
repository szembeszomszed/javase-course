import java.awt.Point;                                  //1

public class Pont {
  public static void main(String[] args) {
    System.out.println("Műveletek pontokkal (Point)");
    Point p1=new Point(2, 3);                           //2
    Point p2=new Point(0, 5);                           //3
    System.out.println("A p1 pont: "+p1+                //4
      "\nA p2 pont: "+p2.getLocation());                //5
    System.out.println(
      "A p2 áthelyezése a (1, 4) koordinátára.");
    p2.setLocation(1, 4);                               //6
    System.out.println("A p2 pont: "+p2);
    System.out.println("A két pont távolsága: "+
      p1.distance(p2));                                 //7
    System.out.println(
      "A p2 eltolása jobbra 1 és fel 1 pozícióval.");
    p2.translate(1, -1);                                //8
    System.out.println("A p2 pont: "+p2);
    System.out.println("p1=p2? "+
      (p1.equals(p2)?"igen":"nem"));                    //9
    System.out.println(
      "A p2 áthelyezése a (2, 0) koordinátára.");
    p2.move(2, 0);                                     //10
    System.out.println("A p2 pont: "+p2);
  }
}