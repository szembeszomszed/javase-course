import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Intelligencia2 extends JFrame
    implements ActionListener {
  private JTextField tfIQ=new JTextField(10);
  private JButton btÉrtékel=new JButton("Értékel");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Intelligencia2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Intelligencia");
    setBounds(kép.width/2-200, kép.height/2-75, 400, 150);
    setResizable(false);
    setLayout(new FlowLayout());
    add(new JLabel("IQ:"));
    add(tfIQ);
    add(btÉrtékel);
    btÉrtékel.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    int iq=Integer.parseInt(tfIQ.getText());
    String üzenet="";
    if(iq<90)
      üzenet="Alacsony intelligencia";
    else if(iq<110)
      üzenet="Normál, átlagos intelligencia";
    else
      üzenet="Magas intelligencia";
    JOptionPane.showMessageDialog(this, üzenet,
      "Intelligencia", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void main(String[] args) {
    new Intelligencia2();
  }
}