import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;                 //1
import javax.swing.event.DocumentListener;              //2
import javax.swing.text.Document;                       //3

public class Szövegmező1 extends JFrame
    implements DocumentListener {                       //4
  private JTextField tfSzöveg=
    new JTextField("Minta szöveg.", 20);                //5
  private JLabel lbÜzenet=new JLabel();
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Szövegmező1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szövegmező tulajdonságai");
    setBounds(kép.width/2-150, kép.height/2-60, 300, 200);
    setLayout(new BorderLayout());
    lbÜzenet.setHorizontalAlignment(SwingConstants.CENTER);
    JPanel pn=new JPanel();
    pn.add(new JLabel("Szöveg:"));
    pn.add(tfSzöveg);                                   //6
    add(pn, BorderLayout.NORTH);
    tfSzöveg.getDocument().addDocumentListener(this);   //7
    add(lbÜzenet, BorderLayout.CENTER);
    setVisible(true);
    szövegmezőTulajdonságai();
  }

  private void szövegmezőTulajdonságai() {
    Document dm=tfSzöveg.getDocument();                 //8
    String üzenet="<html>A szövegmező tulajdonságai:<br>";
    üzenet+="- hossza (1): "+
      tfSzöveg.getText().length()+"<br>";               //9
    üzenet+="- hossza (2): "+
      dm.getLength()+"<br>";                           //10
    üzenet+="- kurzor indexe: "+
      tfSzöveg.getCaretPosition()+"<br>";              //11
    üzenet+="<html>";
    lbÜzenet.setText(üzenet);
  }

  public void insertUpdate(DocumentEvent e) {          //12
    szövegmezőTulajdonságai();
  }

  public void removeUpdate(DocumentEvent e) {          //13
    szövegmezőTulajdonságai();
  }

  public void changedUpdate(DocumentEvent e) {         //14
    ;
  }

  public static void main(String[] args) {
    new Szövegmező1();
  }
}