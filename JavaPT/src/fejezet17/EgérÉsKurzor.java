import java.awt.*;
import java.awt.event.MouseEvent;                       //1
import java.awt.event.MouseListener;                    //2
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EgérÉsKurzor extends JFrame
    implements MouseListener {                          //3
  private final String[] KURZORFELIRAT={"Wait Cursor",
    "Crosshair Cursor", "Hand Cursor", "Move Cursor"};  //4
  private final int[] KURZORSORSZÁM={3, 1, 12, 13};     //5
  private JButton[] btTömb=new JButton[4];              //6
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public EgérÉsKurzor() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Egérkurzorok");
    setBounds(kép.width/2-300, kép.height/2-50, 600, 100);
    setResizable(false);
    setLayout(new GridLayout(1, 4));
    for(int i=0; i<btTömb.length; i++) {                //7
      btTömb[i]=new JButton(KURZORFELIRAT[i]);          //8
      JPanel pn=new JPanel();
      pn.add(btTömb[i]);                                //9
      add(pn);
      btTömb[i].addMouseListener(this);                //10
    }
    setVisible(true);
  }

  public void mouseClicked(MouseEvent e) {             //11
    ;
  }

  public void mousePressed(MouseEvent e) {             //12
    ;
  }

  public void mouseReleased(MouseEvent e) {            //13
    ;
  }

  public void mouseEntered(MouseEvent e) {             //14
    JButton btAktGomb=(JButton)e.getSource();          //15
    int i=0;
    while(!btTömb[i].getText().equals(btAktGomb.getText()))
      i++;
    setCursor(new Cursor(KURZORSORSZÁM[i]));           //16
  }

  public void mouseExited(MouseEvent e) {              //17
    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));      //18
  }

  public static void main(String[] args) {
    new EgérÉsKurzor();
  }
}