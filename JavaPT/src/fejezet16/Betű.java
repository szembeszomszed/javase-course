import java.awt.*;                                      //1
import javax.swing.JFrame;
import javax.swing.JLabel;                              //2
import javax.swing.SwingConstants;                      //3

public class Betű extends JFrame {
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();
  private JLabel lbSzöveg=new JLabel(
    "piros színű szöveg");                              //4

  public Betű() {                                       //5
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Szöveg színe");
    setBounds(kép.width/2-175, kép.height/2-75, 350, 150);
    setResizable(false);                                //6
    Font betűtípus=new Font("Arial", Font.BOLD, 30);    //7
    lbSzöveg.setFont(betűtípus);                        //8
    lbSzöveg.setForeground(Color.RED);                  //9
    lbSzöveg.setHorizontalAlignment(
      SwingConstants.CENTER);                          //10
    add(lbSzöveg);                                     //11
    setVisible(true);
  }

  public static void main(String[] args) {
    new Betű();
  }
}