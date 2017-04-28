import java.awt.*;
import java.awt.event.KeyEvent;                         //1
import java.awt.event.KeyListener;                      //2
import javax.swing.JFrame;

public class AblakBegépeltCímsor extends JFrame
    implements KeyListener {                            //3
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public AblakBegépeltCímsor() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-200, kép.height/2-50, 400, 100);
    addKeyListener(this);                               //4
    setVisible(true);
  }

  public void keyTyped(KeyEvent e) {                    //5
    setTitle(getTitle()+e.getKeyChar());                //6
  }

  public void keyPressed(KeyEvent e) {                  //7
    ;
  }

  public void keyReleased(KeyEvent e) {                 //8
    ;
  }

  public static void main(String[] args) {
    new AblakBegépeltCímsor();
  }
}