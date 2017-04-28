import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;                       //1
import java.io.ObjectOutputStream;                      //2
import javax.swing.*;

public class SzínTárolás extends JFrame
    implements ActionListener {
  private JButton btSzín=new JButton("Szín...");
  private File színFájl=new File("./files/szín.dat");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public SzínTárolás() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Színtárolás");
    setBounds(kép.width/2-125, kép.height/2-50, 250, 100);
    setResizable(false);
    setLayout(new FlowLayout());
    add(btSzín);
    btSzín.addActionListener(this);
    getContentPane().setBackground(színBetölt());       //3
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {
    Color szín=null;
    szín=JColorChooser.showDialog(
       this, "Színválasztás", szín);
    if(szín!=null) {
      getContentPane().setBackground(szín);             //4
      színMent(szín);                                   //5
    }
  }

  private Color színBetölt() {                          //6
    Color szín=null;
    try {
      ObjectInputStream ois=new ObjectInputStream(      //7
        new FileInputStream(színFájl));
      szín=(Color)ois.readObject();                     //8
      ois.close();                                      //9
    }
    catch(ClassNotFoundException e) {                  //10
      System.out.println("Hibás osztály!");
    }
    catch(IOException e) {                             //11
      ;
    }
    return (szín==null)?Color.RED:szín;                //12
  }

  private void színMent(Color szín) {                  //13
    try {
      ObjectOutputStream oos=new ObjectOutputStream(   //14
        new FileOutputStream(színFájl));
      oos.writeObject(szín);                           //15
      oos.close();                                     //16
    }
    catch(IOException e) {                             //17
      System.out.println("I/O hiba: "+e.getMessage());
    }
  }

  public static void main(String[] args) {
    new SzínTárolás();
  }
}