import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AblakMozgatás extends JFrame
    implements KeyListener {
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public AblakMozgatás() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Nyilakkal mozgatható ablak");
    setBounds(kép.width/2-150, kép.height/2-50, 300, 100);
    addKeyListener(this);
    setVisible(true);
  }

  public void keyTyped(KeyEvent e) {
    ;
  }

  public void keyPressed(KeyEvent e) {                  //1
    Rectangle ablak=getBounds();                        //2
    switch(e.getKeyCode()) {                            //3
      case KeyEvent.VK_LEFT:   ablak.x-=10; break;      //4
      case KeyEvent.VK_RIGHT:  ablak.x+=10; break;
      case KeyEvent.VK_UP:     ablak.y-=10; break;
      case KeyEvent.VK_DOWN:   ablak.y+=10;             //5
    }
    setBounds(ablak);                                   //6
  }

  public void keyReleased(KeyEvent e) {
    ;
  }

  public static void main(String[] args) {
    new AblakMozgatás();
  }
}