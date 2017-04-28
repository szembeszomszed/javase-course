import java.awt.*;
import javax.swing.*;

public class Felület3 extends JFrame {
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Felület3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Színes panelek");
    setBounds(kép.width/2-150, kép.height/2-75, 300, 150);
    setLayout(new GridLayout(4, 4));
    JPanel pn;
    for(int i=1; i<=16; i++) {
      pn=new JPanel();
      pn.setBackground(
        new Color((int)(Math.random()*256),
                  (int)(Math.random()*256),
                  (int)(Math.random()*256)));
      add(pn);
    }
    setVisible(true);
  }

  public static void main(String[] args) {
    new Felület3();
  }
}