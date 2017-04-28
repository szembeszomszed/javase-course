public class EgyszerűCserésRendezés {

  final static int N=20;
  static int[] tömb = new int[N+1];

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*90+10);
  }

  static void tömbLista(String üzenet) {
    System.out.println(üzenet);
    for(int i=1; i<N; i++)
      System.out.print(tömb[i]+", ");
    System.out.println(tömb[N]);
  }

  static void tömbRendez() { // egyszerű cserés rendezés
    int csere;                                          //1
    for(int i=1; i<=N-1; i++)                           //2
      for(int j=i+1; j<=N; j++)                         //3
        if(tömb[i]>tömb[j]) {                           //4
          csere=tömb[i];
          tömb[i]=tömb[j];
          tömb[j]=csere;
        }
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    tömbRendez();
    tömbLista("A tömb elemei a rendezés után:");
  }
}