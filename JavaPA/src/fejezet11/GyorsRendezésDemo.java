public class GyorsRendezésDemo {

  final static int N=20;
  static int[] tömb = new int[N+1];
  static int hasonlításDb=0, csereDb=0, rekurzívHívásDb=0;

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*90+10);
  }

  static void tömbLista(String üzenet, int a, int b) {
    System.out.print(üzenet);
    for(int i=1; i<N; i++)
      if(a<=i && i<=b)
        System.out.print(tömb[i]+", ");
      else
        System.out.print("__, ");
    if(a<=N && N<=b)
      System.out.println(tömb[N]);
    else
      System.out.println("__");
  }
                                  // gyorsrendezés
  static void tömbRendez(int alsóHatár, int felsőHatár) {
    int i=alsóHatár, j=felsőHatár, csere,
        elválasztó=tömb[(alsóHatár+felsőHatár)/2];
    rekurzívHívásDb++;
    System.out.println("\n"+rekurzívHívásDb+". rekurzív hívás:");
    tömbLista("  Rendezendő résztömb ("+alsóHatár+". és "+
      felsőHatár+". index között):\n  ", alsóHatár, felsőHatár);
    System.out.println("  elválasztó: tömb["+(alsóHatár+felsőHatár)/2+"]="+elválasztó+"\n");
    while(i<=j) {
      while(tömb[i]<elválasztó) {
        hasonlításDb++;
        i++;
      }
      while(tömb[j]>elválasztó) {
        hasonlításDb++;
        j--;
      }
      System.out.print("  i="+i+"; j="+j+"\n  tömb["+i+"]="+tömb[i]+" és tömb["+j+"]="+tömb[j]+" elemek");
      if(i<j) {
        csere=tömb[i];
        tömb[i]=tömb[j];
        tömb[j]=csere;
        csereDb++;
        System.out.println(" elemeket fel kell cserélni.");
        tömbLista("  A tömb elemei a cserét követően ("+alsóHatár+". és "+
          felsőHatár+". index között):\n  ", alsóHatár, felsőHatár);
        System.out.println();
      }
      else
        System.out.println(" sorrendje megfelelő.\n");
      if(i<=j) {
        i++;
        j--;
      }
    }
    if(alsóHatár<j)
      tömbRendez(alsóHatár, j);
    if(i<felsőHatár)
      tömbRendez(i, felsőHatár);
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista("A tömb elemei a rendezés előtt:\n", 1, N);
    System.out.println("\n\n***** Rendezés kezdete ***********************************\n"+
      "Az aktuálisan rendezendő résztömbbe bele nem tartozó tömbelemeket '__' jelöli.\n");
    tömbRendez(1, N);
    System.out.println("\nÖsszehasonlítások száma: "+hasonlításDb+"\n"+
      "Cserék száma: "+csereDb);
    System.out.println("\n\n***** Rendezés vége **************************************\n\n");
    tömbLista("A tömb elemei a rendezés után:\n", 1, N);
  }
}