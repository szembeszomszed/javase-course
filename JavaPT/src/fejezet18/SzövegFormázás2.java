import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class SzövegFormázás2 extends JFrame implements ActionListener, DocumentListener {
  private JPanel pnEszköztár=new JPanel();
  private JTextField tf=new JTextField("Minta szöveg", 20);
  private JLabel lb=new JLabel(tf.getText(), SwingConstants.CENTER);
  private JComboBox cbBetűméret=new JComboBox();
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public SzövegFormázás2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(kép.width/2-200, kép.height/2-75, 400, 150);
    setTitle("Szövegformázás");
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    pnEszköztár.add(tf);
    for(int i=10; i<=30; i+=2)
      cbBetűméret.addItem(Integer.toString(i));
    pnEszköztár.add(cbBetűméret);
    add(pnEszköztár);
    add(lb, BorderLayout.CENTER);
    cbBetűméret.addActionListener(this);
    tf.getDocument().addDocumentListener(this);
    setVisible(true);
    beállít();
  }

  private void beállít() {
    lb.setText(tf.getText());
    int betűméret=Integer.parseInt((String)cbBetűméret.getSelectedItem());
    lb.setFont(new Font("Default", Font.PLAIN, betűméret));
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
    new SzövegFormázás2();
  }
}