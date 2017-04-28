public class LeggyakoribbSzám {
  public static void main(String[] args) {
    System.out.print("300 db szám között ");
    int[] tömb=new int[300];
    for(int i=0; i<300; i++)
      tömb[i]=(int)(Math.random()*101-50);
    int leggyakoribbszámDb=0, leggyakoribbSzám=-51, db;
    for(int i=-50; i<=50; i++) {
      db=0;
      for(int j=0; j<tömb.length; j++)
        if(tömb[j]==i)
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