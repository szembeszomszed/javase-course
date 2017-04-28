import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nyomógomb3 extends JFrame implements ActionListener {
  private JLabel lbSzöveg=new JLabel("Minta szöveg.");
  private JButton btKisebb=new JButton("Kisebb betűméret");
  private JButton btNagyobb=new JButton("Nagyobb betűméret");
  private Font betű=new Font("Times New Roman", Font.BOLD, 20);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Nyomógomb3() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Szöveg betűmérete");
    setBounds(kép.width/2-150, kép.height/2-75, 300, 150);
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    lbSzöveg.setFont(betű);
    lbSzöveg.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbSzöveg);
    btKisebb.addActionListener(this);
    btNagyobb.addActionListener(this);
    JPanel pn=new JPanel();
    pn.add(btKisebb);
    pn.add(btNagyobb);
    add(pn);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    int különbség=(e.getSource()==btKisebb)? -2: +2;
    int betűMéret=betű.getSize()+különbség;
    if(10<=betűMéret && betűMéret<=40) {
      betű=new Font(betű.getFontName(), betű.getStyle(), betűMéret);
      lbSzöveg.setFont(betű);
    }
  }

  public static void main(String[] args) {
    new Nyomógomb3();
  }
}