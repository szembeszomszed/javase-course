import java.awt.*;
import java.awt.event.*;
import javax.swing.JColorChooser;                       //1
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Színválasztás extends JFrame
    implements ActionListener {
  private JMenuBar mbFőmenü=new JMenuBar();
  private JMenu mSzín=new JMenu("Szín");
  private JMenuItem miSzínSzöveg=
    new JMenuItem("Szövegszín");
  private JMenuItem miSzínHáttér=
    new JMenuItem("Háttérszín");
  private JLabel lbSzöveg=new JLabel("Minta szöveg",
    SwingConstants.CENTER);
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Színválasztás() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-125, kép.height/2-100, 250, 200);
    setTitle("Színkiválasztás");
    setResizable(false);
    setJMenuBar(mbFőmenü);
    mbFőmenü.add(mSzín);
    mSzín.add(miSzínSzöveg);
    mSzín.add(miSzínHáttér);
    miSzínSzöveg.addActionListener(this);
    miSzínHáttér.addActionListener(this);
    lbSzöveg.setFont(new Font("Arial", Font.BOLD, 30));
    lbSzöveg.setOpaque(true);                           //2
    add(lbSzöveg, BorderLayout.CENTER);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String címsor=(e.getActionCommand());               //3
    Color szín=null;                                    //4
    szín=JColorChooser.showDialog(this, címsor, szín);  //5
    if(szín!=null) {                                    //6
      if(címsor.equals(miSzínSzöveg.getText()))         //7
        lbSzöveg.setForeground(szín);                   //8
      else if(címsor.equals(miSzínHáttér.getText()))    //9
        lbSzöveg.setBackground(szín);                  //10
    }
  }

  public static void main(String[] args) {
    new Színválasztás();
  }
}