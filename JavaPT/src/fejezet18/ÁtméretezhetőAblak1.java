import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ÁtméretezhetőAblak1 extends JFrame implements ActionListener {
  private JRadioButton rbIgen=new JRadioButton("Igen", true);
  private JRadioButton rbNem=new JRadioButton("Nem");
  private ButtonGroup bg=new ButtonGroup();
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public ÁtméretezhetőAblak1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Méretezhető az ablak?");
    setBounds(kép.width/2-150, kép.height/2-50, 300, 100);
    setLayout(new FlowLayout());
    add(new JLabel("Méretezhető az ablak?"));
  }

  public void actionPerformed(ActionEvent ev) {
    setResizable(ev.getSource()==rbIgen);
  }

  public static void main(String[] args) {
    new ÁtméretezhetőAblak1();
  }
}