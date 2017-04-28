public class GyorsRendezés {

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
                                  // gyorsrendezés
  static void tömbRendez(int alsóHatár, int felsőHatár) {
    int i=alsóHatár, j=felsőHatár, csere,               //1
        elválasztó=tömb[(alsóHatár+felsőHatár)/2];      //2
    while(i<=j) {                                       //3
      while(tömb[i]<elválasztó)                         //4
        i++;
      while(tömb[j]>elválasztó)                         //5
        j--;
      if(i<j) {                                         //6
        csere=tömb[i];
        tömb[i]=tömb[j];
        tömb[j]=csere;
      }
      if(i<=j) {                                        //7
        i++;
        j--;
      }
    }
    if(alsóHatár<j)                                     //8
      tömbRendez(alsóHatár, j);                         //9
    if(i<felsőHatár)                                   //10
      tömbRendez(i, felsőHatár);                       //11
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:");
    tömbRendez(1, N);                                  //12
    tömbLista("A tömb elemei a rendezés után:");
  }
}