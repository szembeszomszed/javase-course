import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenüMinta extends JFrame
    implements ActionListener {
  private JMenuBar mbFőmenü=new JMenuBar();             //1

  private JMenu mFájl=new JMenu("Fájl");                //2
  private JMenuItem miFájlÚj=new JMenuItem("Új");       //3
  private JMenuItem miFájlMegnyit=
    new JMenuItem("Megnyit...");
  private JMenuItem miFájlMent=new JMenuItem("Ment");
  private JMenuItem miFájlMentMásként=
    new JMenuItem("Ment másként...");
  private JMenu miFájlNyomtat=new JMenu("Nyomtat");     //4
  private JMenuItem miFájlNyomtatNyomtatóra=
    new JMenuItem("Nyomtatóra");                        //5
  private JMenuItem miFájlNyomtatFájlba=
    new JMenuItem("Fájlba");
  private JMenuItem miFájlKilép=new JMenuItem("Kilép");

  private JMenu mNézet=new JMenu("Nézet");              //6
  private JRadioButtonMenuItem miNézetNormál=
    new JRadioButtonMenuItem("Normál", true);           //7
  private JRadioButtonMenuItem miNézetNyomtatásiKép=
    new JRadioButtonMenuItem("Nyomtatási kép");         //8
  private JRadioButtonMenuItem miNézetVázlat=
    new JRadioButtonMenuItem("Vázlat");
  private JCheckBoxMenuItem miNézetVonalzó=
    new JCheckBoxMenuItem("Vonalzó", true);             //9

  private JMenu mSúgó=new JMenu("Súgó");
  private JMenuItem miSúgóTémakörök=
    new JMenuItem("Témakörök");
  private JMenuItem miSúgóNévjegy=new JMenuItem("Névjegy");

  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public MenüMinta() {
    setDefaultCloseOperation(
      JFrame.DO_NOTHING_ON_CLOSE);                     //10
    setTitle("Menüminta");
    setBounds(kép.width/2-100, kép.height/2-100, 200, 200);
    setResizable(false);
    setJMenuBar(mbFőmenü);                             //11

    mbFőmenü.add(mFájl);                               //12
    mFájl.add(miFájlÚj);                               //13
    mFájl.add(miFájlMegnyit);
    mFájl.add(miFájlMent);
    mFájl.add(miFájlMentMásként);
    mFájl.add(miFájlNyomtat);                          //14
    miFájlNyomtat.add(miFájlNyomtatNyomtatóra);        //15
    miFájlNyomtat.add(miFájlNyomtatFájlba);
    mFájl.addSeparator();                              //16
    mFájl.add(miFájlKilép);

    mbFőmenü.add(mNézet);                              //17
    ButtonGroup bg=new ButtonGroup();                  //18
    bg.add(miNézetNormál);                             //19
    bg.add(miNézetNyomtatásiKép);
    bg.add(miNézetVázlat);
    mNézet.add(miNézetNormál);                         //20
    mNézet.add(miNézetNyomtatásiKép);
    mNézet.add(miNézetVázlat);
    mNézet.addSeparator();
    mNézet.add(miNézetVonalzó);                        //21

    mbFőmenü.add(mSúgó);
    mSúgó.add(miSúgóTémakörök);
    mSúgó.addSeparator();
    mSúgó.add(miSúgóNévjegy);

    miFájlKilép.addActionListener(this);               //22
    miSúgóNévjegy.addActionListener(this);             //23

    setVisible(true);
  }

  private String aktuálisNézet() {                     //24
    String s="";
    if(miNézetNyomtatásiKép.isSelected())
      s="Nyomtatási kép";
    else if(miNézetNormál.isSelected())
      s="Normál";
    else if(miNézetVázlat.isSelected())
      s="Vázlat";
    return s;
  }

  public void actionPerformed(ActionEvent e) {         //25
    if(e.getSource()==miFájlKilép) {                   //26
      System.out.println("Aktuális nézet: "+
        aktuálisNézet());
      System.out.println("Vonalzó: "+
        (miNézetVonalzó.isSelected()? "igen": "nem"));
      System.exit(0);                                  //27
    }
    else if(e.getSource()==miSúgóNévjegy)              //28
      System.out.println("Készítette: Kaczur Sándor"); //29
  }

  public static void main(String[] args) {
    new MenüMinta();
  }
}