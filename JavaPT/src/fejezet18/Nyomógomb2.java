import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nyomógomb2 extends JFrame
    implements ActionListener{
  private JButton bt1=new JButton("1. nyomógomb");
  private JButton bt2=new JButton("2. nyomógomb");
  private JButton bt3=new JButton("3. nyomógomb");
  private JLabel lbSzöveg=new JLabel("Nem kattintott.");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Nyomógomb2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Melyik gombra kattintott?");
    setBounds(kép.width/2-200, kép.height/2-50, 400, 100);
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    bt3.addActionListener(this);
    JPanel pn=new JPanel();
    pn.add(bt1);
    pn.add(bt2);
    pn.add(bt3);
    add(pn);
    lbSzöveg.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbSzöveg);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {          //1
    String felirat=((JButton)e.getSource()).getText();  //2
    String névelő="A";                                  //3
    if(e.getSource()==bt1)                              //4
      névelő+="z";                                      //5
    lbSzöveg.setText(
      névelő+" "+felirat+"ra kattintott.");             //6
  }

  public static void main(String[] args) {
    new Nyomógomb2();
  }
}