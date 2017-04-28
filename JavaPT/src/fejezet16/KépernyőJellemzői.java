import java.awt.Dimension;
import java.awt.Toolkit;                                //1

public class KépernyőJellemzői {
  public static void main(String[] args) {
    Toolkit tk=Toolkit.getDefaultToolkit();             //2
    Dimension képMéret=tk.getScreenSize();              //3
    System.out.println("A képernyő felbontása: "+
      képMéret.getWidth()+"*"+képMéret.getHeight()+
      " képpont");
    System.out.println("A képernyő felbontása: "+
      tk.getScreenResolution()+" pont/inch");           //4
  }
}