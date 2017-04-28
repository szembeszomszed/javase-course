import java.awt.*;
import javax.swing.*;

public class Felület2 extends JFrame {
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Felület2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Címkék, címkék");
    setBounds(kép.width/2-300, kép.height/2-100, 600, 200);
    setLayout(new GridLayout(4, 4));
    JLabel lb;
    Font font;
    for(int i=1; i<=16; i++) {
      lb=new JLabel(i+". címke");
      font=new Font("Arial", Font.BOLD, i*2);
      lb.setFont(font);
      add(lb);
    }
    setVisible(true);
  }

  public static void main(String[] args) {
    new Felület2();
  }
}