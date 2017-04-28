
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Feladat1632_Betu extends JFrame {
  private Dimension screen = getToolkit().getDefaultToolkit().getScreenSize();
  private JLabel lbText = new JLabel("red text");
  
  public Feladat1632_Betu() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("text color");
    setBounds(screen.width / 2 - 175, screen.height / 2 - 75, 350, 150);
    setResizable(false);
    Font font = new Font("Arial", getFont().BOLD, 30);
    lbText.setFont(font);
    lbText.setForeground(Color.red);
    lbText.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbText);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Feladat1632_Betu();
  }
  
}
