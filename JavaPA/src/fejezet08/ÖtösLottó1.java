public class ÖtösLottó1 {
  public static void main(String[] args) {
    boolean[] logikaiTömb=new boolean[91];              //1
    for(int i=1; i<=90; i++)                            //2
      logikaiTömb[i]=false;                             //3

    int jóSzámDb=1, tipp;                               //4
    while(jóSzámDb<=5) {                                //5
      tipp=(int)(Math.random()*90+1);                   //6
      if(!logikaiTömb[tipp]) {                          //7
        logikaiTömb[tipp]=true;                         //8
        jóSzámDb++;                                     //9
      }
    }

    System.out.print("Ötöslottón megjátszható számok: ");
    for(int i=1; i<=90; i++)                           //10
      if(logikaiTömb[i])                               //11
        System.out.print(i+" ");                       //12
  }
}