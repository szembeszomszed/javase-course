public class PárosÉsPáratlanElemekKülönRendezve {

  final static int N=30;
  static int[] tömb = new int[N+1];

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*90+10);
  }

  static void tömbLista(String üzenet, int[] tömb) {
    System.out.println(üzenet);
    for(int i=1; i<tömb.length-1; i++)
      System.out.print(tömb[i]+", ");
    System.out.println(tömb[tömb.length-1]);
  }

  static int[] tömbRendez(int[] tömb) {
    int csere;
    for(int i=1; i<=tömb.length-2; i++)
      for(int j=i+1; j<=tömb.length-1; j++)
        if(tömb[i]>tömb[j]) {
          csere=tömb[i];
          tömb[i]=tömb[j];
          tömb[j]=csere;
        }
    return tömb;
  }

  static int[] tömbPárosVálogat(int[] tömb) {
    int párosDb=0;
    for(int i=1; i<=N; i++)
      if(tömb[i]%2==0)
        párosDb++;
    int[] segédTömb=new int[párosDb+1];
    int párosIndex=1;
    for(int i=1; i<=N; i++)
      if(tömb[i]%2==0)
        segédTömb[párosIndex++]=tömb[i];
    return tömbRendez(segédTömb);
  }

  static int[] tömbPáratlanVálogat(int[] tömb) {
    int páratlanDb=0;
    for(int i=1; i<=N; i++)
      if(tömb[i]%2==1)
        páratlanDb++;
    int[] segédTömb=new int[páratlanDb+1];
    int páratlanIndex=1;
    for(int i=1; i<=N; i++)
      if(tömb[i]%2==1)
        segédTömb[páratlanIndex++]=tömb[i];
    return tömbRendez(segédTömb);
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei:", tömb);
    int[] párosTömb=tömbPárosVálogat(tömb);
    tömbLista("A páros elemek növekvő sorrendben:", párosTömb);
    int[] páratlanTömb=tömbPáratlanVálogat(tömb);
    tömbLista("A páratlan elemek növekvő sorrendben:", páratlanTömb);
  }
}