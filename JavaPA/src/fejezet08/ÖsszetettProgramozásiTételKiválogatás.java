public class ÖsszetettProgramozásiTételKiválogatás {
  public static void main(String[] args) {
    final int N=15;
    int[] tömb1=new int[N+1];
    for(int i=1; i<=N; i++)
      tömb1[i]=(int)(Math.random()*90+10);
    System.out.print("A tömbelemek: ");
    for(int i=1; i<=N; i++)
      System.out.print(tömb1[i]+", ");
    System.out.println();
    int[] tömb2=new int[N+1];                           //1
    int db=0;                                           //2
    for(int i=1; i<=N; i++)
      if(tömb1[i]<50)                                   //3
        tömb2[++db]=tömb1[i]; //kiválogatás             //4
    System.out.print("Az 50-nél kisebb tömbelemek: ");
    for(int i=1; i<=db; i++)                            //5
      System.out.print(tömb2[i]+", ");
    System.out.println();
  }
}