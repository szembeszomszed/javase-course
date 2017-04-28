import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenüSzámológép extends JFrame implements ActionListener {
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public MenüSzámológép() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Számológép - menü");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setResizable(false);

    JMenuBar mbFőmenü;
    JMenu mSzerkesztés, mNézet, mSúgó;
    JMenuItem miSzerkesztésMásolás, miSzerkesztésBeillesztés;
    JRadioButtonMenuItem miNézetNormál, miNézetTudományos;
    JMenuItem miNézetSzámjegyekCsoportosítása,
      miSúgóTémakörök, miSúgóNévjegy;
    setJMenuBar(mbFőmenü=new JMenuBar());
    mbFőmenü.add(mSzerkesztés=new JMenu("Szerkesztés"));
    mSzerkesztés.add(miSzerkesztésMásolás=new JMenuItem("Szerkesztés"));
    mSzerkesztés.add(miSzerkesztésBeillesztés=new JMenuItem("Beillesztés"));
    mbFőmenü.add(mNézet=new JMenu("Nézet"));
    ButtonGroup bg=new ButtonGroup();
    mNézet.add(miNézetNormál=new JRadioButtonMenuItem("Normál", true));
    mNézet.add(miNézetTudományos=new JRadioButtonMenuItem("Tudományos"));
    bg.add(miNézetNormál);
    bg.add(miNézetTudományos);
    mNézet.addSeparator();
    mNézet.add(miNézetSzámjegyekCsoportosítása=new JMenuItem("Számjegyek csoportosítása"));
    mbFőmenü.add(mSúgó=new JMenu("Súgó"));
    mSúgó.add(miSúgóTémakörök=new JMenuItem("Témakörök"));
    mSúgó.addSeparator();
    mSúgó.add(miSúgóNévjegy=new JMenuItem("Névjegy"));

    miSzerkesztésMásolás.addActionListener(this);
    miSzerkesztésBeillesztés.addActionListener(this);
    miNézetNormál.addActionListener(this);
    miNézetTudományos.addActionListener(this);
    miNézetSzámjegyekCsoportosítása.addActionListener(this);
    miSúgóTémakörök.addActionListener(this);
    miSúgóNévjegy.addActionListener(this);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println(e.getActionCommand());
  }

  public static void main(String[] args) {
    new MenüSzámológép();
  }
}