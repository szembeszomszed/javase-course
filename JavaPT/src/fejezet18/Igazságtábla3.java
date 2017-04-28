import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Igazságtábla3 extends JFrame implements ActionListener {
  private boolean[] a={false, false, true, true};
  private boolean[] b={false, true, false, true};
  private final String[] MŰVJEL={"&&","||","^","->","<->"};
  private final String[] MŰVELET={"és", "megengedő vagy",
    "kizáró vagy", "implikáció", "ekvivalencia"};
  private JComboBox cbMűvelet=new JComboBox(MŰVJEL);
  private JLabel[] lbLogikaiÉrtékTömb=new JLabel[4];
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Igazságtábla3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-175, kép.height/2-100, 350, 200);
    setResizable(false);
    setLayout(new GridLayout(5,3));
    add(new JLabel("A")); add(new JLabel("B"));
    JPanel pnMűvelet=new JPanel();
    pnMűvelet.add(new JLabel("A"));
    pnMűvelet.add(cbMűvelet);
    pnMűvelet.add(new JLabel("B"));
    add(pnMűvelet);
    cbMűvelet.addActionListener(this);
    int i;
    for(i=0; i<lbLogikaiÉrtékTömb.length; i++) {
      add(new JLabel(a[i]?"igaz":"hamis"));
      add(new JLabel(b[i]?"igaz":"hamis"));
      add(lbLogikaiÉrtékTömb[i]=new JLabel());
    }
    for(i=0; i<getContentPane().getComponentCount(); i++) {
      Component komponens=getContentPane().getComponent(i);
      if(komponens instanceof JLabel)
        ((JLabel)(komponens)).setHorizontalAlignment(SwingConstants.CENTER);
    }
    setVisible(true);
    logikaiÉrtékek();
  }

  private void logikaiÉrtékek() {
    setTitle("Igazságtábla ("+
      MŰVELET[cbMűvelet.getSelectedIndex()]+")");
    boolean[] e=new boolean[4];
    for(int i=0; i<lbLogikaiÉrtékTömb.length; i++) {
      switch(cbMűvelet.getSelectedIndex()) {
        case 0: e[i]=(a[i]&&b[i]); break;              //és
        case 1: e[i]=(a[i]||b[i]); break;  //megengedő vagy
        case 2: e[i]=(a[i]^b[i]); break;      //kizáró vagy
        case 3: e[i]=(!a[i]||b[i]); break;     //implikáció
        case 4: e[i]=(!(a[i]^b[i]));         //ekvivalencia
      }
      lbLogikaiÉrtékTömb[i].setText(e[i]?"igaz":"hamis");
    }
  }

  public void actionPerformed(ActionEvent e) {
    logikaiÉrtékek();
  }

  public static void main(String[] args) {
    new Igazságtábla3();
  }
}