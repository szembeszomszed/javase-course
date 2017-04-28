public class EgyszerűCserésRendezésDemo {

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

  static void tömbRendez() { // egyszerű cserés rendezés
    System.out.println("\n\n***** Rendezés kezdete ***********************************\n\n");
    int csere, hasonlításDb=0, csereDb=0;
    for(int i=1; i<=N-1; i++)
      for(int j=i+1; j<=N; j++) {
        hasonlításDb++;
        System.out.print("i="+i+"; j="+j+
          "\n  tömb["+i+"]="+tömb[i]+
          " és tömb["+j+"]="+tömb[j]+" elemek");
        if(tömb[i]>tömb[j]) {
          csere=tömb[i];
          tömb[i]=tömb[j];
          tömb[j]=csere;
          System.out.println("et fel kell cserélni.");
          csereDb++;
          tömbLista("  A tömb elemei a cserét követően:\n  ");
          System.out.println();
        }
        else
          System.out.println(" sorrendje megfelelő.\n");
      }
    System.out.println("Összehasonlítások száma: "+hasonlításDb+"\n"+
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