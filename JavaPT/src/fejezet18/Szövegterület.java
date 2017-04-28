import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;                         //1
import javax.swing.JTextArea;                           //2

public class Szövegterület extends JFrame
    implements KeyListener {                            //3
  private JTextArea taSzöveg=new JTextArea(5, 30);      //4
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Szövegterület() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szövegterület");
    setBounds(kép.width/2-150, kép.height/2-75, 350, 150);
    taSzöveg.addKeyListener(this);                      //5
    add(new JLabel("Nagybetűssé alakító szövegterület:"),
                   BorderLayout.NORTH);
    JPanel pn=new JPanel();
    pn.add(new JScrollPane(taSzöveg));                  //6
    add(pn, BorderLayout.CENTER);
    setVisible(true);
  }

  public void keyTyped(KeyEvent e) {                    //7
    e.setKeyChar(Character.toUpperCase(e.getKeyChar()));
  }

  public void keyPressed(KeyEvent e) {
    ;
  }

  public void keyReleased(KeyEvent e) {
    ;
  }

  public static void main(String[] args) {
    new Szövegterület();
  }
}