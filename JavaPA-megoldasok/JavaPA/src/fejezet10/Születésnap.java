public class Születésnap {

  static boolean szökőév(int év) {
    return (év>=1582) && ((év%4==0 && év%100!=0) || (év%400==0));
  }

  static int évszázadKód(int év) {
    int évszázad=év/100;
    return 2*(3-évszázad%4);
  }

  static int hónapKód(int év, int hónap) {
    int hó=0;
    switch(hónap) {
      case 1: hó=szökőév(év)?6:0; break;
      case 2: hó=szökőév(év)?2:3; break;
      case 3: hó=3; break;
      case 4: hó=6; break;
      case 5: hó=1; break;
      case 6: hó=4; break;
      case 7: hó=6; break;
      case 8: hó=2; break;
      case 9: hó=5; break;
      case 10: hó=0; break;
      case 11: hó=3; break;
      case 12: hó=5;
    }
    return hó;
  }

  static String napNév(int nap) {
    String hétNapja="";
    switch(nap) {
      case 0: hétNapja="vasárnap"; break;
      case 1: hétNapja="hétfő"; break;
      case 2: hétNapja="kedd"; break;
      case 3: hétNapja="szerda"; break;
      case 4: hétNapja="csütörtök"; break;
      case 5: hétNapja="péntek"; break;
      case 6: hétNapja="szombat"; break;
    }
    return hétNapja;
  }

  static String hétNapja(int év, int hónap, int nap) {
    int évszázadKód=évszázadKód(év),
      évszázadonBelüliÉv=év%100,
      évszázadonBelüliÉvPerNégy=évszázadonBelüliÉv/4,
      hónapKód=hónapKód(év, hónap),
      napKód=(évszázadKód+évszázadonBelüliÉv+
        évszázadonBelüliÉvPerNégy+hónapKód+nap)%7;
    return napNév(napKód);
  }

  public static void main(String[] args) {
    System.out.println("Milyen napra esik a születésnapja?");
    int év=extra.Console.readInt("Év: ");
    int hónap=extra.Console.readInt("Hónap: ");
    int nap=extra.Console.readInt("Nap: "); // ellenőrzés nincs
    System.out.println(+év+"."+hónap+"."+nap+": "+
      hétNapja(év, hónap, nap));
  }
}

/*
forrás: http://en.wikipedia.org/wiki/Calculating_the_day_of_the_week (2009.09.20.)

évszázadKód() függvényhez
  1700–1799     4     (Still Julian Calendar in Great Britain and its colonies until 1752)
  1800–1899     2
  1900–1999     0
  2000–2099     6
  2100–2199     4
  2200–2299     2
  2300–2399     0
  2400–2499     6
  2500–2599     4
  2600–2699     2

hónapKód() függvényhez
  January      0 (in leap year 6)
  February     3 (in leap year 2)
  March        3
  April        6
  May          1
  June         4
  July         6
  August       2
  September    5
  October      0
  November     3
  December     5

napNév() függvényhez
  Sunday    0
  Monday    1
  Tuesday   2
  Wednesday 3
  Thursday  4
  Friday    5
  Saturday  6
*/