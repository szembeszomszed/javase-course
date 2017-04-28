import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFileChooser;                        //1
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TulajdonságFájl2 extends JFrame
    implements ActionListener {
  private JButton btTallóz=new JButton("Tallóz...");    //2
  private JLabel lbFájlTulajdonság=
    new JLabel("Nincs kiválasztott fájl.");
  private JFileChooser fc=new JFileChooser();           //3
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public TulajdonságFájl2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Fájl tulajdonságai");
    setBounds(kép.width/2-100, kép.height/2-100, 300, 300);
    JPanel pn=new JPanel();
    pn.add(btTallóz);
    add(pn, BorderLayout.NORTH);
    btTallóz.addActionListener(this);
    lbFájlTulajdonság.setHorizontalAlignment(
      SwingConstants.CENTER);
    add(lbFájlTulajdonság);
    setVisible(true);
  }

  static String dátumIdő(long utc) {
    DateFormat dátumIdőFormázó=
      DateFormat.getDateTimeInstance(
        DateFormat.SHORT, DateFormat.SHORT);
    return
      dátumIdőFormázó.format(new Date(utc)).toString();
  }

  private void címkeFrissít() {                         //4
    File fájl=fc.getSelectedFile();                     //5
    lbFájlTulajdonság.setText("<html>"+                 //6
      "Útvonal: "+fájl.getPath()+"<br>"+
      "Abszolút útvonal: "+fájl.getAbsolutePath()+"<br>"+
      "Szülőmappa: "+fájl.getParent()+"<br>"+
      "Fájl neve: "+fájl.getName()+"<br>"+
      "Méret: "+fájl.length()+" bájt<br>"+
      "Olvasható? "+(fájl.canRead()?"igen":"nem")+"<br>"+
      "Írható? "+(fájl.canWrite()?"igen":"nem")+"<br>"+
      "Rejtett? "+(fájl.isHidden()?"igen":"nem")+"<br>"+
      "Utolsó módosítás: "+dátumIdő(fájl.lastModified())+
      "</html>");
  }

  public void actionPerformed(ActionEvent e) {
    fc.setCurrentDirectory(new File("."));              //7
    fc.setFileSelectionMode(JFileChooser.FILES_ONLY);   //8
    fc.setDialogTitle("Fájl kiválasztás");              //9
    fc.setMultiSelectionEnabled(false);                //10
    if(fc.showOpenDialog(this)==                       //11
        JFileChooser.APPROVE_OPTION)                   //12
      címkeFrissít();
  }

  public static void main(String[] args) {
    new TulajdonságFájl2();
  }
}