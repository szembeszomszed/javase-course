import java.awt.*;
import javax.swing.*;

public class Felület1 extends JFrame {
  private JLabel lbSzöveg=new JLabel("Minta szöveg.");
  private JButton btBalra=new JButton("Balra");
  private JButton btKözépre=new JButton("Középre");
  private JButton btJobbra=new JButton("Jobbra");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Felület1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szöveg igazítás");
    setBounds(kép.width/2-150, kép.height/2-60, 300, 120);
    setLayout(new GridLayout(2, 1));
    add(lbSzöveg);
    JPanel pn=new JPanel();
    pn.add(btBalra);
    pn.add(btKözépre);
    pn.add(btJobbra);
    add(pn);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Felület1();
  }
}