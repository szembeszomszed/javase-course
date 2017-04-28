public class MelyikbőlVanTöbb {
  public static void main(String[] args) {
    System.out.println("300 db szám között pozitív vagy negatív számból van több?");

    int[] tömb=new int[300]; //tömb
    for(int i=0; i<300; i++)
      tömb[i]=(int)(Math.random()*101-50);

    int pozitívDb=0, negatívDb=0;
    for(int i=0; i<300; i++) {
      if(tömb[i]>0)
        pozitívDb++;
      if(tömb[i]<0)
        negatívDb++;
    }
    if(pozitívDb>negatívDb)
      System.out.println("Pozitív szám több van, mint negatív.");
    else if(pozitívDb==negatívDb)
      System.out.println("Ugyanannyi pozitív szám van, mint negatív.");
    else
      System.out.println("Negatív szám több van, mint pozitív.");
  }
}