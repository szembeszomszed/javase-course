import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MásodfokúEgyenlet6 extends JFrame implements ActionListener, KeyListener {
  private JTextField tfA=new JTextField(6);
  private JTextField tfB=new JTextField(6);
  private JTextField tfC=new JTextField(6);
  private final String KARAKTERHALMAZ="0123456789.-";
  private JButton btMegold=new JButton("Megold");
  private JButton btTöröl=new JButton("Töröl");
  private JLabel lbÜzenet=new JLabel();
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public MásodfokúEgyenlet6() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Másodfokú egyenlet megoldása");
    setBounds(kép.width/2-175, kép.height/2-75, 350, 150);
    setResizable(false);
    setLayout(new GridLayout(3, 1));

    JPanel pnBemenet=new JPanel();              //pnBemenet
    pnBemenet.add(new JLabel("a =")); pnBemenet.add(tfA);
    pnBemenet.add(new JLabel("b =")); pnBemenet.add(tfB);
    pnBemenet.add(new JLabel("c =")); pnBemenet.add(tfC);
    tfA.addKeyListener(this);            //billentyűfigyelő
    tfB.addKeyListener(this);
    tfC.addKeyListener(this);
    add(pnBemenet);

    JPanel pnGombok=new JPanel();                //pnGombok
    pnGombok.add(btMegold);
    pnGombok.add(btTöröl);
    btMegold.addActionListener(this);        //akciófigyelő
    btTöröl.addActionListener(this);
    add(pnGombok);

    lbÜzenet.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbÜzenet);
    setVisible(true);
  }

  private void hibaÜzenet(String üzenet) {
    JOptionPane.showMessageDialog(this, üzenet, "Hiba", JOptionPane.ERROR_MESSAGE);
  }

  private void megold() {
    double a=0, b=0, c=0;

    try {                                 //'a' ellenőrzése
      if(tfA.getText().equals(""))
        throw new IllegalArgumentException("Hiba: az 'a' hiányzik!");
      a=Double.parseDouble(tfA.getText());
      if(a==0)
        throw new IllegalArgumentException("Hiba: az 'a' 0! Az egyenlet nem másodfokú!");
    }
    catch(NumberFormatException e) {
      hibaÜzenet("Hiba: az 'a' nem valós szám!");
      return;
    }
    catch(IllegalArgumentException e) {
      hibaÜzenet(e.getMessage());
      return;
    }

    try {                                 //'b' ellenőrzése
      if(tfB.getText().equals(""))
        throw new IllegalArgumentException("Hiba: a 'b' hiányzik!");
      b=Double.parseDouble(tfB.getText());
    }
    catch(NumberFormatException e) {
      hibaÜzenet("Hiba: a 'b' nem valós szám!");
      return;
    }
    catch(IllegalArgumentException e) {
      hibaÜzenet(e.getMessage());
      return;
    }

    try {                                 //'c' ellenőrzése
      if(tfC.getText().equals(""))
        throw new IllegalArgumentException("Hiba: a 'c' hiányzik!");
      c=Double.parseDouble(tfC.getText());
    }
    catch(NumberFormatException e) {
      hibaÜzenet("Hiba: a 'c' nem valós szám!");
      return;
    }
    catch(IllegalArgumentException e) {
      hibaÜzenet(e.getMessage());
      return;
    }

    double d, x1, x2;                            //számítás
    String üzenet="";
    d=b*b-4*a*c;
    if(d>0) {
      x1=((-1)*b+Math.sqrt(d))/(2*a);
      x2=(-b-Math.sqrt(d))/(2*a);
      üzenet="x1 = "+extra.Format.left(x1, 0, 2)+
             " és x2 = "+extra.Format.left(x2, 0, 2);
    }
    if(d==0) {
      x1=(-b)/(2*a);
      üzenet="x = "+extra.Format.left(x1, 0, 2);
    }
    if(d<0) {                          //pl.: a=1, b=2, c=2
      double xre=(-b)/(2*a),
        xim=Math.sqrt(-d)/(2*a);
      üzenet="x1 = "+extra.Format.left(xre, 0, 2)+"+"+
                     extra.Format.left(xim, 0, 2)+"i és "+
             "x2 = "+extra.Format.left(xre, 0, 2)+"-"+
                     extra.Format.left(xim, 0, 2)+"i";
    }

    lbÜzenet.setText(üzenet);
  }

  private void töröl() {
    tfA.setText("");
    tfB.setText("");
    tfC.setText("");
    lbÜzenet.setText("");
    tfA.requestFocus();
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==btMegold)
      megold();
    if(e.getSource()==btTöröl)
      töröl();
  }

  public void keyTyped(KeyEvent e) {
    ;
  }

  public void keyPressed(KeyEvent e) {
    if((KARAKTERHALMAZ.indexOf(e.getKeyChar())==-1) &&
        (e.getKeyChar()!=KeyEvent.VK_DELETE) &&
        (e.getKeyChar()!=KeyEvent.VK_BACK_SPACE))
      ((JTextField)e.getSource()).setEditable(false);
  }

  public void keyReleased(KeyEvent e) {
    ((JTextField)e.getSource()).setEditable(true);
  }

  public static void main(String[] args) {
    new MásodfokúEgyenlet6();
  }
}