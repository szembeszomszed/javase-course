import java.util.Vector;

public class LeggyakoribbSzám2 {
  public static void main(String[] args) {
    System.out.print("300 db szám között ");
    Vector<Integer> vektor=new Vector<Integer>();
    for(int i=1; i<=300; i++)
      vektor.add((int)(Math.random()*101-50));
    int leggyakoribbszámDb=0, leggyakoribbSzám=-51, db;
    for(int i=-50; i<=50; i++) {
      db=0;
      for(int j=0; j<vektor.size(); j++)
        if(vektor.get(j)==i)
          db++;
      if(db>leggyakoribbszámDb) {
        leggyakoribbszámDb=db;
        leggyakoribbSzám=i;
      }
    }
    System.out.println("a leggyakrabban előforduló szám: "+
      leggyakoribbSzám+" ("+leggyakoribbszámDb+" db).");
  }
}