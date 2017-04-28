import java.awt.*;
import java.awt.event.WindowEvent;                      //1
import java.awt.event.WindowListener;                   //2
import javax.swing.JFrame;

public class AblakEsemények extends JFrame
    implements WindowListener {                         //3
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public AblakEsemények() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Ablakesemények");
    setBounds(kép.width/2-150, kép.height/2-50, 300, 100);
    addWindowListener(this);                            //4
    setVisible(true);
  }

  public void windowOpened(WindowEvent e) {             //5
    System.out.println("Az ablakot megnyitották.");
  }

  public void windowClosing(WindowEvent e) {            //6
    System.out.println("Az ablakot be akarják zárni.");
  }

  public void windowClosed(WindowEvent e) {             //7
    System.out.println("Az ablakot bezárták.");
  }

  public void windowIconified(WindowEvent e) {          //8
    System.out.println("Az ablak ikon állapotba került.");
  }

  public void windowDeiconified(WindowEvent e) {        //9
    System.out.println("Az ablak normál állapotba került.");
  }

  public void windowActivated(WindowEvent e) {         //10
    System.out.println("Az ablak aktív lett.");
  }

  public void windowDeactivated(WindowEvent e) {       //11
    System.out.println("Az ablak inaktív lett.");
  }

  public static void main(String[] args) {
    new AblakEsemények();
  }
}