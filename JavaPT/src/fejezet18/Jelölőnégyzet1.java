import java.awt.*;
import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Jelölőnégyzet1 extends JFrame
    implements ActionListener {
  private JLabel lbSzöveg=new JLabel();                 //1
  private JCheckBox cbMate=
    new JCheckBox("matematika", true);                  //2
  private JCheckBox cbInfo=
    new JCheckBox("informatika", true);
  private JCheckBox cbBiol=new JCheckBox("biológia");   //3
  private JCheckBox cbFöld=new JCheckBox("földrajz");
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Jelölőnégyzet1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Kedvenc tantárgy");
    setBounds(kép.width/2-250, kép.height/2-75, 500, 150);
    setResizable(false);
    setLayout(new GridLayout(2, 1));
    lbSzöveg.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbSzöveg);
    JPanel pn=new JPanel();
    cbMate.addActionListener(this); pn.add(cbMate);     //4
    cbInfo.addActionListener(this); pn.add(cbInfo);
    cbBiol.addActionListener(this); pn.add(cbBiol);
    cbFöld.addActionListener(this); pn.add(cbFöld);
    add(pn);
    setVisible(true);
    kiértékel();                                        //5
  }

  private void kiértékel() {                            //6
    String üzenet="Kedvenc tantárgy:";                  //7
    üzenet+=(cbMate.isSelected()?" "+
             cbMate.getText()+",":"");                  //8
    üzenet+=(cbInfo.isSelected()?" informatika,":"");   //9
    üzenet+=(cbBiol.isSelected()?" biológia,":"");
    üzenet+=(cbFöld.isSelected()?" földrajz,":"");
    if(üzenet.equals("Kedvenc tantárgy:"))             //10
      üzenet+=" nincs";
    else
      üzenet=üzenet.substring(0, üzenet.length()-1);   //11
    lbSzöveg.setText(üzenet);                          //12
  }

  public void actionPerformed(ActionEvent e) {         //13
    kiértékel();
  }

  public static void main(String[] args) {
    new Jelölőnégyzet1();
  }
}