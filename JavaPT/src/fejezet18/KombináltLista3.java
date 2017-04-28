import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KombináltLista3 extends JFrame implements ActionListener {
  private final String[] KURZORFELIRAT=
    {"Wait Cursor", "Crosshair Cursor", "Hand Cursor", "Move Cursor"};
  private final int[] KURZORSORSZÁM={3, 1, 12, 13};
  private JComboBox cbKurzor=new JComboBox(KURZORFELIRAT);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public KombináltLista3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Kurzorok");
    setBounds(kép.width/2-100, kép.height/2-75, 200, 150);
    setLayout(new FlowLayout());
    add(cbKurzor);
    cbKurzor.addActionListener(this);
    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {
    setCursor(new Cursor(KURZORSORSZÁM[cbKurzor.getSelectedIndex()]));
  }

  public static void main (String[] args) {
    new KombináltLista3();
  }
}