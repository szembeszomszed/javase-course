import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Opció4 extends JFrame
    implements ActionListener {
  private JButton btKilép=new JButton("Kilép");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Opció4() {
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
    Object[] opcióTömb={"Igen", "Nem"};                 //1
    int opció=JOptionPane.showOptionDialog(             //2
      this,                                             //3
      "Biztos, hogy kilép?",                            //4
      "Megerősítés",                                    //5
      JOptionPane.DEFAULT_OPTION,                       //6
      JOptionPane.WARNING_MESSAGE,                      //7
      null,                                             //8
      opcióTömb,                                        //9
      opcióTömb[1]);                                   //10
    if(opció==JOptionPane.YES_OPTION)
      System.exit(0);
  }

  public static void main(String[] args) {
    new Opció4();
  }
}