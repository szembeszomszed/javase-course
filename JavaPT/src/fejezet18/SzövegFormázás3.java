import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class SzövegFormázás3 extends JFrame implements ActionListener, DocumentListener {
  private JPanel pnEszköztár=new JPanel();
  private JTextField tf=new JTextField("Minta szöveg", 20);
  private JLabel lb=new JLabel(tf.getText(), SwingConstants.CENTER);
  private final Color[] COLORTÖMB={Color.RED, Color.GREEN, Color.BLUE, Color.WHITE};
  private final String[] SZÍNTÖMB={"piros", "zöld", "kék", "fehér"};
  private JComboBox cbSzín=new JComboBox(SZÍNTÖMB);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public SzövegFormázás3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-200, kép.height/2-75, 400, 150);
    setTitle("Szövegformázás");
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    pnEszköztár.add(tf);
    pnEszköztár.add(cbSzín);
    add(pnEszköztár);
    add(lb, BorderLayout.CENTER);
    cbSzín.addActionListener(this);
    tf.getDocument().addDocumentListener(this);
    setVisible(true);
    beállít();
  }

  private void beállít() {
    lb.setText(tf.getText());
    lb.setForeground(COLORTÖMB[cbSzín.getSelectedIndex()]);
  }

  public void actionPerformed(ActionEvent e) {
    beállít();
  }

  public void insertUpdate(DocumentEvent e) {
    beállít();
  }

  public void removeUpdate(DocumentEvent e) {
    beállít();
  }

  public void changedUpdate(DocumentEvent e) {
    ;
  }

  public static void main(String[] args) {
    new SzövegFormázás3();
  }
}