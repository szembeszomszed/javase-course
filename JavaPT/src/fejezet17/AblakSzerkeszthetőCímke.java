import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AblakSzerkeszthetőCímke extends JFrame implements KeyListener {
  private StringBuffer szöveg=new StringBuffer("szerkeszthető címke");
  private JLabel lb=new JLabel(szöveg.toString());
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public AblakSzerkeszthetőCímke() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szerkeszthető címke");
    setBounds(kép.width/2-200, kép.height/2-50, 400, 100);
    lb.setHorizontalAlignment(SwingConstants.CENTER);
    add(lb);
    addKeyListener(this);
    setVisible(true);
  }

  public void keyTyped(KeyEvent e) {
    ;
  }

  public void keyPressed(KeyEvent e) {
    char karakter=Character.valueOf(e.getKeyChar());
    if(karakter==KeyEvent.VK_DELETE || karakter==KeyEvent.VK_BACK_SPACE) {
      try {
        szöveg.deleteCharAt(szöveg.length()-1);
      }
      catch(StringIndexOutOfBoundsException ex) {
        ;
      }
    }
    else
      szöveg.insert(szöveg.length(), karakter);
    lb.setText(szöveg.toString());
  }

  public void keyReleased(KeyEvent e) {
    ;
  }

  public static void main(String[] args) {
    new AblakSzerkeszthetőCímke();
  }
}