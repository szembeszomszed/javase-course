import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

class JavaFájlSzűrő extends FileFilter {                //1
  public boolean accept(File f) {
    return (f.isDirectory() ||
      f.getName().toUpperCase().endsWith(".JAVA"));
  }

  public String getDescription() {
    return "*.java";
  }
}

public class ForráskódSzerkesztő extends JFrame
    implements ActionListener {
  private JMenuItem miMegnyit, miMent, miKilép;
  private File szövegFájl=new File(".");                //2
  private JTextArea taEditor=new JTextArea();
  private JFileChooser fc=new JFileChooser();
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public ForráskódSzerkesztő() {
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setTitle("Forráskódszerkesztő");
    setBounds(kép.width/2-250, kép.height/2-150, 500, 300);
    JMenuBar mbFájl=new JMenuBar();
    JMenu mFájl=new JMenu("Fájl");
    setJMenuBar(mbFájl);
    mbFájl.add(mFájl);
    mFájl.add(miMegnyit=new JMenuItem("Megnyit..."));
    miMegnyit.setIcon(
      new ImageIcon("./images/fájlMegnyit.jpg"));       //3
    mFájl.add(miMent=new JMenuItem("Ment"));
    miMent.setIcon(new ImageIcon("./images/fájlMent.jpg"));
    miMent.setEnabled(false);                           //4
    mFájl.addSeparator();
    mFájl.add(miKilép=new JMenuItem("Kilép"));
    miMegnyit.addActionListener(this);
    miMent.addActionListener(this);
    miKilép.addActionListener(this);
    add(new JScrollPane(taEditor));
    setVisible(true);
    fc.setFileFilter(new JavaFájlSzűrő());              //5
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==miMegnyit)
      megnyit();
    else if(e.getSource()==miMent)
      ment();
    else if(e.getSource()==miKilép)
      System.exit(0);
  }

  private void megnyit() {                              //6
    if(fc.showOpenDialog(this)==
        JFileChooser.APPROVE_OPTION) {
      miMent.setEnabled(true);                          //7
      szövegFájl=fc.getSelectedFile();
      char[] karakterTömb=
        new char[(int)szövegFájl.length()];             //8
      try {
        FileReader fr=new FileReader(szövegFájl);
        fr.read(karakterTömb);                          //9
        fr.close();
        taEditor.setText(String.valueOf(karakterTömb));//10
        taEditor.setCaretPosition(0);                  //11
      }
      catch(IOException e) {
        System.out.println("I/O hiba: "+e.getMessage());
      }
    }
  }

  private void ment() {                                //12
    try {
      FileWriter fw=new FileWriter(szövegFájl);
      fw.write(taEditor.getText());                    //13
      fw.close();
    }
    catch(IOException e) {
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    new ForráskódSzerkesztő();
  }
}