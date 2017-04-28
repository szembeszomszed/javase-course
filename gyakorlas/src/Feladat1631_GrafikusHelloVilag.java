
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Feladat1631_GrafikusHelloVilag extends JFrame {
  private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
  
  public Feladat1631_GrafikusHelloVilag() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Cső!");
    setBounds(screen.width / 2 - 100, screen.height / 2 - 200, 400, 200);
    setVisible(true);    
  }
  
  public static void main(String[] args) {
    new Feladat1631_GrafikusHelloVilag();
  }
  
}
