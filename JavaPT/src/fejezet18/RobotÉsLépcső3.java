import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RobotÉsLépcső3 extends JFrame
    implements ActionListener {
  private int lépcsőfok=10;
  private Timer időzítő=new Timer(1000, this);
  private JLabel lbLépcső=new JLabel(new ImageIcon("./images/lépcső.gif"));
  private JLabel lbRobot=new JLabel(new ImageIcon("./images/robot.jpg"));
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public RobotÉsLépcső3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Robot és lépcső");
    setBounds(kép.width/2-400, kép.height/2-200, 800, 400);
    setResizable(false);
    JPanel pn=new JPanel();
    pn.setLayout(new OverlayLayout(pn));
    pn.add(lbRobot);
    lbRobot.setAlignmentX(0);
    lbRobot.setAlignmentY(0);
    pn.add(lbLépcső);
    lbLépcső.setAlignmentX(0);
    lbLépcső.setAlignmentY(0);
    add(pn);
    setVisible(true);
    időzítő.start();
  }

  public void actionPerformed(ActionEvent e) {
    Rectangle robot=lbRobot.getBounds();
    robot.translate(70, 25);
    lbRobot.setBounds(robot);
    lépcsőfok--;
    if(lépcsőfok==0)
      időzítő.stop();
  }

  public static void main(String[] args) {
    new RobotÉsLépcső3();
  }
}