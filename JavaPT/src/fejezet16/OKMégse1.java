import java.awt.*;                                      //1
import javax.swing.JButton;                             //2
import javax.swing.JFrame;

public class OKMégse1 extends JFrame {
  private JButton btOK=new JButton("OK");               //3
  private JButton btMégse=new JButton("Mégse");         //4
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public OKMégse1() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("OK vagy mégse");
    setBounds(kép.width/2-175, kép.height/2-75, 350, 150);
    setLayout(new FlowLayout());                        //5
    add(btOK);                                          //6
    add(btMégse);                                       //7
    setVisible(true);
  }

  public static void main(String[] args) {
    new OKMégse1();
  }
}