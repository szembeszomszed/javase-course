import java.awt.*;
import java.awt.event.ComponentEvent;                   //1
import java.awt.event.ComponentListener;                //2
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AblakMéretPozíció1 extends JFrame
    implements ComponentListener {                      //3
  private JLabel lbMéret=new JLabel();
  private JLabel lbPozíció=new JLabel();
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public AblakMéretPozíció1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Ablak mérete és pozíciója?");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setLayout(new GridLayout(2, 1));
    lbMéret.setHorizontalAlignment(SwingConstants.CENTER);
    lbPozíció.setHorizontalAlignment(
      SwingConstants.CENTER);
    add(lbMéret);
    add(lbPozíció);
    addComponentListener(this);                         //4
    setVisible(true);
    kiírMéretPozíció();                                 //5
  }

  private void kiírMéretPozíció() {                     //6
    lbMéret.setText(
      "Ablak mérete: ["+getBounds().width+", "+         //7
                        getBounds().height+"]");        //8
    lbPozíció.setText(
      "Ablak pozíciója: ["+getBounds().x+", "+
                           getBounds().y+"]");
  }

  public void componentResized(ComponentEvent e) {      //9
    kiírMéretPozíció();
  }

  public void componentMoved(ComponentEvent e) {       //10
    kiírMéretPozíció();
  }

  public void componentShown(ComponentEvent e) {       //11
    ;
  }

  public void componentHidden(ComponentEvent e) {      //12
    ;
  }

  public static void main(String[] args) {
    new AblakMéretPozíció1();
  }
}