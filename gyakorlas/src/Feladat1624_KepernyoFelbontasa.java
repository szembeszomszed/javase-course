
import java.awt.Dimension;
import java.awt.Toolkit;

public class Feladat1624_KepernyoFelbontasa {
  public static void main(String[] args) {
   Toolkit tk = Toolkit.getDefaultToolkit();
   Dimension screenSize = tk.getScreenSize();
   System.out.println("Screen resolution: " + screenSize.getWidth() + "*" + screenSize.getHeight() + " dots.");
    System.out.println("Screen resolution: " + tk.getScreenResolution() + " dots/inch.");
  }  
}
