import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;                       //1

public class RobotÉsLépcső2 extends JFrame {
  private JLabel lbLépcső=
    new JLabel(new ImageIcon("./images/lépcső.gif"));   //2
  private JLabel lbRobot=
    new JLabel(new ImageIcon("./images/robot.jpg"));
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public RobotÉsLépcső2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Robot és lépcső");
    setBounds(kép.width/2-400, kép.height/2-200, 800, 400);
    setResizable(false);
    JPanel pn=new JPanel();                             //3
    pn.setLayout(new OverlayLayout(pn));                //4
    pn.add(lbRobot);                                    //5
    lbRobot.setAlignmentX(0);                           //6
    lbRobot.setAlignmentY(0);                           //7
    pn.add(lbLépcső);
    lbLépcső.setAlignmentX(0);
    lbLépcső.setAlignmentY(0);
    add(pn);                                            //8
    setVisible(true);
  }

  public static void main(String[] args) {
    new RobotÉsLépcső2();
  }
}