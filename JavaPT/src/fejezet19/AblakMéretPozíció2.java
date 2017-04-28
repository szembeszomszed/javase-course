import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Properties;                            //1
import javax.swing.*;

public class AblakMéretPozíció2 extends JFrame
    implements ActionListener, ComponentListener {
  private JLabel lbMéret=new JLabel();
  private JLabel lbPozíció=new JLabel();
  private JMenuBar mbFőmenü=new JMenuBar();
  private JMenu mFájl=new JMenu("Fájl");
  private JMenuItem miFájlMegnyit=new JMenuItem("Megnyit");
  private JMenuItem miFájlMent=new JMenuItem("Ment");
  private JMenuItem miFájlKilép=new JMenuItem("Kilép");
  private File f=new File("./files/AblakBeállítás.ini");//2
  private Properties tulajdonság=new Properties();      //3
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public AblakMéretPozíció2() {
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setTitle("Ablak mérete és pozíciója?");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setLayout(new GridLayout(2, 1));
    setJMenuBar(mbFőmenü);
    mbFőmenü.add(mFájl);
    mFájl.add(miFájlMegnyit);
    mFájl.add(miFájlMent);
    mFájl.addSeparator();
    mFájl.add(miFájlKilép);
    miFájlMegnyit.addActionListener(this);
    miFájlMent.addActionListener(this);
    miFájlKilép.addActionListener(this);
    lbMéret.setHorizontalAlignment(SwingConstants.CENTER);
    lbPozíció.setHorizontalAlignment(
      SwingConstants.CENTER);
    add(lbMéret);
    add(lbPozíció);
    addComponentListener(this);
    setVisible(true);
    kiírMéretPozíció();
  }

  private void kiírMéretPozíció() {
    lbMéret.setText(
      "Ablak mérete: ["+getBounds().width+", "+
                        getBounds().height+"]");
    lbPozíció.setText(
      "Ablak pozíciója: ["+getBounds().x+", "+
                           getBounds().y+"]");
  }

  private void beolvasAblakBeállítás() {                //4
    try {
      FileInputStream beállítás=new FileInputStream(f); //5
      tulajdonság.load(beállítás);                      //6
      beállítás.close();                                //7
      int x=Integer.parseInt(
        tulajdonság.getProperty("ablakX"));             //8
      int y=Integer.parseInt(
        tulajdonság.getProperty("ablakY"));
      int szélesség=Integer.parseInt(
        tulajdonság.getProperty("ablakSzélesség"));
      int magasság=Integer.parseInt(
        tulajdonság.getProperty("ablakMagasság"));
      setBounds(x, y, szélesség, magasság);             //9
    }
    catch(IOException e) {                             //10
      System.out.println("Hiba történt a betöltés során!");
    }
  }

  private void mentAblakBeállítás() {                  //11
    try {
      String x=Integer.toString(getBounds().x);        //12
      String y=Integer.toString(getBounds().y);
      String szélesség=Integer.toString(getBounds().width);
      String magasság=Integer.toString(getBounds().height);
      tulajdonság.setProperty("ablakX", x);            //13
      tulajdonság.setProperty("ablakY", y);
      tulajdonság.setProperty("ablakSzélesség", szélesség);
      tulajdonság.setProperty("ablakMagasság", magasság);
      FileOutputStream beállítás=
        new FileOutputStream(f);                       //14
      tulajdonság.store(beállítás, "");                //15
      beállítás.close();                               //16
    }
    catch(IOException e) {                             //17
      System.out.println("Hiba történt a mentés során!");
    }
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==miFájlMegnyit)                   //18
      beolvasAblakBeállítás();
    else if(e.getSource()==miFájlMent)                 //19
      mentAblakBeállítás();
    else
      System.exit(0);
  }

  public void componentResized(ComponentEvent e) {
    kiírMéretPozíció();
  }

  public void componentMoved(ComponentEvent e) {
    kiírMéretPozíció();
  }

  public void componentShown(ComponentEvent e) {
    ;
  }

  public void componentHidden(ComponentEvent e) {
    ;
  }

  public static void main(String[] args) {
    new AblakMéretPozíció2();
  }
}