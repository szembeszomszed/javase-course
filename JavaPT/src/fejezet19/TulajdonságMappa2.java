import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;

public class TulajdonságMappa2 extends JFrame
    implements ActionListener {
  private JButton btTallóz=new JButton("Tallóz...");
  private JLabel lbMappaTulajdonság=new JLabel("Nincs kiválasztott mappa.");
  private JFileChooser fc=new JFileChooser();
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public TulajdonságMappa2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Mappa tulajdonságai");
    setBounds(kép.width/2-150, kép.height/2-125, 300, 250);
    JPanel pn=new JPanel();
    pn.add(btTallóz);
    add(pn, BorderLayout.NORTH);
    btTallóz.addActionListener(this);
    lbMappaTulajdonság.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbMappaTulajdonság);
    setVisible(true);
  }

  static String dátumIdő(long utc) {
    DateFormat dátumIdőFormázó=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
    return dátumIdőFormázó.format(new Date(utc)).toString();
  }

  private void címkeFrissít() {
    File mappa=fc.getCurrentDirectory();
    lbMappaTulajdonság.setText("<html>"+
      "Útvonal: "+mappa.getPath()+"<br>"+
      "Abszolút útvonal: "+mappa.getAbsolutePath()+"<br>"+
      "Szülőmappa: "+mappa.getParent()+"<br>"+
      "Mappa neve: "+mappa.getName()+"<br>"+
      "Olvasható? "+(mappa.canRead()?"igen":"nem")+"<br>"+
      "Írható? "+(mappa.canWrite()?"igen":"nem")+"<br>"+
      "Rejtett? "+(mappa.isHidden()?"igen":"nem")+"<br>"+
      "Utolsó módosítás: "+dátumIdő(mappa.lastModified())+
      "</html>");
  }

  public void actionPerformed(ActionEvent e) {
    fc.setCurrentDirectory(new File("."));
    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    fc.setDialogTitle("Mappa kiválasztás");
    fc.setMultiSelectionEnabled(false);
    if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
      címkeFrissít();
  }

  public static void main(String[] args) {
    new TulajdonságMappa2();
  }
}