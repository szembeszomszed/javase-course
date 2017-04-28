public class MinimumkiválasztásosRendezésDemo {

  final static int N=20;
  static int[] tömb = new int[N+1];

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*90+10);
  }

  static void tömbLista(String üzenet) {
    System.out.print(üzenet);
    for(int i=1; i<N; i++)
      System.out.print(tömb[i]+", ");
    System.out.println(tömb[N]);
  }

  static void tömbRendez() { //minimumkiválasztásos rendezés
    System.out.println("\n\n***** Rendezés kezdete ***********************************\n\n");
    int csere, minHely, hasonlításDb=0, csereDb=0;
    for(int i=1; i<=N-1; i++) {
      System.out.println("i="+i+"\n  tömb["+i+"]="+tömb[i]);
      minHely=i;
      for(int j=i+1; j<=N; j++) {
        hasonlításDb++;
        if(tömb[minHely]>tömb[j])
          minHely=j;
      }
      System.out.println("  "+i+". elemtől jobbra lévők között a legkisebb: "+
        "tömb["+minHely+"]="+tömb[minHely]+".\n" +
        "  tömb["+i+"]="+tömb[i]+" és "+
        "tömb["+minHely+"]="+tömb[minHely]+" elemeket fel kell cserélni.");
      csere=tömb[i];
      tömb[i]=tömb[minHely];
      tömb[minHely]=csere;
      csereDb++;
      tömbLista("  A tömb elemei a cserét követően:\n  ");
      System.out.println();
    }
    System.out.println("\nÖsszehasonlítások száma (a minimumkiválasztás során): "+hasonlításDb+"\n"+
      "Cserék száma: "+csereDb);
    System.out.println("\n\n***** Rendezés vége **************************************\n\n");
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:\n");
    tömbRendez();
    tömbLista("A tömb elemei a rendezés után:\n");
  }
}