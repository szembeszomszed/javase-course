import java.awt.*;
import javax.swing.*;

public class Címke2 extends JFrame {
  private JLabel lbBalraNyíl=
    new JLabel("Balra nyíl",
      new ImageIcon("./images/nyíl_balra.jpg"),
      SwingConstants.CENTER);
  private JLabel lbJobbraNyíl=
    new JLabel("Jobbra nyíl",
      new ImageIcon("./images/nyíl_jobbra.jpg"),
      SwingConstants.CENTER);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Címke2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Nyilak");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setLayout(new GridLayout(2, 1));
    lbBalraNyíl.setHorizontalTextPosition(SwingConstants.TRAILING);
    add(lbBalraNyíl);
    lbJobbraNyíl.setHorizontalTextPosition(SwingConstants.LEADING);
    add(lbJobbraNyíl);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Címke2();
  }
}