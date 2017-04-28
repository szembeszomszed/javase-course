import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lista2 extends JFrame
    implements ActionListener, ListSelectionListener {
  private DefaultListModel dmBal=new DefaultListModel();//1
  private JList lsBalLista=new JList(dmBal);            //2
  private DefaultListModel dmJobb=
    new DefaultListModel();                             //3
  private JList lsJobbLista=new JList(dmJobb);          //4
  private JButton btJobbra1=new JButton(" > ");         //5
  private JButton btJobbraN=new JButton(" >> ");        //6
  private JButton btBalra1=new JButton(" < ");          //7
  private JButton btBalraN=new JButton(" << ");         //8
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Lista2() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Műveletek listaelemekkel");
    setBounds(kép.width/2-200, kép.height/2-100, 400, 200);
    setResizable(false);
    JPanel pnCímsor=new JPanel(new GridLayout(1, 3));
    pnCímsor.add(new JLabel("Bal lista"));
    pnCímsor.add(new JLabel());                        //10
    pnCímsor.add(new JLabel("Jobb lista"));
    add(pnCímsor, BorderLayout.NORTH);
    JPanel pnListák=new JPanel(new GridLayout(1, 3));
    dmBal.addElement(new String("1. elem"));           //11
    dmBal.addElement("2. elem");                       //12
    for(int i=3; i<=6; i++)
      dmBal.addElement(i+". elem");                    //13
    pnListák.add(lsBalLista);
    JPanel pnGomb=new JPanel(new GridLayout(4, 1));
    pnGomb.add(btJobbra1);
    pnGomb.add(btJobbraN);
    pnGomb.add(btBalra1);
    pnGomb.add(btBalraN);
    pnListák.add(pnGomb);
    pnListák.add(lsJobbLista);
    add(pnListák);
    btJobbra1.addActionListener(this);                 //14
    btJobbraN.addActionListener(this);
    btBalra1.addActionListener(this);
    btBalraN.addActionListener(this);
    lsBalLista.addListSelectionListener(this);         //15
    lsJobbLista.addListSelectionListener(this);
    setVisible(true);
    gombBeállít();
  }

  private void gombBeállít() {
    btJobbra1.setEnabled(
      lsBalLista.getSelectedIndices().length==1);      //16
    btJobbraN.setEnabled(
      lsBalLista.getSelectedIndices().length>1);       //17
    btBalra1.setEnabled(
      lsJobbLista.getSelectedIndices().length==1);     //18
    btBalraN.setEnabled(
      lsJobbLista.getSelectedIndices().length>1);      //19
  }

  public void valueChanged(ListSelectionEvent e) {     //20
    gombBeállít();
  }

  public void actionPerformed(ActionEvent e) {         //21
    gombBeállít();
    Object kiválasztott1;
    Object[] kiválasztottN;
    if(e.getSource()==btJobbra1) {                     //22
      kiválasztott1=lsBalLista.getSelectedValue();     //23
      dmJobb.addElement(kiválasztott1);                //24
      dmBal.removeElement(kiválasztott1);              //25
    }
    else if(e.getSource()==btBalra1) {                 //26
      kiválasztott1=lsJobbLista.getSelectedValue();
      dmBal.addElement(kiválasztott1);
      dmJobb.removeElement(kiválasztott1);
    }
    else if(e.getSource()==btJobbraN) {                //27
      kiválasztottN=lsBalLista.getSelectedValues();    //28
      for(int i=kiválasztottN.length-1; i>=0; i--) {   //29
        dmJobb.addElement(kiválasztottN[i]);           //30
        dmBal.removeElement(kiválasztottN[i]);         //31
      }
    }
    else if(e.getSource()==btBalraN) {                 //32
      kiválasztottN=lsJobbLista.getSelectedValues();
      for(int i=kiválasztottN.length-1; i>=0; i--) {
        dmBal.addElement(kiválasztottN[i]);
        dmJobb.removeElement(kiválasztottN[i]);
      }
    }
  }

  public static void main(String[] args) {
    new Lista2();
  }
}