import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SzövegFormázás4 extends JFrame implements ActionListener {
  private JTextField tf=new JTextField("Minta szöveg", 20);
  private JPanel pnGombok=new JPanel();
  private JButton btNagybetűs=new JButton("NAGYBETŰS");
  private JButton btKisbetűs=new JButton("kisbetűs");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public SzövegFormázás4(String felirat) {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-150, kép.height/2-65, 300, 130);
    setTitle("Szövegformázás");
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    add(tf);
    pnGombok.add(btNagybetűs);
    pnGombok.add(btKisbetűs);
    add(pnGombok);
    btNagybetűs.addActionListener(this);
    btKisbetűs.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String szöveg=tf.getText();
    if(e.getSource()==btNagybetűs)
      tf.setText(szöveg.toUpperCase());
    else if(e.getSource()==btKisbetűs)
      tf.setText(szöveg.toLowerCase());
  }

  public static void main(String[] args) {
    new SzövegFormázás4("Szövegformázás");
  }
}
