package fejezet16;

import java.awt.Point;
import java.awt.Rectangle;                              //1

public class Téglalap {
  public static void main(String[] args) {
    System.out.println("Művelet téglalappal (Rectangle)");
    Rectangle t1=new Rectangle(30, 10, 300, 150);       //2
    Rectangle t2=new Rectangle(80, 50, 150, 200);       //3
    System.out.println("A t1: "+t1+
      "\nA t1: "+t1.getBounds()+                        //4
      "\nbal felső sarok: "+t1.getLocation()+           //5
      "\nszélesség és magasság: "+t1.getSize());        //6
    Point p=new Point(335, 100);                        //7
    System.out.println("A p pont: "+p);
    System.out.println("p pont hozzáadása t1 téglalaphoz");
    t1.add(p);                                          //8
    System.out.println("A t1: "+t1);
    System.out.println("A t1 eltolása felfelé 5-tel");
    t1.translate(0, -5);                                //9
    System.out.println("A t1: "+t1);
    System.out.println("A t2: "+t2);
    System.out.println("A t1 és t2 téglalap közös része "+
      "(metszet):");
    Rectangle metszet=t1.intersection(t2);             //10
    System.out.println(metszet);
    System.out.println("A t1 és t2 téglalapokat " +
      "tartalmazó téglalap (unió):");
    Rectangle unió=t1.union(t2);                       //11
    System.out.println(unió);
  }
}