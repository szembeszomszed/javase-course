import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rádiógomb3 extends JFrame implements ActionListener {
  private JLabel lbSzöveg=new JLabel("Minta szöveg.");
  private JRadioButton rbBalra=new JRadioButton("balra");
  private JRadioButton rbKözépre=new JRadioButton("középre", true);
  private JRadioButton rbJobbra=new JRadioButton("jobbra");
  private Font betű=new Font("Arial", Font.PLAIN, 20);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Rádiógomb3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szöveg igazítás");
    setBounds(kép.width/2-150, kép.height/2-60, 300, 120);
    setLayout(new GridLayout(2, 1));
    lbSzöveg.setHorizontalAlignment(SwingConstants.CENTER);
    lbSzöveg.setFont(betű);
    add(lbSzöveg);
    ButtonGroup bg=new ButtonGroup();
    JPanel pn=new JPanel();
    pn.add(rbBalra);   bg.add(rbBalra);   rbBalra.addActionListener(this);
    pn.add(rbKözépre); bg.add(rbKözépre); rbKözépre.addActionListener(this);
    pn.add(rbJobbra);  bg.add(rbJobbra);  rbJobbra.addActionListener(this);
    add(pn);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==rbBalra)
      lbSzöveg.setHorizontalAlignment(SwingConstants.LEFT);
    if(e.getSource()==rbKözépre)
      lbSzöveg.setHorizontalAlignment(SwingConstants.CENTER);
    if(e.getSource()==rbJobbra)
      lbSzöveg.setHorizontalAlignment(SwingConstants.RIGHT);
  }

  public static void main(String[] args) {
    new Rádiógomb3();
  }
}