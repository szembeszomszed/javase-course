import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KombináltLista4 extends JFrame implements ActionListener {
  private final Color[] COLOR={Color.WHITE, Color.BLACK, Color.BLUE, Color.GREEN};
  private JComboBox cbSzín=new JComboBox();
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public KombináltLista4() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Háttérszín");
    setBounds(kép.width/2-125, kép.height/2-60, 250, 120);
    setLayout(new FlowLayout());
    cbSzín.addItem("fehér");
    cbSzín.addItem("fekete");
    cbSzín.addItem("kék");
    cbSzín.addItem("zöld");
    add(cbSzín);
    cbSzín.addActionListener(this);
    setVisible(true);
    cbSzín.setSelectedIndex(0);
  }

  public void actionPerformed(ActionEvent e) {
    getContentPane().setBackground(COLOR[cbSzín.getSelectedIndex()]);
  }

  public static void main(String[] args) {
    new KombináltLista4();
  }
}