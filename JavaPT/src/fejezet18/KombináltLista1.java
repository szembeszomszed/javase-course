import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class KombináltLista1 extends JFrame
    implements ActionListener {
  private final String[] FIZETÉSIMÓD=
    {"készpénz", "átutalás", "csekk"};                  //1
  private JComboBox cbFizetésiMód=
    new JComboBox(FIZETÉSIMÓD);                         //2
  private JLabel lbFizetésiMód=new JLabel(
    "<html>Fizetési mód:<br>készpénz</html>");          //3
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public KombináltLista1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Fizetési mód");
    setBounds(kép.width/2-125, kép.height/2-60, 250, 120);
    setLayout(new GridLayout(2, 1));
    JPanel pn1=new JPanel();
    pn1.add(new JLabel("Fizetési mód: "));
    pn1.add(cbFizetésiMód);                             //4
    add(pn1);
    lbFizetésiMód.setHorizontalAlignment(
      SwingConstants.CENTER);
    add(lbFizetésiMód);
    cbFizetésiMód.addActionListener(this);              //5
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String fizetésiMód=""+
      ((JComboBox)e.getSource()).getSelectedItem();     //6
    lbFizetésiMód.setText(
      "<html>Fizetési mód:<br>"+fizetésiMód+"</html>"); //7
  }

  public static void main(String[] args) {
    new KombináltLista1();
  }
}