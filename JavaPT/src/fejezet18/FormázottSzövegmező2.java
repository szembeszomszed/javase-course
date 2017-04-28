import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class FormázottSzövegmező2 extends JFrame {
  private JFormattedTextField ftfRendszám;
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public FormázottSzövegmező2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Rendszám beolvasása");
    setBounds(kép.width/2-150, kép.height/2-50, 300, 100);
    setLayout(new FlowLayout());
    add(new JLabel("Rendszám:"));
    try {
      ftfRendszám=new JFormattedTextField(new MaskFormatter("UUU-###"));
    }
    catch(ParseException e) {
      ;
    }
    ftfRendszám.setColumns(7);
    add(ftfRendszám);
    setVisible(true);
  }

  public static void main(String[] args) {
    new FormázottSzövegmező2();
  }
}