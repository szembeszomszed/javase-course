public class ElemiProgramozásiTételek {

  static final int N=20;                                //1
  static int[] tömb=new int[N+1];                       //2

  static void tömbFeltölt() {
    for(int i=1; i<=N-1; i++)                           //3
      tömb[i]=(int)(Math.random()*90+10);   //kétjegyű szám
    tömb[N]=(int)(Math.random()*45)*2+11;               //4
      //a tömb utolsó eleme páratlan kétjegyű szám
  }

  static void tömbLista() {
    System.out.println("A tömb elemei: ");
    for(int i=1; i<N; i++)
      System.out.print(tömb[i]+", ");
    System.out.println(tömb[N]);
  }

  static void összegzés() {
    int összeg=0;
    for(int i=1; i<=N; i++)
      összeg+=tömb[i];
    System.out.println("A tömb elemeinek összege "+
      összeg+".");
  }

  static void eldöntés() {
    System.out.print("Van-e öttel osztható tömbelem? ");
    int i=1;
    while(i<=N && !(tömb[i]%5==0))                      //5
      i++;
    boolean van=(i<=N);
    System.out.println(van?"Van.":"Nincs.");
  }

  static void kiválasztás() {
    int i=1;
    while(i<=N && !(tömb[i]%2==1))                      //6
      i++;
    System.out.println("A tömb első páratlan eleme "+
                       tömb[i]+", sorszáma: "+i+".");
  }

  static void lineárisKeresés() {
    int i=1;
    System.out.print("Van-e a tömbben 24? ");
    while(i<=N && !(tömb[i]==24))                       //7
      i++;
    boolean van=(i<=N);
    System.out.println(
      (van?"Van, az első sorszáma: "+i+".":"Nincs."));
  }

  static void megszámolás() {
    int i=1, db=0;
    while(i<=N) {
      if(tömb[i]%2==0)
        db++;
      i++;
    }
    System.out.println("A tömb páros elemeinek száma "+
      db+".");
  }

  static void maximumKiválasztás() {
    int maxHely=1, maxÉrték=tömb[maxHely];
    for(int i=2; i<=N; i++)
      if(tömb[i]>maxÉrték) {
        maxÉrték=tömb[i];
        maxHely=i;
      }
    System.out.println("A tömb elemei közül a "+
      "legnagyobb: "+maxÉrték+
      ", az első sorszáma: "+maxHely+".");
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbLista();
    összegzés();
    eldöntés();
    kiválasztás();
    lineárisKeresés();
    megszámolás();
    maximumKiválasztás();
  }
}