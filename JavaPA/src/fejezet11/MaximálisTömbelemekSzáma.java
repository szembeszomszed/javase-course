public class MaximálisTömbelemekSzáma {

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

  static void legnagyobbTömbelemDb() {
    int max=tömb[1];
    for(int i=2; i<=N; i++)
      if(tömb[i]>max)
        max=tömb[i];
    int maxDb=0;
    for(int i=0; i<=N; i++)
      if(tömb[i]==max)
        maxDb++;
    System.out.println("A tömb legnagyobb eleme: "+max+", amelyből "+maxDb+" darab van.");
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    legnagyobbTömbelemDb();
  }
}