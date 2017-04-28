import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Címke1 extends JFrame {
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Címke1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Java sziget térképe");
    setBounds(kép.width/2-250, kép.height/2-200, 500, 400);
    setResizable(false);
    setLayout(new BorderLayout());
    add(new JLabel(                                     //1
          new ImageIcon("./images/map_of_java.jpg")),   //2
        BorderLayout.NORTH);                            //3
    add(new JLabel(
          "Java sziget térképe", SwingConstants.CENTER),//4
        BorderLayout.CENTER);                           //5
    setVisible(true);
  }

  public static void main(String[] args) {
    new Címke1();
  }
}