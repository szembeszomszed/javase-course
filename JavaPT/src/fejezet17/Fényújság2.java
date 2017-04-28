import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fényújság2 extends JFrame implements ActionListener {
  private Timer időzítőMozog, időzítőSzín;
  private String szöveg="Szeretek Java-ban programozni."+" ";
  private JLabel lbFényújság=new JLabel(szöveg, SwingConstants.CENTER);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Fényújság2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Fényújság");
    setBounds(kép.width/2-200, kép.height/2-50, 400, 100);
    lbFényújság.setFont(new Font("Arial", Font.BOLD, 24));
    add(lbFényújság);
    setVisible(true);
    időzítőMozog=new Timer(200, this);
    időzítőMozog.start();
    időzítőSzín=new Timer(1000, this);
    időzítőSzín.start();
  }

  private void mozog() {
    szöveg=szöveg.substring(1)+szöveg.charAt(0);
    lbFényújság.setText(szöveg);
  }

  private void színtVált() {
    lbFényújság.setForeground(
      new Color((int)(Math.random()*256),
                (int)(Math.random()*256),
                (int)(Math.random()*256)));
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==időzítőMozog)
      mozog();
    else
      színtVált();
  }

  public static void main(String[] args) {
    new Fényújság2();
  }
}