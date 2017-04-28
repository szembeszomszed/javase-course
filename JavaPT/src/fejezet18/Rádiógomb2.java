import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rádiógomb2 extends JFrame implements ActionListener {
  private ImageIcon iiNői=new ImageIcon("./images/agy-no.gif");
  private ImageIcon iiFérfi=new ImageIcon("./images/agy-ffi.gif");
  private JLabel lbAgy=new JLabel(iiNői);
  private JRadioButton rbNői=new JRadioButton("női agy", true);
  private JRadioButton rbFérfi=new JRadioButton("férfi agy");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Rádiógomb2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Női agy, férfi agy ;-)");
    setBounds(kép.width/2-250, kép.height/2-215, 500, 430);
    setResizable(false);
    setLayout(new BorderLayout());
    JPanel pn=new JPanel();
    ButtonGroup bg=new ButtonGroup();
    pn.add(rbNői);   bg.add(rbNői);
    pn.add(rbFérfi); bg.add(rbFérfi);
    add(pn, BorderLayout.NORTH);
    add(lbAgy, BorderLayout.CENTER);
    rbNői.addActionListener(this);
    rbFérfi.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==rbNői)
      lbAgy.setIcon(iiNői);
    else
      lbAgy.setIcon(iiFérfi);
  }

  public static void main(String[] args) {
    new Rádiógomb2();
  }
}