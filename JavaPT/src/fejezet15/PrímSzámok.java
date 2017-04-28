import java.util.TreeSet;

class Prím {
  static boolean prím(int x) {
    if(x<2)
      return false;
    int osztókSzáma=1;   //mert az 1 minden számnak osztója
    for(int i=2; i<=Math.sqrt(x); i++)
      if(x%i==0)
        osztókSzáma++;
    return (osztókSzáma==1);  //a szám gyökéig
  }
}

public class PrímSzámok extends Prím {
  public static void main(String[] args) {
    TreeSet<Integer> prímHalmaz=new TreeSet<Integer>();
    int max=1000;
    for(int i=1; i<=max; i++)
      if(prím(i))
        prímHalmaz.add(i);
    System.out.println("A prímszámok 1-től "+max+"-ig:\n"+
      prímHalmaz);
  }
}