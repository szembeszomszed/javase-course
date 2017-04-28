import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class SzövegFormázás1 extends JFrame implements ActionListener, DocumentListener {
  private JPanel pnEszköztár=new JPanel();
  private JTextField tf=new JTextField("Minta szöveg", 20);
  private JLabel lb=new JLabel(tf.getText(), SwingConstants.CENTER);
  private final String[] BETŰTÍPUSTÖMB= {"Arial", "Times New Roman", "Courier New", "Tahoma"};
  private JComboBox cbBetűtípus=new JComboBox(BETŰTÍPUSTÖMB);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public SzövegFormázás1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-200, kép.height/2-75, 400, 150);
    setTitle("Szövegformázás");
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    pnEszköztár.add(tf);
    pnEszköztár.add(cbBetűtípus);
    add(pnEszköztár);
    add(lb, BorderLayout.CENTER);
    cbBetűtípus.addActionListener(this);
    tf.getDocument().addDocumentListener(this);
    setVisible(true);
    beállít();
  }

  private void beállít() {
    lb.setText(tf.getText());
    String betűtípus=(String)cbBetűtípus.getSelectedItem();
    lb.setFont(new Font(betűtípus, Font.PLAIN, 30));
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
    new SzövegFormázás1();
  }
}