import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HányszorNyomtak2 extends JFrame implements ActionListener {
  private int nyomásDb=0;
  private JButton btGomb=new JButton(""+nyomásDb);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public HányszorNyomtak2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Hányszor nyomtak?");
    setBounds(kép.width/2-125, kép.height/2-50, 250, 100);
    add(btGomb);
    btGomb.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {
    btGomb.setText(""+(++nyomásDb));
  }

  public static void main(String[] args) {
    new HányszorNyomtak2();
  }
}