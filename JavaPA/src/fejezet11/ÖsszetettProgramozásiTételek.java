public class ÖsszetettProgramozásiTételek {

  static final int N=20, M=15;                          //1

  static int[] halmazFeltölt(int elemszám) {            //2
    boolean[] logikaiTömb=new boolean[100];
    for(int i=10; i<=99; i++)
      logikaiTömb[i]=false;
    int jóSzámDb=1, tipp;
    while(jóSzámDb<=elemszám) {
      tipp=(int)(Math.random()*90+10); //kétjegyű szám
      if(!logikaiTömb[tipp]) {
        logikaiTömb[tipp]=true;
        jóSzámDb++;
      }
    }
    int[] segédHalmaz=new int[elemszám+1];
    int j=1;
    for(int i=10; i<=99; i++)
      if(logikaiTömb[i])
        segédHalmaz[j++]=i;
    return segédHalmaz;                                 //3
  }

  static void halmazKiír(int[] tömb, String üzenet) {   //4
    System.out.println("\n"+üzenet);
    if(tömb.length==0)
      System.out.println("Üres halmaz.");
    else {
      for(int i=1; i<=tömb.length-2; i++)
        System.out.print(tömb[i]+", ");
      System.out.println(tömb[tömb.length-1]);
    }
  }

  static int[] halmazRendez(int[] halmaz) {             //5
    int csere;
    for(int i=1; i<=halmaz.length-2; i++)
      for(int j=i+1; j<=halmaz.length-1; j++)
        if(halmaz[i]>halmaz[j]) {
          csere=halmaz[i];
          halmaz[i]=halmaz[j];
          halmaz[j]=csere;
        }
    return halmaz;
  }

  static int[] metszet(int[] halmaz1, int[] halmaz2) {  //6
    int[] segédHalmaz1=new int[Math.min(N, M)+1];       //7
    int db=0, j;
    for(int i=1; i<=N; i++) { //kiválogatás
      j=1;
      while(j<=M && !(halmaz1[i]==halmaz2[j])) //eldöntés
        j++;
      if(j<=M)
        segédHalmaz1[++db]=halmaz1[i];
    }
    int[] segédHalmaz2=new int[db+1];                   //8
    for(int i=1; i<=db; i++) //másolás
      segédHalmaz2[i]=segédHalmaz1[i];                  //9
    return segédHalmaz2;                               //10
  }

  static int[] unió(int[] halmaz1, int[] halmaz2) {    //11
    int[] segédHalmaz1=new int[N+M+1];                 //12
    int i, j, db=N;
    for(i=1; i<=N; i++)
      segédHalmaz1[i]=halmaz1[i]; //másolás
    for(j=1; j<=M; j++) {
      i=1;
      while(i<=N && !(halmaz1[i]==halmaz2[j]))
        i++;
      if(i>N)
        segédHalmaz1[++db]=halmaz2[j];
    }
    int[] segédHalmaz2=new int[db+1];                  //13
    for(i=1; i<=db; i++) //másolás
      segédHalmaz2[i]=segédHalmaz1[i];
    return halmazRendez(segédHalmaz2);                 //14
  }

  static int[] összefuttatás(
      int[] halmaz1, int[] halmaz2) {                  //15
    int[] segédTömb1=new int[N+M+1];                   //16
    int i=1, j=1, db=0;
    while(i<=N & j<=M) {                               //17
      db++;
      if(halmaz1[i]<halmaz2[j])                        //18
        segédTömb1[db]=halmaz1[i++];
      else if(halmaz1[i]==halmaz2[j]) {                //19
        segédTömb1[db]=halmaz1[i];
        segédTömb1[++db]=halmaz1[i];
        i++;
        j++;
      }
      else if(halmaz1[i]>halmaz2[j])                   //20
        segédTömb1[db]=halmaz2[j++];
    }
    while(i<=N)                                        //21
      segédTömb1[++db]=halmaz1[i++];
    while(j<=M)                                        //22
      segédTömb1[++db]=halmaz2[j++];
    int[] segédTömb2=new int[db+1];                    //23
    for(i=1; i<=db; i++) //másolás
      segédTömb2[i]=segédTömb1[i];
    return segédTömb2;                                 //24
  }

  public static void main(String[] args) {
    int[] halmaz1=halmazFeltölt(N);                    //25
    int[] halmaz2=halmazFeltölt(M);                    //26
    halmazKiír(halmaz1, "1. halmaz:");
    halmazKiír(halmaz2, "2. halmaz:");
    int[] metszetHalmaz=metszet(halmaz1, halmaz2);     //27
    halmazKiír(metszetHalmaz, "Metszethalmaz:");
    int[] unióHalmaz=unió(halmaz1, halmaz2);           //28
    halmazKiír(unióHalmaz, "Unióhalmaz:");
    int[] összefuttatottSorozat=
      összefuttatás(halmaz1, halmaz2);                 //29
    halmazKiír(összefuttatottSorozat,
      "Összefuttatott sorozat:");
  }
}