public class ÖsszetettProgramozásiTételMásolás {
  public static void main(String[] args) {
    final int N=15;                                     //1
    int[] tömb1=new int[N+1];
    for(int i=1; i<=N; i++)                             //2
      tömb1[i]=(int)(Math.random()*90+10);
    System.out.print("A tömbelemek: ");
    for(int i=1; i<=N; i++)                             //3
      System.out.print(tömb1[i]+", ");
    System.out.println();
    int[] tömb2=new int[N+1];                           //4
    for(int i=1; i<=N; i++)                             //5
      tömb2[i]=tömb1[i]*2;  //másolás                   //6
    System.out.print("A tömbelemek duplázva: ");
    for(int i=1; i<=N; i++)                             //7
      System.out.print(tömb2[i]+", ");
    System.out.println();
  }
}