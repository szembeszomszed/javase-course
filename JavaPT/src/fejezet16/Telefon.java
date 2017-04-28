import java.awt.*;
import javax.swing.*;

public class Telefon extends JFrame {
  private final String[] FELIRAT={
    "FLASH", "REDIAL", "HOLD",
    "1", "2", "3", "4", "5", "6", "7", "8", "9",
    "*", "0", "#"};
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Telefon() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Telefon");
    setBounds(kép.width/2-150, kép.height/2-75, 250, 300);
    setResizable(false);
    setLayout(new GridLayout(5, 3));
    add(new JButton(FELIRAT[0]));
    add(new JButton(FELIRAT[1]));
    add(new JButton(FELIRAT[2]));
    JButton bt;
    for(int i=4; i<=15; i++) {
      bt=new JButton(FELIRAT[i-1]);
      bt.setFont(new Font("Default", Font.PLAIN, 24));
      add(bt);
    }
    setVisible(true);
  }

  public static void main(String[] args) {
    new Telefon();
  }
}