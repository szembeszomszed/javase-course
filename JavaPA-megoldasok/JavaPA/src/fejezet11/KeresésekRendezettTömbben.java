public class KeresésekRendezettTömbben {

  static final int N=20;
  static int[] tömb=new int[N+1];

  static void tömbFeltölt() {
    for(int i=1; i<=N; i++)
      tömb[i]=(int)(Math.random()*90+10);   //kétjegyű szám
  }

  static void tömbRendez() {     //egyszerű cserés rendezés
    int csere;
    for(int i=1; i<=N-1; i++)
      for(int j=i+1; j<=N; j++)
        if(tömb[i]>tömb[j]) {
          csere=tömb[i];
          tömb[i]=tömb[j];
          tömb[j]=csere;
        }
  }

  static void tömbLista() {
    System.out.println("A tömb elemei:");
    for(int i=1; i<N; i++)
      System.out.print(tömb[i]+", ");
    System.out.println(tömb[N]);
  }

  static void lineárisKeresés() {
    System.out.println("\nLineáris keresés");
    int i=1, keresendő=24;
    System.out.print("Van-e a tömbben "+keresendő+"? ");
    while(i<=N && tömb[i]<keresendő)                    //1
      i++;
    boolean van=(i<=N & tömb[i]==keresendő);            //2
    System.out.println(
      (van?"Van, az első sorszáma: "+i+".":"Nincs."));
  }

  static void logaritmikusKeresés() {
    System.out.println("\nLogaritmikus keresés");
    int első=1, utolsó=N, keresendő=24, i;              //3
    System.out.print("Van-e a tömbben "+keresendő+"? ");
    do {                                                //4
      i=(első+utolsó)/2; // egész osztás                //5
      if(keresendő<tömb[i])                             //6
        utolsó=i-1;
      if(keresendő>tömb[i])                             //7
        első=i+1;
    } while(első<=utolsó && tömb[i]!=keresendő);
    boolean van=(első<=utolsó);                         //8
    System.out.println(
      (van?"Van, a(z egyik) sorszáma: "+i+".":"Nincs."));
  }

  public static void main(String[] args) {
    tömbFeltölt();
    tömbRendez();
    tömbLista();
    lineárisKeresés();
    logaritmikusKeresés();
  }
}