import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HányszorNyomtak1 extends JFrame
    implements ActionListener {
  private JButton btGomb=new JButton("0");              //1
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public HányszorNyomtak1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Hányszor nyomtak?");
    setBounds(kép.width/2-125, kép.height/2-75, 250, 150);
    add(btGomb);
    btGomb.addActionListener(this);                     //2
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {
    btGomb.setText(
      ""+(Integer.parseInt(btGomb.getText())+1));       //3
  }

  public static void main(String[] args) {
    new HányszorNyomtak1();
  }
}