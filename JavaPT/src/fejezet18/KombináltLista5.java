import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KombináltLista5 extends JFrame implements ActionListener {
  private final Dimension[] MÉRET=
    {new Dimension(100, 100), new Dimension(200, 200), new Dimension(300, 300)};
  private String[] MÉRETFELIRAT={"kicsi", "közepes", "nagy"};
  JComboBox cbMéret=new JComboBox(MÉRETFELIRAT);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public KombináltLista5() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Méretek");
    setBounds(kép.width/2-125, kép.height/2-60, 100, 100);
    setLayout(new FlowLayout());
    add(cbMéret);
    cbMéret.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    setSize(MÉRET[cbMéret.getSelectedIndex()]);
  }

  public static void main(String[] args) {
    new KombináltLista5();
  }
}