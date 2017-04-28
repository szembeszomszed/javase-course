import java.awt.*;
import javax.swing.*;

public class Sakktábla extends JFrame {
  private Dimension kép=Toolkit.getDefaultToolkit().getScreenSize();

  public Sakktábla() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Sakktábla");
    setBounds(kép.width/2-150, kép.height/2-75, 400, 400);
    setResizable(false);
    setLayout(new BorderLayout());

    JPanel pnFelső=new JPanel(new GridLayout(1, 10));
    pnFelső.add(new JLabel("<html><br><br></html>"));
    for(char c='a'; c<='h'; c++)
      pnFelső.add(new JLabel("     "+Character.toString(c)+"    "));
    pnFelső.add(new JLabel(" "));
    add(pnFelső, BorderLayout.NORTH);

    JPanel pnBal=new JPanel(new GridLayout(8, 1));
    for(int i=8; i>=1; i--)
      pnBal.add(new JLabel("     "+Integer.toString(i)+"     "));
    add(pnBal, BorderLayout.WEST);

    JPanel pnKözépső=new JPanel(new GridLayout(8, 8));
    JPanel pnCella;
    Color szín;
    for(int sor=1; sor<=8; sor++)
      for(int oszlop=1; oszlop<=8; oszlop++) {
        pnCella=new JPanel();
        szín=(sor+oszlop)%2==0? Color.WHITE: Color.BLACK;
        pnCella.setBackground(szín);
        pnKözépső.add(pnCella);
      }
    add(pnKözépső, BorderLayout.CENTER);

    JPanel pnJobb=new JPanel(new GridLayout(8, 1));
    for(int i=8; i>=1; i--)
      pnJobb.add(new JLabel("      "+Integer.toString(i)+"      "));
    add(pnJobb, BorderLayout.EAST);
    
    JPanel pnAlsó=new JPanel(new GridLayout(1, 10));
    pnAlsó.add(new JLabel("<html><br><br></html>"));
    for(char c='a'; c<='h'; c++)
      pnAlsó.add(new JLabel("    "+Character.toString(c)+"   "));
    pnAlsó.add(new JLabel(" "));
    add(pnAlsó, BorderLayout.SOUTH);

    setVisible(true);
  }

  public static void main(String[] args) {
    new Sakktábla();
  }
}