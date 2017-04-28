import java.awt.*;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class FormázottSzövegmező1 extends JFrame {
  private JFormattedTextField ftfEgész;                 //1
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public FormázottSzövegmező1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Egész szám beolvasása");
    setBounds(kép.width/2-75, kép.height/2-75, 300, 100);
    setResizable(false);
    setLayout(new FlowLayout());
    add(new JLabel("Nemnegatív egész szám:"));
    try {
      MaskFormatter egész8jegyű=
        new MaskFormatter("########");                  //2
      ftfEgész=new JFormattedTextField(egész8jegyű);    //3
    }
    catch(ParseException e) {
      ;
    }
    ftfEgész.setColumns(8);                             //4
    add(ftfEgész);
    setVisible(true);
  }

  public static void main(String[] args) {
    new FormázottSzövegmező1();
  }
}