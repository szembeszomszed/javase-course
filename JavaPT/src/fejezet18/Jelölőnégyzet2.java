import java.awt.*;
import java.awt.event.ItemEvent;                        //1
import java.awt.event.ItemListener;                     //2
import javax.swing.*;

public class Jelölőnégyzet2 extends JFrame
    implements ItemListener {                           //3
  private JLabel lbSzöveg=new JLabel("Minta szöveg.");
  private JCheckBox cbFélkövér=new JCheckBox("félkövér");
  private JCheckBox cbDőlt=new JCheckBox("dőlt");
  private Font betű=new Font("Monospaced", Font.PLAIN, 30);
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Jelölőnégyzet2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szöveg stílus");
    setBounds(kép.width/2-150, kép.height/2-60, 300, 120);
    setLayout(new GridLayout(2, 1));
    lbSzöveg.setHorizontalAlignment(SwingConstants.CENTER);
    lbSzöveg.setFont(betű);
    add(lbSzöveg);
    JPanel pn=new JPanel();
    pn.add(cbFélkövér);
    pn.add(cbDőlt);
    add(pn);
    cbFélkövér.addItemListener(this);                   //4
    cbDőlt.addItemListener(this);                       //5
    setVisible(true);
  }

  public void itemStateChanged(ItemEvent e) {           //6
    betű=lbSzöveg.getFont();                            //7
    int stílus=Font.PLAIN; // =0
    if(cbFélkövér.isSelected())
      stílus+=Font.BOLD;   // =1
    if(cbDőlt.isSelected())
      stílus+=Font.ITALIC; // =2
    lbSzöveg.setFont(
      new Font(betű.getName(),stílus, betű.getSize())); //8
  }

  public static void main(String[] args) {
    new Jelölőnégyzet2();
  }
}