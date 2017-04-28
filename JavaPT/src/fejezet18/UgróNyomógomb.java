import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UgróNyomógomb extends JFrame implements ActionListener {
  private JButton btGomb=new JButton("Ugró gomb");
  private final int LÉPTÉK=10;
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public UgróNyomógomb() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Ugró nyomógomb");
    setBounds(kép.width/2-150, kép.height/2-100, 300, 200);
    setLayout(new FlowLayout());
    btGomb.addActionListener(this);
    add(btGomb);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    gombMozgat();
  }

  public void gombMozgat() {
    Point hely=btGomb.getLocation();
    int iránytipp=(int)(Math.random()*4);
    switch(iránytipp) {
      case 0:                                         //fel
        if(hely.y-LÉPTÉK>=0)
          hely.y-=LÉPTÉK; break;
      case 1:                                       //balra
        if(hely.x-LÉPTÉK>=0)
          hely.x-=LÉPTÉK; break;
      case 2:                                      //jobbra
        if(hely.x+btGomb.getWidth()+LÉPTÉK<=
            getContentPane().getWidth())
          hely.x+=LÉPTÉK; break;
      case 3:                                          //le
        if(hely.y+btGomb.getHeight()+LÉPTÉK<=
            getContentPane().getHeight())
          hely.y+=LÉPTÉK;
    }
    btGomb.setLocation(hely);
  }

  public static void main(String[] args) {
    new UgróNyomógomb();
  }
}