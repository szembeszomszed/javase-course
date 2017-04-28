import java.awt.*;                                      //1
import javax.swing.*;

public class Nyomógombok1 extends JFrame {
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Nyomógombok1() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Nyomógombok");
    setBounds(kép.width/2-175, kép.height/2-75, 350, 150);
    setLayout(new GridLayout(2, 3));                    //2
    for(int i=1; i<=5; i++)
      add(new JButton(""+i));                           //3
    setVisible(true);
  }

  public static void main(String[] args) {
    new Nyomógombok1();
  }
}