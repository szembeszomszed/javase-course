import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Nyomógomb1 extends JFrame
    implements ActionListener {                         //1
  private JLabel lbSzöveg=new JLabel("Minta szöveg.");  //2
  private JButton btBalra=new JButton("Balra");         //3
  private JButton btKözépre=new JButton("Középre");
  private JButton btJobbra=new JButton("Jobbra");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Nyomógomb1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szöveg igazítás");
    setBounds(kép.width/2-150, kép.height/2-60, 300, 120);
    setLayout(new GridLayout(2, 1));
    add(lbSzöveg);
    btBalra.addActionListener(this);                    //4
    btKözépre.addActionListener(this);
    btJobbra.addActionListener(this);
    JPanel pn=new JPanel();                             //5
    pn.add(btBalra);                                    //6
    pn.add(btKözépre);
    pn.add(btJobbra);
    add(pn);                                            //7
    btBalra.doClick();                                  //8
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {          //9
    if(e.getSource()==btBalra)
      lbSzöveg.setHorizontalAlignment(SwingConstants.LEFT);
    else if(e.getSource()==btKözépre)                  //10
      lbSzöveg.setHorizontalAlignment(                 //11
        SwingConstants.CENTER);                        //12
    else //btJobbra
      lbSzöveg.setHorizontalAlignment(
        SwingConstants.RIGHT);
  }

  public static void main(String[] args) {
    new Nyomógomb1();
  }
}