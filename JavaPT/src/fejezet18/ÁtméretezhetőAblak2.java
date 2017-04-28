import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ÁtméretezhetőAblak2 extends JFrame implements ActionListener {
  private JCheckBox cb=new JCheckBox("átméretezhető", true);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public ÁtméretezhetőAblak2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Méretezhető az ablak?");
    setBounds(kép.width/2-150, kép.height/2-50, 300, 100);
    setLayout(new FlowLayout());
    add(new JLabel("Méretezhető az ablak?"));
    add(cb);
    cb.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ev) {
    setResizable(cb.isSelected());
  }

  public static void main(String[] args) {
    new ÁtméretezhetőAblak2();
  }
}