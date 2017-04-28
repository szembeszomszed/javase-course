import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Címke3 extends JFrame implements ActionListener {
  private Timer időzítő=new Timer(100, this);
  private final int BALRA=-1, JOBBRA=+1;
  private int irány=JOBBRA;
  private Rectangle ablak;
  private JLabel lbMacska=new JLabel(new ImageIcon("./images/macska2.jpg"));
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Címke3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Mozgó macska");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setResizable(false);
    setLayout(new FlowLayout());
    getContentPane().setBackground(Color.WHITE);
    lbMacska.setHorizontalAlignment(SwingConstants.LEFT);
    add(lbMacska);
    setVisible(true);
    ablak=getContentPane().getBounds();
    időzítő.start();
  }

  public void actionPerformed(ActionEvent e) {
    Rectangle macska=lbMacska.getBounds();
    macska.translate(irány*10, 0);
    if(ablak.contains(macska))
      lbMacska.setBounds(macska);
    else {
      switch(irány) {
        case JOBBRA:
          lbMacska.setIcon(new ImageIcon("./images/macska1.jpg")); break;
        case BALRA:
          lbMacska.setIcon(new ImageIcon("./images/macska2.jpg"));
      }
      irány*=-1;
    }
  }

  public static void main(String[] args) {
    new Címke3();
  }
}