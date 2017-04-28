import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UgrálóNyomógomb2 extends JFrame implements ActionListener {
  private Timer időzítő=new Timer(100, this);
  private boolean ugrálhat=false;
  private JButton btGomb=new JButton("Ugráló gomb");
  private final int LÉPTÉK=10;
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public UgrálóNyomógomb2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Ugráló nyomógomb");
    setBounds(kép.width/2-150, kép.height/2-75, 350, 150);
    setLayout(new FlowLayout());
    btGomb.addActionListener(this);
    add(btGomb);
    setVisible(true);
    időzítő.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==időzítő)
      gombMozgat();
    if(e.getSource()==btGomb) {
      ugrálhat=!ugrálhat;
      if(ugrálhat)
        időzítő.start();
      else
        időzítő.stop();
    }
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
    new UgrálóNyomógomb2();
  }
}