public class ÁtlagtólValóEltérés1 {

  final static int N=20;
  static int[] tömb = new int[N+1];

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*100+1);
  }

  static void tömbLista(String üzenet) {
    System.out.println(üzenet);
    for(int i=1; i<N; i++)
      System.out.print(tömb[i]+", ");
    System.out.println(tömb[N]);
  }

  static void átlagKörül() {
    int összeg=0;
    for(int i=1; i<N; i++)
      összeg+=tömb[i];
    double átlag=(double)összeg/N;
    System.out.println("A tömbelemek átlaga: "+
      extra.Format.left(átlag, 0, 2));
    int db=0;
    for(int i=1; i<N; i++)
      if(átlag*0.8<=tömb[i] && tömb[i]<=átlag*1.2)
        db++;
    System.out.println(db+" olyan tömbelem van, amely az " +
      "átlagtól legfeljebb 20 százalékkal tér el.");
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    átlagKörül();
  }
}