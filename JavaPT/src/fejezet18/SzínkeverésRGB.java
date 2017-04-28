import java.awt.*;
import java.awt.event.AdjustmentEvent;                  //1
import java.awt.event.AdjustmentListener;               //2
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;                          //3

public class SzínkeverésRGB extends JFrame
    implements AdjustmentListener {                     //4

  private JPanel pnCsúszka=new JPanel();
  private JPanel pnSzín=new JPanel();
  private JScrollBar sbVörös=new JScrollBar();          //5
  private JScrollBar sbKék=new JScrollBar();
  private JScrollBar sbZöld=new JScrollBar();
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public SzínkeverésRGB() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-175, kép.height/2-150, 350, 300);
    setResizable(false);
    setLayout(new GridLayout(2,1));
    csúszkaBeállít("Vörös", sbVörös);                   //6
    csúszkaBeállít("Zöld", sbZöld);
    csúszkaBeállít("Kék", sbKék);
    add(pnCsúszka);
    add(pnSzín);
    setVisible(true);
    színBeállít();                                      //7
  }

  private void csúszkaBeállít(String szín,
      JScrollBar sb) {                                  //8
    pnCsúszka.add(new JLabel(szín+":"));
    sb.setMaximum(255+sb.getVisibleAmount());           //9
    sb.setValue(128);                                  //10
    sb.setPreferredSize(new Dimension(25, 100));       //11
    sb.addAdjustmentListener(this);                    //12
    pnCsúszka.add(sb);
  }

  private void színBeállít() {                         //13
    int r=255-sbVörös.getValue(), g=255-sbZöld.getValue(),
      b=255-sbKék.getValue();                          //14
    setTitle("RGB színkeverés ("+r+", "+g+", "+b+")"); //15
    pnSzín.setBackground(new Color(r, g, b));          //16
  }

  public void adjustmentValueChanged(AdjustmentEvent e) {
    színBeállít();                                     //17
  }

  public static void main(String[] args) {
    new SzínkeverésRGB();
  }
}