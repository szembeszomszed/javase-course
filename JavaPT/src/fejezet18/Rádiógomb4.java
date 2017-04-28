import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rádiógomb4 extends JFrame implements ActionListener {
  private JRadioButton rbPiros=new JRadioButton("piros", true);
  private JRadioButton rbFehér=new JRadioButton("fehér");
  private JRadioButton rbZöld=new JRadioButton("töld");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Rádiógomb4() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Háttérszín");
    setBounds(kép.width/2-150, kép.height/2-60, 300, 120);
    setLayout(new FlowLayout());
    ButtonGroup bg=new ButtonGroup();
    add(rbPiros);   bg.add(rbPiros);   rbPiros.addActionListener(this);
    add(rbFehér); bg.add(rbFehér); rbFehér.addActionListener(this);
    add(rbZöld);  bg.add(rbZöld);  rbZöld.addActionListener(this);
    setVisible(true);
    rbPiros.doClick();
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==rbPiros)
      getContentPane().setBackground(Color.RED);
    if(e.getSource()==rbFehér)
      getContentPane().setBackground(Color.WHITE);
    if(e.getSource()==rbZöld)
      getContentPane().setBackground(Color.GREEN);
  }

  public static void main(String[] args) {
    new Rádiógomb4();
  }
}