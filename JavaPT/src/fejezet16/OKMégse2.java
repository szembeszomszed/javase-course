import java.awt.*;
import javax.swing.BoxLayout;                           //1
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;                              //2

public class OKMégse2 extends JFrame {
  private JButton btOK=new JButton("OK");
  private JButton btMégse=new JButton("Mégse");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public OKMégse2() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("OK vagy mégse");
    setBounds(kép.width/2-175, kép.height/2-75, 350, 150);
    JPanel pn=new JPanel();                             //3
    pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));  //4
    pn.add(btOK);                                       //5
    pn.add(btMégse);                                    //6
    add(pn);                                            //7
    setVisible(true);
  }

  public static void main(String[] args) {
    new OKMégse2();
  }
}