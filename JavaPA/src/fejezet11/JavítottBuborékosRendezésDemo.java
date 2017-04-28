public class JavítottBuborékosRendezésDemo {

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

  static void tömbRendez() { // javított buborékos rendezés
    System.out.println("\n\n***** Rendezés kezdete ***********************************\n\n");
    int i=N, csere, csereHely, hasonlításDb=0, csereDb=0;
    while(i>=2) {
      csereHely=0;
      for(int j=1; j<=i-1; j++) {
        hasonlításDb++;
        System.out.print("i="+i+"; j="+j+
          "\n  tömb["+j+"]="+tömb[j]+
          " és tömb["+(j+1)+"]="+tömb[j+1]+" elemek");
        if(tömb[j]>tömb[j+1]) {
          csere=tömb[j];
          tömb[j]=tömb[j+1];
          tömb[j+1]=csere;
          csereHely=j;
          System.out.println("et fel kell cserélni.");
          csereDb++;
          tömbLista("  A tömb elemei a cserét követően:\n  ");
          System.out.println();
        }
        else
          System.out.println(" sorrendje megfelelő.\n");
      }
      i=csereHely;
    }
    System.out.println("\nÖsszehasonlítások száma: "+hasonlításDb+"\n"+
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