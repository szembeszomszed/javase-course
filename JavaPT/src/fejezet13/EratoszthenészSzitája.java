import java.util.TreeSet;

public class EratoszthenészSzitája {
  public static void main(String[] args) {
    TreeSet<Integer> számHalmaz=new TreeSet<Integer>();
    TreeSet<Integer> prímHalmaz=new TreeSet<Integer>();
    int max=1000;
    for(int i=2; i<=max; i++)
      számHalmaz.add(i);
    int szám=0;
    while(szám<=Math.sqrt(max)) {
      szám=számHalmaz.first();
      prímHalmaz.add(szám);
      int szorzó=1;
      while(szám*szorzó<=max)
        számHalmaz.remove(szám*szorzó++);
    }
    prímHalmaz.addAll(számHalmaz);
    System.out.println("A prímszámok 1-től "+max+"-ig:\n"+prímHalmaz);
  }
}