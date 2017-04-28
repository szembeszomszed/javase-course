public class SzámjegyekÖsszege {

  static int számjegyekÖsszege(int szám) {
    szám=Math.abs(szám);
    int összeg=0, maradék;
    while(szám!=0) {
      maradék=szám%10;
      szám/=10;
      összeg+=maradék;
    }
    return összeg;
  }

  public static void main(String[] args) {
    int szám=-51927;
    System.out.println(szám+" számjegyeinek összege: "+
      számjegyekÖsszege(szám));
  }
}