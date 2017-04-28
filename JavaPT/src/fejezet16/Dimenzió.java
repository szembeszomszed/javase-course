import java.awt.Dimension;                              //1

public class Dimenzió {
  public static void main(String[] args) {
    System.out.println("Művelet dimenzióval (Dimension)");
    Dimension d=new Dimension(10, 5);                   //2
    System.out.println("A d dimenzió: "+d+              //3
      "\nmérete: "+d.getSize()+                         //4
      "\nszélessége: "+d.getWidth()+
      "\nmagassága: "+d.getHeight());
    System.out.println("Átméretezés kétszer akkorára");
    d.setSize(d.getWidth()*2, d.getHeight()*2);         //5
    System.out.println("A d dimenzió: "+d);
  }
}