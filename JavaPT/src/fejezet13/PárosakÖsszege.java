import java.util.Vector;

public class PárosakÖsszege {
  public static void main(String[] args) {
    System.out.print("300 db szám között ");
    Vector<Integer> vektor=new Vector<Integer>();
    for(int i=1; i<=300; i++)
      vektor.add((int)(Math.random()*101-50));
    int párosÖsszeg=0;
    for(int elem: vektor)
      if(elem%2==0)
        párosÖsszeg+=elem;
    System.out.println("a párosak összege: "+párosÖsszeg+".");
  }
}