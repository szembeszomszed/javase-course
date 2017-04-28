import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HányadikTippreVanTalálat extends JFrame implements ActionListener{
  private String[] határTömb={"100", "500", "1000", "2000"};
  private JComboBox cbFelsőHatár=new JComboBox(határTömb);
  private JButton btKitalál=new JButton("Kitalál");
  private JList lsTalálat=new JList();
  private JLabel lbÜzenet=new JLabel();
  private DefaultListModel dl=new DefaultListModel();
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public HányadikTippreVanTalálat() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Hányadik tippre van találat?");
    setBounds(kép.width/2-150, kép.height/2-150, 300, 300);
    setLayout(new BorderLayout());
    JPanel pn=new JPanel();
    pn.add(new JLabel("Felső határ: "));
    pn.add(cbFelsőHatár);
    pn.add(btKitalál);
    add(pn, BorderLayout.NORTH);
    add(new JScrollPane(lsTalálat), BorderLayout.CENTER);
    add(lbÜzenet, BorderLayout.SOUTH);
    btKitalál.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    dl.clear();
    lbÜzenet.setText("");
    int max=Integer.parseInt(""+cbFelsőHatár.getSelectedItem());
    int tipp, kitalálandó=(int)(Math.random()*(max+1))+1;
    int tippDb=0;
    do {
      tipp=(int)(Math.random()*(max+1))+1;
      tippDb++;
      dl.addElement(tippDb+". tipp: "+tipp);
    } while(tipp!=kitalálandó);
    lsTalálat.setModel(dl);
    lbÜzenet.setText("<html>A program az 1-től "+max+
      "-ig tippelt<br>véletlenszámot "+tippDb+" lépésben találta ki.</html>");
  }

  public static void main(String[] args) {
    new HányadikTippreVanTalálat();
  }
}