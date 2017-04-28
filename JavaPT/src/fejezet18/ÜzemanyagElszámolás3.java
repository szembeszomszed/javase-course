import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

interface BenzinElszámolásAdat {
  String TÍPUS="ESZ-95 ólmozatlan motorbenzin";
  String[] LÖKETTÉRFOGAT={"<=1000",   //public static final
    "1001-1500", "1501-2000", "2001-3000", ">=3001"}; //cm3
  double[] FOGYASZTÁSINORMA=
    {7.6, 8.6, 9.5, 11.4, 13.3};   //liter benzin 100 km-re
  int AMORTIZÁCIÓ=9;                           //Ft 1 km-re
}

public class ÜzemanyagElszámolás3 extends JFrame
    implements BenzinElszámolásAdat, ActionListener {
  private JTextField tfTávolság=new JTextField(4);
  private JTextField tfÜzemanyagár=new JTextField(4);
  private JComboBox cbLökettérfogat=new JComboBox(LÖKETTÉRFOGAT);
  private JButton btKiszámol=new JButton("Kiszámol");
  private JLabel lbÜzenet=new JLabel("", SwingConstants.CENTER);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public ÜzemanyagElszámolás3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Üzemanyag-elszámolás " +"("+TÍPUS+")");
    setBounds(kép.width/2-350, kép.height/2-75, 700, 150);
    setLayout(new GridLayout(2,1));
    JPanel pn=new JPanel();
    pn.add(new JLabel("Távolság:"));
    pn.add(tfTávolság);
    pn.add(new JLabel("km      Üzemanyagár:"));
    pn.add(tfÜzemanyagár);
    pn.add(new JLabel("Ft/liter      Lökettérfogat:"));
    pn.add(cbLökettérfogat);
    pn.add(new JLabel("cm3   "));
    pn.add(btKiszámol);
    add(pn);
    add(lbÜzenet);
    btKiszámol.addActionListener(this);
    setVisible(true);
  }

  private void kiszámol() {
    int táv, ár;
    long összeg=0;
    double norma;
    try {
      if(tfTávolság.getText().equals(""))
        throw new IllegalArgumentException("Hiányzó távolság!");
      táv=Integer.parseInt(tfTávolság.getText());
      if(tfÜzemanyagár.getText().equals(""))
        throw new IllegalArgumentException("Hiányzó üzemanyagár!");
      ár=Integer.parseInt(tfÜzemanyagár.getText());
      norma=FOGYASZTÁSINORMA[cbLökettérfogat.getSelectedIndex()];
      összeg=Math.round((táv/100.0)*ár*norma+táv*AMORTIZÁCIÓ);
      lbÜzenet.setText("Az üzemanyagköltség " +
        "amortizációval: "+Long.toString(összeg)+" Ft.");
    }
    catch(IllegalArgumentException e) {
      lbÜzenet.setText(e.getMessage());
    }
  }

  public void actionPerformed(ActionEvent e) {
    kiszámol();
  }

  public static void main(String[] args) {
    new ÜzemanyagElszámolás3();
  }
}