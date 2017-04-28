public class ÖtösHatosHetesLottó {

  static int[] lottó(int max, int db) {
    boolean[] logikaiTömb=new boolean[max+1];
    for(int i=1; i<=max; i++)
      logikaiTömb[i]=false;
    int jóSzámDb=1, tipp;
    while(jóSzámDb<=db) {
      tipp=(int)(Math.random()*max+1);
      if(!logikaiTömb[tipp]) {
        logikaiTömb[tipp]=true;
        jóSzámDb++;
      }
    }
    int[] segédTömb=new int[db];
    int j=0;
    for(int i=1; i<=max; i++)
      if(logikaiTömb[i])
        segédTömb[j++]=i;
    return segédTömb;
  }

  static void lottókiír(int[] szelvény, String üzenet) {
    System.out.print(üzenet);
    for(int i=0; i<szelvény.length; i++)
      System.out.print(szelvény[i]+" ");
    System.out.println();
  }

  public static void main(String[] args) {
    lottókiír(lottó(90, 5), "Ötöslottó: ");
    lottókiír(lottó(45, 6), "Hatoslottó: ");
    lottókiír(lottó(35, 7), "Heteslottó: ");
  }
}