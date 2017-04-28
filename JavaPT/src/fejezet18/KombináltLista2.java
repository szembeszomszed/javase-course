import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KombináltLista2 extends JFrame implements ActionListener {
  private final Color[] COLOR={Color.WHITE, Color.BLACK, Color.BLUE, Color.GREEN};
  private final String[] SZÍN={"fehér", "fekete", "kék", "zöld"};
  private JComboBox cbSzín=new JComboBox(SZÍN);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public KombináltLista2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Háttérszín");
    setBounds(kép.width/2-125, kép.height/2-60, 250, 120);
    setLayout(new FlowLayout());
    add(cbSzín);
    cbSzín.addActionListener(this);
    setVisible(true);
    cbSzín.setSelectedIndex(0);
  }

  public void actionPerformed(ActionEvent e) {
    getContentPane().setBackground(COLOR[cbSzín.getSelectedIndex()]);
  }

  public static void main(String[] args) {
    new KombináltLista2();
  }
}