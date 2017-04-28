import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

interface BmiKonstans {                                 //1
  int MINTESTMAGASSÁG=100, MAXTESTMAGASSÁG=200,
     MINTESTTÖMEG=40, MAXTESTTÖMEG=150;
}

class Bmi implements BmiKonstans {                      //2
  private int testMagasság, testTömeg;             //cm, kg

  public Bmi(int testMagasság, int testTömeg) {         //3
    setTestMagasság(testMagasság);
    setTestTömeg(testTömeg);
  }

  public void setTestMagasság(int testMagasság) {       //4
    this.testMagasság=ellenőriz("testmagasság",
      testMagasság, MINTESTMAGASSÁG, MAXTESTMAGASSÁG);
  }

  public void setTestTömeg(int testTömeg) {             //5
    this.testTömeg=ellenőriz("testtömeg",
      testTömeg, MINTESTTÖMEG, MAXTESTTÖMEG);
  }
 
  private int ellenőriz(String üzenet,                  //6
      int érték, int min, int max) {
    üzenet="A "+üzenet+" túl ";
    if(érték<min)
      throw new IndexOutOfBoundsException(üzenet+"kicsi.");
    if(érték>max)
      throw new IndexOutOfBoundsException(üzenet+"nagy.");
    return érték;
  }

  public int getTestMagasság() {
    return testMagasság;
  }

  public int getTestTömeg() {
    return testTömeg;
  }

  public String getTestMagasságMértékegység() {
    return "cm";
  }

  public String getTestTömegMértékegység() {
    return "kg";
  }

  public double bmi() {                                 //7
    return testTömeg/(Math.pow(testMagasság/100.0, 2));
  }

  @Override
  public String toString() {                            //8
    return "Az Ön BMI-je "+extra.Format.left(bmi(),0,2)+
      ", azaz Ön "+értékelés()+" testalkatú.";
  }

  private String értékelés() {                          //9
    double bmi=bmi();
    String s;
    if(bmi<20)
      s="sovány";
    else if(bmi<25)
      s="normál";
    else if(bmi<30)
      s="túlsúlyos";
    else if(bmi<40)
      s="elhízott";
    else
      s="kórosan elhízott";
    return s;
  }
}

class Ablak extends JFrame implements AdjustmentListener {
  private JScrollBar sbTestMagasság=new JScrollBar(
    JScrollBar.HORIZONTAL, 180, 5, 100, 200+5);        //10
  private JScrollBar sbTestTömeg=new JScrollBar(
    JScrollBar.HORIZONTAL, 80, 5,
    Bmi.MINTESTTÖMEG, Bmi.MAXTESTTÖMEG+5);             //11
  private JLabel lbÉrtékelés=
    new JLabel("", SwingConstants.CENTER);
  private JLabel lbTestMagasság=new JLabel("cm");
  private JLabel lbTestTömeg=new JLabel("kg");
  private Bmi bmi=new Bmi(180, sbTestTömeg.getValue());//12
  private Dimension kép=
    Toolkit.getDefaultToolkit().getScreenSize();

  public Ablak() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Testtömeg-index");
    setBounds(kép.width/2-200, kép.height/2-60, 400, 120);
    setResizable(false);
    setLayout(new GridLayout(3,2));
    add(panelGyártó("Testmagasság:", 
          sbTestMagasság, lbTestMagasság));            //13
    add(panelGyártó("Testtömeg:",
          sbTestTömeg, lbTestTömeg));                  //14
    add(lbÉrtékelés);
    setVisible(true);
    adatFrissít();
  }

  private JPanel panelGyártó(String felirat,
      JScrollBar sb, JLabel lb) {                      //15
    JPanel pn=new JPanel();                            //16
    pn.setLayout(new GridLayout(1, 3));
    pn.add(new JLabel("  "+felirat));
    pn.add(sb);
    pn.add(lb);
    sb.setBlockIncrement(10);                          //17
    sb.addAdjustmentListener(this);
    return pn;                                         //18
  }

  public void adjustmentValueChanged(AdjustmentEvent e) {
    if(e.getSource()==sbTestMagasság)
      bmi.setTestMagasság(sbTestMagasság.getValue());
    if(e.getSource()==sbTestTömeg)
      bmi.setTestTömeg(sbTestTömeg.getValue());
    adatFrissít();                                     //19
  }

  private void adatFrissít() {                         //20
    lbTestMagasság.setText("  "+bmi.getTestMagasság()+" "+
      bmi.getTestMagasságMértékegység());
    lbTestTömeg.setText("  "+bmi.getTestTömeg()+" "+
      bmi.getTestTömegMértékegység());
    lbÉrtékelés.setText(bmi.toString());
  }
}

public class BmiIndex6 {
  public static void main(String[] args) {
    new Ablak();                                       //21
  }
}