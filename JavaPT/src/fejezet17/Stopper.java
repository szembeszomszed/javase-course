import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopper extends JFrame implements ActionListener {
  private int idő=0;
  private Timer időzítő=new Timer(idő, this);
  private JLabel lbStopper=new JLabel(""+idő);
  private JButton btStartStop=new JButton("Start");
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Stopper() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Stopper");
    setBounds(kép.width/2-100, kép.height/2-50, 200, 100);
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    lbStopper.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbStopper);
    add(btStartStop);
    btStartStop.addActionListener(this);
    setVisible(true);
    időzítő.setDelay(100);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==időzítő)
      lbStopper.setText(""+(++idő));
    else { //nyomógomb
      if(btStartStop.getText().equals("Start")) {
        időzítő.start();
        btStartStop.setText("Stop");
      }
      else {
        időzítő.stop();
        btStartStop.setText("Start");
        idő=0;
      }
    }
  }

  public static void main(String[] args) {
    new Stopper();
  }
}