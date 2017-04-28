public class ÖsszetettProgramozásiTételSzétválogatás {
  public static void main(String[] args) {
    final int N=15;
    int[] tömb=new int[N+1];
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*90+10);
    System.out.print("A tömbelemek: ");
    for(int i=1; i<=N; i++)
      System.out.print(tömb[i]+", ");
    System.out.println();
    int[] párosTömb=new int[N+1];                       //1
    int[] páratlanTömb=new int[N+1];                    //2
    int párosDb=0, páratlanDb=0;                        //3
    for(int i=1; i<=N; i++)                             //4
      if(tömb[i]%2==0) //szétválogatás
        párosTömb[++párosDb]=tömb[i];                   //5
      else
        páratlanTömb[++páratlanDb]=tömb[i];             //6
    System.out.print("A páros tömbelemek: ");           //7
    for(int i=1; i<=párosDb; i++)
      System.out.print(párosTömb[i]+", ");
    System.out.println();
    System.out.print("A páratlan tömbelemek: ");        //8
    for(int i=1; i<=páratlanDb; i++)
      System.out.print(páratlanTömb[i]+", ");
    System.out.println();
  }
}