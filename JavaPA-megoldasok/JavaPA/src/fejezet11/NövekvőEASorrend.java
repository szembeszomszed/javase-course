public class NövekvőEASorrend {

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

  static void tömbRendez() {
    int csere;
    for(int i=1; i<=N-1; i++)
      for(int j=i+1; j<=N; j++)
        if(tömb[i]>tömb[j]) {
          csere=tömb[i];
          tömb[i]=tömb[j];
          tömb[j]=csere;
        }
  }

  static boolean rendezettEATömb(int[] tömb) {
    int i=1; // növeksvő részsorozat elemeinek száma
    while(i<N && tömb[i]<=tömb[i+1])
      i++;
    return i==N;
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei rendezetlenül:");
    System.out.println("Rendezett-e a tömb? \n"+
      (rendezettEATömb(tömb)?"Igen.":"Nem."));
    tömbRendez();
    tömbLista("\nA tömb elemei rendezetten:");
    System.out.println("Rendezett-e a tömb? \n"+
      (rendezettEATömb(tömb)?"Igen.":"Nem."));
  }
}