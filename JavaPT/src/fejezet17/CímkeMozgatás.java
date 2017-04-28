import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CímkeMozgatás extends JFrame implements KeyListener {
  private JLabel lbCímke=new JLabel("Mozgatható címke");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public CímkeMozgatás() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Nyilakkal mozgatható címke");
    setBounds(kép.width/2-150, kép.height/2-50, 300, 100);
    add(lbCímke);
    addKeyListener(this);
    setVisible(true);
  }

  public void keyTyped(KeyEvent e) {
    ;
  }

  public void keyPressed(KeyEvent e) {
    Rectangle címke=lbCímke.getBounds();
    switch(e.getKeyCode()) {
      case KeyEvent.VK_LEFT:   címke.x-=10; break;
      case KeyEvent.VK_RIGHT:  címke.x+=10; break;
      case KeyEvent.VK_UP:     címke.y-=10; break;
      case KeyEvent.VK_DOWN:   címke.y+=10;
    }
    lbCímke.setBounds(címke);
  }

  public void keyReleased(KeyEvent e) {
    ;
  }

  public static void main(String[] args) {
    new CímkeMozgatás();
  }
}