public class JavítottBuborékosRendezés {

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

  static void tömbRendez() { // javított buborékos rendezés
    int i=N, csere, csereHely;
    while(i>=2) {                                       //1
      csereHely=0;                                      //2
      for(int j=1; j<=i-1; j++)                         //3
        if(tömb[j]>tömb[j+1]) {                         //4
          csere=tömb[j];                                //5
          tömb[j]=tömb[j+1];
          tömb[j+1]=csere;
          csereHely=j;                                  //6
        }
      i=csereHely;                                      //7
    }
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    tömbRendez();
    tömbLista("A tömb elemei a rendezés után:");
  }
}