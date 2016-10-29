/**
 * paraméterezhető lottószelvény-kreáló függvény, illetve a számok kiíratása
 * @author mate
 */
public class Feladat835_OtosHatosHetesLotto {
  static int [] lotto(int huzottSzamDarab, int osszesSzamDarab) {
    int [] szamTomb = new int[huzottSzamDarab];
    int szam, j;
    for (int i = 1; i <= huzottSzamDarab; i++) {
      do {        
        szam = (int) (Math.random() * osszesSzamDarab + 1);
        j = 0;
        while (j < i && !(szamTomb[j] == szam)) {
          j++;
        }
      } while (j < i);
      szamTomb[i - 1] = szam;
    }
    return szamTomb;
  }
  static void lottoKiir(int [] szelveny, String uzenet) {
    System.out.println(uzenet); 
    for (int i = 0; i < szelveny.length; i++) {
      System.out.print(szelveny[i] + " ");
    }
    System.out.println("");
  }
  public static void main(String[] args) {
    lottoKiir(lotto(5, 90), "Ötöslottó: ");
    lottoKiir(lotto(6, 45), "Hatoslottó: ");
    lottoKiir(lotto(7, 35), "Heteslottó: ");
  }
}
