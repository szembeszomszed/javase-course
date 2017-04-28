public class ÉvszámIntervallum {

  static final int MAX_N=50;
  static int[] évszám=new int[MAX_N];
  static int évszámDb=0;
  // legfeljebb ennyi évszámot olvasunk be, ellenőrzött
  // Legyen elegendő elem!

  static void évszámBeolvas() {
    final int VÉGJEL=0;
    int év;
    do {
      év=extra.Console.readInt((évszámDb+1)+". évszám: ");
      if(év!=VÉGJEL)
        évszám[évszámDb++]=év;
    } while(év!=VÉGJEL && évszámDb<MAX_N);
  }

  static void évszámRendez() {
    int csere;
    for(int i=évszámDb; i>=0; i--) {
      for(int j=0; j<i-1; j++)
        if(évszám[j]>évszám[j+1]) {
          csere=évszám[j];
          évszám[j]=évszám[j+1];
          évszám[j+1]=csere;
        }
    }
  }

  static void évszámLista() {
    int min, max;
    System.out.println("A legkisebb évszám: "+(min=évszám[0]));
    System.out.println("A legnagyobb évszám: "+(max=évszám[évszámDb-1]));
    int hossz=(max-min)/4; // intervallum hosszúsága
    int[] határTömb={min, min+hossz, min+2*hossz, min+3*hossz, max+1};
    int évszámIndex=0;
    for(int határ=1; határ<=4; határ++) {
      System.out.println(határTömb[határ-1]+" és "+(határTömb[határ]-1)+" közé eső évszámok:");
      while(évszámIndex<évszámDb &&
          évszám[évszámIndex]<határTömb[határ])
        System.out.print(évszám[évszámIndex++]+", ");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("Évszámok csoportosítása");
    évszámBeolvas();
    évszámRendez();
    évszámLista();
  }
}