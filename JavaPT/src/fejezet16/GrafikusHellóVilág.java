import java.awt.*;
import javax.swing.JFrame;                              //1

public class GrafikusHellóVilág extends JFrame {        //2
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();        //3

  public GrafikusHellóVilág() {                         //4
    setDefaultCloseOperation(EXIT_ON_CLOSE);            //5
    setTitle("Helló világ!");                           //6
    setBounds(kép.width/2-150, kép.height/2-100,
              300, 200);                                //7
    setVisible(true);                                   //8
  }

  public static void main(String[] args) {
    new GrafikusHellóVilág();                           //9
  }
}