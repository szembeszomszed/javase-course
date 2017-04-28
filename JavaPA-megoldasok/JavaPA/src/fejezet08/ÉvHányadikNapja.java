public class ÉvHányadikNapja {

  static boolean szökőév(int év) {
    return (év>=1582) && ((év%4==0 && év%100!=0) || (év%400==0));
  }

  static int évHányadikNapja(int év, int hónap, int nap) {
    int[] hónapNapDb={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if(szökőév(év))
      hónapNapDb[2]=29;
    int napDb=0;
    for(int i=1; i<hónap; i++)
      napDb+=hónapNapDb[i];
    napDb+=nap;
    return napDb;
  }

  public static void main(String[] args) {
    int év=1996, hónap=2, nap=15;
    System.out.println("Dátum: "+év+"."+hónap+"."+nap+"\n"+
      "Az év hányadik napja? "+évHányadikNapja(év, hónap, nap));
  }
}