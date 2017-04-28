public class Osztók2 {

  static int[] egySzámOsztói(int szám) {
    int[] segédTömb=new int[szám];
    int db=0;
    for(int i=1; i<=szám; i++)
        if(szám%i==0)
          segédTömb[db++]=i;
    int[] osztókTömbje=new int[db];
    for(int i=0; i<db; i++)
      osztókTömbje[i]=segédTömb[i];
    return osztókTömbje;
  }

  static void kétSzámKözösOsztói(int szám1, int szám2) {
    int[] szám1osztói=egySzámOsztói(szám1);
    int[] szám2osztói=egySzámOsztói(szám2);
    int szám1osztóDb=szám1osztói.length,
        szám2osztóDb=szám2osztói.length;
    int[] közösOsztókHalmaza=new int[Math.min(szám1osztóDb, szám2osztóDb)];
    int db=0, j;
    for(int i=0; i<szám1osztóDb; i++) {
      j=0;
      while(j<szám2osztóDb && !(szám1osztói[i]==szám2osztói[j]))
        j++;
      if(j<szám2osztóDb)
        közösOsztókHalmaza[db++]=szám1osztói[i];
    }
    System.out.print("Egyik szám: "+szám1+"\nMásik szám: "+szám2+
      "\nA két szám közös osztói: ");
    for(int i=0; i<db; i++)
      System.out.print(közösOsztókHalmaza[i]+", ");
  }

  public static void main(String[] args) {
    System.out.println("Két pozitív szám közös osztói");
    kétSzámKözösOsztói(250, 600);
  }
}