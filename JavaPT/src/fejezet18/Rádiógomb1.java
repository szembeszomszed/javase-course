import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Rádiógomb1 extends JFrame
    implements ActionListener {
  private JLabel lbFizetésiMód=new JLabel();
  private JRadioButton rbKészpénz=
    new JRadioButton("készpénz", true);                 //1
  private JRadioButton rbÁtutalás=
    new JRadioButton("átutalás");                       //2
  private JRadioButton rbCsekk=new JRadioButton("csekk");
  private ButtonGroup bg=new ButtonGroup();             //3
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Rádiógomb1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Fizetési mód");
    setBounds(kép.width/2-125, kép.height/2-60, 250, 120);
    setLayout(new FlowLayout());                        //4
    JPanel pn1=new JPanel(new GridLayout(2, 1));        //5
    pn1.add(new JLabel("Fizetési mód: "));              //6
    pn1.add(lbFizetésiMód);                             //7
    add(pn1);
    JPanel pn2=new JPanel(new GridLayout(3, 1));        //8
    pn2.add(rbKészpénz); bg.add(rbKészpénz);            //9
    pn2.add(rbÁtutalás); bg.add(rbÁtutalás);
    pn2.add(rbCsekk);    bg.add(rbCsekk);
    add(pn2);
    rbKészpénz.addActionListener(this);                //10
    rbÁtutalás.addActionListener(this);
    rbCsekk.addActionListener(this);
    rbKészpénz.doClick();                              //11
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String fizetésiMód=
      ((JRadioButton)e.getSource()).getText();         //12
    lbFizetésiMód.setText(fizetésiMód);                //13
  }

  public static void main(String[] args) {
    new Rádiógomb1();
  }
}