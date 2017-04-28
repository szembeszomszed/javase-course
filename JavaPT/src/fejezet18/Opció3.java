import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Opció3 extends JFrame
    implements ActionListener {
  private JTextField tfAdat=new JTextField(10);
  private JButton btBeolvas=new JButton("Beolvas");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Opció3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Adatbekérés");
    setBounds(kép.width/2-200, kép.height/2-75, 400, 150);
    setResizable(false);
    setLayout(new FlowLayout());
    add(new JLabel("Beolvasott adat:"));
    tfAdat.setEditable(false);                          //1
    add(tfAdat);
    add(btBeolvas);
    btBeolvas.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String opció="";                                    //2
    opció=JOptionPane.showInputDialog(                  //3
      this, "Egész szám", "Beolvasás",
      JOptionPane.QUESTION_MESSAGE);
    try {
      if(opció==null)                                   //4
        tfAdat.setText("nincs");                        //5
      else {
        int szám=Integer.parseInt(opció);               //6
        tfAdat.setText(Integer.toString(szám));         //7
      }
    }
    catch(NumberFormatException ex) {
      tfAdat.setText("konverziós hiba");                //8
    }
  }

  public static void main(String[] args) {
    new Opció3();
  }
}