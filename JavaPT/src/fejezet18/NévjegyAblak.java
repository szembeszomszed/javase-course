import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;                             //1
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

class Névjegy extends JDialog                           //2
    implements ActionListener {                         //3
  private JButton btOK=new JButton("OK");

  public Névjegy(JFrame tulajdonos, boolean modális) {  //4
    super(tulajdonos, "Névjegy", modális);              //5
    Rectangle szülő=getParent().getBounds();            //6
    setBounds(szülő.x+75, szülő.y+50, 150, 100);        //7
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    JPanel pnSzöveg=new JPanel();
    pnSzöveg.add(new JLabel(
      "<html>Készítette:<br>Kaczur Sándor<html>"));     //8
    add(pnSzöveg);
    JPanel pnGomb=new JPanel();
    pnGomb.add(btOK);                                   //9
    add(pnGomb);
    btOK.addActionListener(this);                      //10
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    dispose();                                         //11
  }
}

public class NévjegyAblak extends JFrame
    implements ActionListener {
  private JMenuBar mbFőmenü=new JMenuBar();
  private JMenu mNévjegy=new JMenu("Névjegy");
  private JCheckBoxMenuItem miModális=
    new JCheckBoxMenuItem("Modális", true);
  private JMenuItem miNévjegy=new JMenuItem("Névjegy");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public NévjegyAblak() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Névjegyablak");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setResizable(false);
    setJMenuBar(mbFőmenü);
    mbFőmenü.add(mNévjegy);
    mNévjegy.add(miModális);
    mNévjegy.addSeparator();
    mNévjegy.add(miNévjegy);
    miNévjegy.addActionListener(this);                 //12
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    boolean modális=miModális.isSelected();            //13
    new Névjegy(this, modális);                        //14
  }

  public static void main(String[] args) {
    new NévjegyAblak();
  }
}