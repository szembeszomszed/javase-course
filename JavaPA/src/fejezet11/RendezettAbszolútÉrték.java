public class RendezettAbszolútÉrték {

  final static int N=20;
  static int[] tömb = new int[N+1];

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*101-50); // [-50; +50]
  }

  static void tömbLista(String üzenet) {
    System.out.println(üzenet);
    for(int i=1; i<N; i++)
      System.out.print(tömb[i]+", ");
    System.out.println(tömb[N]);
  }

  static void tömbRendez() {
    int csere;
    for(int i=1; i<=N-1; i++)
      for(int j=i+1; j<=N; j++)
        if(Math.abs(tömb[i])>Math.abs(tömb[j])) {
          csere=tömb[i];
          tömb[i]=tömb[j];
          tömb[j]=csere;
        }
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    tömbRendez();
    tömbLista("A tömb elemei az abszolúértékük szerinti rendezés után:");
  }
}