import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;                         //1

public class Opció1 extends JFrame
    implements ActionListener {
  private JButton btTájékoztat=new JButton("Tájékoztat");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Opció1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Üzenetablak");
    setBounds(kép.width/2-150, kép.height/2-75, 300, 150);
    setResizable(false);
    setLayout(new FlowLayout());
    add(btTájékoztat);
    btTájékoztat.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(                      //2
      this, "Ez az üzenet szöveg első sora.\nEz a 2. sor.",
      "Üzenet", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void main(String[] args) {
    new Opció1();
  }
}