public class MásodikLegnagyobbTömbelem {

  final static int N=20;
  static int[] tömb = new int[N+1];

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*5+1);
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
        if(tömb[i]<tömb[j]) {
          csere=tömb[i];
          tömb[i]=tömb[j];
          tömb[j]=csere;
        }
  }

  static void másodikLegnagyobbTömbelem() {
    int i=2, max=tömb[1];
    while(i<=N && tömb[i]==max)
      i++;
    boolean van=(i<=N);
    if(van)
      System.out.println("A tömb második legnagyobb eleme: "+tömb[i]);
    else
      System.out.println("A tömbnek nincs 2. legnagyobb eleme, mert minden tömbelem megegyezik.");
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    tömbRendez();
    tömbLista("A tömb elemei a rendezés után:");
    másodikLegnagyobbTömbelem();
  }
}