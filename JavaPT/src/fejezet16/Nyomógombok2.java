import java.awt.*;                                      //1
import javax.swing.*;

public class Nyomógombok2 extends JFrame {
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Nyomógombok2() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Nyomógombok");
    setBounds(kép.width/2-150, kép.height/2-150, 300, 300);
    setLayout(new BorderLayout());                      //2
    add(new JButton("Észak"), BorderLayout.NORTH);      //3
    add(new JButton("Nyugat"), BorderLayout.WEST);      //4
    add(new JButton("Közép"), BorderLayout.CENTER);     //5
    add(new JButton("Kelet"), BorderLayout.EAST);       //6
    add(new JButton("Dél"), BorderLayout.SOUTH);        //7
    setVisible(true);
  }

  public static void main(String[] args) {
    new Nyomógombok2();
  }
}