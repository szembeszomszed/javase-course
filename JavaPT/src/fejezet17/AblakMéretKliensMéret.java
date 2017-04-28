import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AblakMéretKliensMéret extends JFrame implements ComponentListener {
  private JLabel lbMéret=new JLabel();
  private JLabel lbkliensMéret=new JLabel();
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public AblakMéretKliensMéret() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Ablak mérete, kliens mérete?");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setLayout(new GridLayout(2, 1));
    lbMéret.setHorizontalAlignment(SwingConstants.CENTER);
    lbkliensMéret.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbMéret);
    add(lbkliensMéret);
    addComponentListener(this);
    setVisible(true);
    beállítMéretPozíció();
  }

  private void beállítMéretPozíció() {
    lbMéret.setText(
      "Ablak mérete: ["+getBounds().width+", "+
                        getBounds().height+"]");
    lbkliensMéret.setText(
      "Kliens mérete: ["+getContentPane().getSize().width+", "+
                         getContentPane().getSize().height+"]");
  }

  public void componentResized(ComponentEvent e) {
    beállítMéretPozíció();
  }

  public void componentMoved(ComponentEvent e) {
    beállítMéretPozíció();
  }

  public void componentShown(ComponentEvent e) {
    ;
  }

  public void componentHidden(ComponentEvent e) {
    ;
  }

  public static void main(String[] args) {
    new AblakMéretKliensMéret();
  }
}