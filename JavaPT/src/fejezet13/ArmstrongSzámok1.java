import java.util.Vector;

public class ArmstrongSzámok1 {
  public static void main(String[] args) {
    Vector<Integer> vektor=new Vector<Integer>();
    for(int a=1; a<=9; a++)
      for(int b=0; b<=9; b++)
        for(int c=0; c<=9; c++)
          if (a*a*a+b*b*b+c*c*c==100*a+10*b+c)
              vektor.add(100*a+10*b+c);
    System.out.println("A háromjegyű Armstrong számok: "+vektor);
  }
}