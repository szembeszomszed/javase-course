public class BuborékosRendezés {

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

  static void tömbRendez() { // buborékos rendezés
    int csere;
    for(int i=N; i>=2; i--) {                           //1
      for(int j=1; j<=i-1; j++)                         //2
        if(tömb[j]>tömb[j+1]) {                         //3
          csere=tömb[j];                                //4
          tömb[j]=tömb[j+1];
          tömb[j+1]=csere;
        }
    }
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    tömbRendez();
    tömbLista("A tömb elemei a rendezés után:");
  }
}