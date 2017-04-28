import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UgrálóNyomógomb1 extends JFrame
    implements ActionListener {                         //1
  private Timer időzítő=new Timer(100, this);           //2
  private JButton btGomb=new JButton("Ugráló gomb");
  private final int LÉPTÉK=10;                          //3
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public UgrálóNyomógomb1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Ugráló nyomógomb");
    setBounds(kép.width/2-150, kép.height/2-75, 350, 150);
    setLayout(new FlowLayout());
    add(btGomb);
    setVisible(true);
    időzítő.addActionListener(this);                    //4
    időzítő.start();                                    //5
  }

  public void actionPerformed(ActionEvent e) {          //6
    gombMozgat();
  }

  public void gombMozgat() {                            //7
    Point hely=btGomb.getLocation();                    //8
    int iránytipp=(int)(Math.random()*4);               //9
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
    btGomb.setLocation(hely);                          //10
  }

  public static void main(String[] args) {
    new UgrálóNyomógomb1();
  }
}