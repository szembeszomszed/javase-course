import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;                               //1
import javax.swing.ListSelectionModel;                  //2
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;            //3
import javax.swing.event.ListSelectionListener;         //4

public class Lista1 extends JFrame
    implements ListSelectionListener {                  //5
  private JLabel lbSzöveg=new JLabel(
    "Kedvenc tantárgy: nincs");                         //6
  private final String[] TANTÁRGY=                      //7
    {"matematika", "informatika", "biológia", "földrajz"};
  private JList lsTantárgy=new JList(TANTÁRGY);         //8
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Lista1() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Kedvenc tantárgy");
    setBounds(kép.width/2-250, kép.height/2-75, 500, 150);
    setResizable(false);
    setLayout(new BorderLayout());
    lbSzöveg.setHorizontalAlignment(SwingConstants.CENTER);
    add(lbSzöveg, BorderLayout.NORTH);                  //9
    lsTantárgy.setSelectionMode(
      ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //10
    add(lsTantárgy, BorderLayout.CENTER);              //11
    lsTantárgy.addListSelectionListener(this);         //12
    setVisible(true);
  }

  public void valueChanged(ListSelectionEvent e) {     //13
    String üzenet="Kedvenc tantárgy:";
    for(int i=0;
        i<lsTantárgy.getSelectedValues().length; i++)  //14
      üzenet+=" "+
        lsTantárgy.getSelectedValues()[i]+",";         //15
    if(üzenet.equals("Kedvenc tantárgy:"))             //16
      üzenet+=" nincs";                                //17
    else
      üzenet=üzenet.substring(0, üzenet.length()-1);   //18
    lbSzöveg.setText(üzenet);                          //19
  }

  public static void main(String[] args) {
    new Lista1();
  }
}