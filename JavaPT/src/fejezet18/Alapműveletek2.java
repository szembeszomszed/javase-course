import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alapműveletek2 extends JFrame implements ActionListener {
  private JTextField tfA=new JTextField(6);
  private String[] műveletTömb={" + ", " - ", " * ", " / "};
  private JComboBox cbMűvelet=new JComboBox(műveletTömb);
  private JTextField tfB=new JTextField(6);
  private JTextField tfEredmény=new JTextField(12);
  private JLabel lbÜzenet=new JLabel("Alapműveletek két egész számmal");  
  private JButton btKiszámít=new JButton("Kiszámít");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();
  
  public Alapműveletek2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Alapműveletek");
    setBounds((kép.width-400)/2, (kép.height-150)/2, 400, 150);
    setResizable(false);

    JPanel pnFelső=new JPanel();
    pnFelső.add(tfA);
    pnFelső.add(cbMűvelet);
    pnFelső.add(tfB);
    pnFelső.add(new JLabel("="));
    tfEredmény.setEditable(false);
    pnFelső.add(tfEredmény);
    add(pnFelső, BorderLayout.NORTH);

    JPanel pnKözépső=new JPanel();
    btKiszámít.addActionListener(this);
    pnKözépső.add(btKiszámít);
    add(pnKözépső, BorderLayout.CENTER);

    JPanel pnAlsó=new JPanel();
    pnAlsó.add(lbÜzenet, BorderLayout.SOUTH);
    add(pnAlsó, BorderLayout.SOUTH);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      if(e.getSource()==btKiszámít) {
        int a=Integer.parseInt(tfA.getText());
        int b=Integer.parseInt(tfB.getText());
        double eredmény;
        String művelet=cbMűvelet.getSelectedItem().toString();
        if(művelet.equals(" + "))
          eredmény=a+b;
        else if(művelet.equals(" - "))
          eredmény=a-b;
        else if(művelet.equals(" * "))
          eredmény=a*b;
        else if (b!=0)
          eredmény=(double)a/b;
        else
          throw new ArithmeticException("Nullával való osztás!");
        tfEredmény.setText(Double.toString(eredmény));
        lbÜzenet.setText(a+" "+művelet+" "+b+" = "+eredmény);
      }
    }
    catch (ArithmeticException ex) {
      lbÜzenet.setText("Számítási hiba: "+ex.getMessage());
    }
    catch (Exception ex) {
      lbÜzenet.setText("Általános hiba: "+ex.getMessage());
    }
  }

  public static void main(String[] args) {
    new Alapműveletek2();
  }
}