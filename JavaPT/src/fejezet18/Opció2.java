import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Opció2 extends JFrame
    implements ActionListener {
  private JButton btKilép=new JButton("Kilép");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Opció2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Megerősítés");
    setBounds(kép.width/2-150, kép.height/2-75, 300, 150);
    setResizable(false);
    setLayout(new FlowLayout());
    add(btKilép);
    btKilép.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    int opció=JOptionPane.showConfirmDialog(            //1
      this, "Biztos, hogy kilép?", "Megerősítés",
      JOptionPane.YES_NO_OPTION);
    if(opció==JOptionPane.YES_OPTION)                   //2
      System.exit(0);
  }

  public static void main(String[] args) {
    new Opció2();
  }
}