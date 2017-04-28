import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class PárkeresőJáték extends JFrame implements ActionListener {
  private int idő=0, lépésDb=0, megtaláltPárDb=0;
  private javax.swing.Timer időzítő=new javax.swing.Timer(1000, this);
  private final int MAXPÁR=10, MAX=MAXPÁR*2;
  private Vector<JButton> gomb=new Vector<JButton>(MAX);
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public PárkeresőJáték() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Párkereső játék");
    setBounds(kép.width/2-200, kép.height/2-150, 400, 300);
    setResizable(false);
    setLayout(new GridLayout(4, 5));
    gombKészít();
    setVisible(true);
    időzítő.start();
  }

  private void gombKészít() {
    Vector<String> felirat=new Vector<String>();
    for(int i=1; i<=10; i++) {
      felirat.add(Integer.toString(i));
      felirat.add(Integer.toString(i));
    }
    Collections.shuffle(felirat);
    for(int i=0; i<MAX; i++) {
      JButton bt=new JButton();
      bt.setActionCommand(felirat.get(i));
      bt.setFont(new Font("Arial", Font.BOLD, 26));
      bt.addActionListener(this);
      gomb.add(bt);
      add(bt);
    }
  }

  private void stopperLéptet() {
    idő++;
    int perc=idő/60, másodperc=idő%60;
    setTitle("Párkereső játék ("+perc+":"+(másodperc<10?"0":"")+másodperc+")");
  }

  private void játék(JButton bt) {
    lépésDb++;
    bt.setText(" "+bt.getActionCommand()+" ");
    bt.setEnabled(false);
    int kiválasztottDb=0;
    for(int i=0; i<gomb.size(); i++)
      if(gomb.get(i).getText().length()>=3 &     // " 9 ", " 10 "
          gomb.get(i).isEnabled()==false)
        kiválasztottDb++;
    if(kiválasztottDb==2) {
      int i=0;
      while(gomb.get(i).getText().length()<3)
        i++;
      JButton btKiválasztott1=gomb.get(i);
      i=gomb.size()-1;
      while(gomb.get(i).getText().length()<3)
        i--;
      JButton btKiválasztott2=gomb.get(i);
      if(btKiválasztott1.getText().equals(btKiválasztott2.getText())) { // ha pár
        btKiválasztott1.setText(btKiválasztott1.getActionCommand());
        btKiválasztott2.setText(btKiválasztott2.getActionCommand());
        megtaláltPárDb++;
        if(megtaláltPárDb==MAXPÁR) {
          időzítő.stop();
          JOptionPane.showMessageDialog(
            this, "A játék "+lépésDb+" lépésben ért véget.",
            "Eredmény", JOptionPane.INFORMATION_MESSAGE);
        }
      }
      else { // ha nem pár
        btKiválasztott1.setText("");
        btKiválasztott1.setEnabled(true);
        btKiválasztott2.setText("");
        btKiválasztott2.setEnabled(true);
      }
    }
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==időzítő)
      stopperLéptet();
    else
      játék((JButton)e.getSource());
  }

  public static void main(String[] args) {
    new PárkeresőJáték();
  }
}