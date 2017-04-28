import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MásodfokúEgyenlet4 extends JFrame
    implements ActionListener, KeyListener {            //1
  private JTextField tfA=new JTextField(6);             //2
  private JTextField tfB=new JTextField(6);
  private JTextField tfC=new JTextField(6);
  private final String KARAKTERHALMAZ="0123456789.-";   //3
  private JButton btMegold=new JButton("Megold");
  private JButton btTöröl=new JButton("Töröl");
  private JLabel lbÜzenet=new JLabel();
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public MásodfokúEgyenlet4() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Másodfokú egyenlet megoldása");
    setBounds(kép.width/2-175, kép.height/2-75, 350, 150);
    setResizable(false);
    setLayout(new GridLayout(3, 1));                    //4

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

    lbÜzenet.setHorizontalAlignment(             //lbÜzenet
      SwingConstants.CENTER);
    lbÜzenet.setForeground(Color.RED);                  //5
    add(lbÜzenet);
    setVisible(true);
  }

  private void megold() {                               //6
    double a=0, b=0, c=0;
    String hiba="";

    try {                                 //'a' ellenőrzése
      if(tfA.getText().equals(""))
        throw new IllegalArgumentException(             //7
          "Hiba: az 'a' hiányzik!");
      a=Double.parseDouble(tfA.getText());              //8
      if(a==0)
        throw new IllegalArgumentException(             //9
          "Hiba: az 'a' 0! Az egyenlet nem másodfokú!");
    }
    catch(NumberFormatException e) {                   //10
      hiba="Hiba: az 'a' nem valós szám!";
      lbÜzenet.setText(hiba);
      return;
    }
    catch(IllegalArgumentException e) {                //11
      hiba=e.getMessage();
      lbÜzenet.setText(hiba);
      return;
    }

    try {                                 //'b' ellenőrzése
      if(tfB.getText().equals(""))
        throw new IllegalArgumentException(
          "Hiba: a 'b' hiányzik!");
      b=Double.parseDouble(tfB.getText());
    }
    catch(NumberFormatException e) {
      hiba="Hiba: a 'b' nem valós szám!";
      lbÜzenet.setText(hiba);
      return;
    }
    catch(IllegalArgumentException e) {
      hiba=e.getMessage();
      lbÜzenet.setText(hiba);
      return;
    }

    try {                                 //'c' ellenőrzése
      if(tfC.getText().equals(""))
        throw new IllegalArgumentException(
          "Hiba: a 'c' hiányzik!");
      c=Double.parseDouble(tfC.getText());
    }
    catch(NumberFormatException e) {
      hiba="Hiba: a 'c' nem valós szám!";
      lbÜzenet.setText(hiba);
      return;
    }
    catch(IllegalArgumentException e) {
      hiba=e.getMessage();
      lbÜzenet.setText(hiba);
      return;
    }

    lbÜzenet.setForeground(Color.BLACK);         //számítás
    double d, x1, x2;
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
    if(d<0)
      üzenet="Nincs valós gyök.";
    lbÜzenet.setText(üzenet);                          //12
  }

  private void töröl() {                               //13
    tfA.setText("");
    tfB.setText("");
    tfC.setText("");
    lbÜzenet.setText("");
    tfA.requestFocus();                                //14
  }

  public void actionPerformed(ActionEvent e) {         //15
    if(e.getSource()==btMegold)
      megold();
    if(e.getSource()==btTöröl)
      töröl();
  }

  public void keyTyped(KeyEvent e) {
    ;
  }

  public void keyPressed(KeyEvent e) {                 //16
    if((KARAKTERHALMAZ.indexOf(e.getKeyChar())==-1) && //17
        (e.getKeyChar()!=KeyEvent.VK_DELETE) &&        //18
        (e.getKeyChar()!=KeyEvent.VK_BACK_SPACE))      //19
      ((JTextField)e.getSource()).setEditable(false);  //20
  }

  public void keyReleased(KeyEvent e) {                //21
    ((JTextField)e.getSource()).setEditable(true);     //22
  }

  public static void main(String[] args) {
    new MásodfokúEgyenlet4();
  }
}