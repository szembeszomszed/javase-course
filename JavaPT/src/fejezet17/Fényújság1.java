import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fényújság1 extends JFrame implements ActionListener {
  private Timer időzítő;
  private String szöveg="Szeretek Java-ban programozni."+" ";
  private JLabel lbFényújság=new JLabel(szöveg, SwingConstants.CENTER);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Fényújság1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Fényújság");
    setBounds(kép.width/2-200, kép.height/2-50, 400, 100);
    lbFényújság.setFont(new Font("Arial", Font.BOLD, 24));
    add(lbFényújság);
    setVisible(true);
    időzítő=new Timer(200, this);
    időzítő.start();
  }

  public void actionPerformed(ActionEvent e) {
    szöveg=szöveg.substring(1)+szöveg.charAt(0);
    lbFényújság.setText(szöveg);
  }

  public static void main(String[] args) {
    new Fényújság1();
  }
}