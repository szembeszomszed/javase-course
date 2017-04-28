import java.util.*;

public class MaximálisVektorelemekSzáma {
  public static void main(String[] args) {
    System.out.print("300 db szám között ");
    Vector<Integer> vektor=new Vector<Integer>();
    for(int i=1; i<=300; i++)
      vektor.add((int)(Math.random()*101-50));
    Collections.sort(vektor);
    int max=vektor.lastElement();
    int maxDb=0;
    for(int i=vektor.size()-1; vektor.get(i)==max; i--)
      maxDb++;
    System.out.println("a legnagyobb szám: "+max+", amelyből "+maxDb+" van.");
  }
}