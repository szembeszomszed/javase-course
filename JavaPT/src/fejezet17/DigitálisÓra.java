import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;                      //1
import java.awt.event.ActionListener;                   //2
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class DigitálisÓra extends JFrame
    implements ActionListener {                         //3
  private Timer időzítő=new Timer(0, this);             //4
  private JLabel lbÓra=new JLabel();
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();
  
  public DigitálisÓra() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Digitális óra");
    setBounds(kép.width/2-100, kép.height/2-50, 200, 100);
    setResizable(false);
    lbÓra.setHorizontalAlignment(SwingConstants.CENTER);
    lbÓra.setFont(new Font("Arial", Font.BOLD, 40));
    add(lbÓra);
    setVisible(true);
    időzítő.start();                                    //5
    időzítő.setDelay(1000);                             //6
  }

  public void actionPerformed(ActionEvent e) {          //7
    lbÓra.setText(DateFormat.getTimeInstance(
      DateFormat.MEDIUM).format(new Date()));           //8
  }

  public static void main(String[] args) {
    new DigitálisÓra();
  }
}