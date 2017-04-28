import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;              //1

class FájlFilter extends FileFilter {                   //2
  public boolean accept(File f) {                       //3
    return (f.isDirectory() ||                          //4
      f.getName().toUpperCase().endsWith(".INI") ||     //6
      f.getName().toUpperCase().endsWith(".JAVA") ||    //7
      f.getName().toUpperCase().endsWith(".TXT"));      //8
  }
  
  public String getDescription() {                      //9
    return "*.ini, *.java, *.txt";                     //10
  }
}

public class TulajdonságFájl3 extends JFrame
    implements ActionListener {
  private JButton btTallóz=new JButton("Tallóz...");
  private JLabel lbFájlTulajdonság=
    new JLabel("Nincs kiválasztott fájl.");
  private JFileChooser fc=new JFileChooser();
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public TulajdonságFájl3() {
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
    fc.setFileFilter(new FájlFilter());                //11
  }

  static String dátumIdő(long utc) {
    DateFormat dátumIdőFormázó=
      DateFormat.getDateTimeInstance(
        DateFormat.SHORT, DateFormat.SHORT);
    return
      dátumIdőFormázó.format(new Date(utc)).toString();
  }

  private void címkeFrissít() {
    File fájl=fc.getSelectedFile();
    lbFájlTulajdonság.setText("<html>"+
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
    fc.setDialogTitle("Fájl kiválasztás");
    if(fc.showOpenDialog(this)==
        JFileChooser.APPROVE_OPTION)
      címkeFrissít();
  }

  public static void main(String[] args) {
    new TulajdonságFájl3();
  }
}