public class BmiIndex5 {

  static int beolvas(String üzenet,
      int alsóHatár, int felsőHatár) {
    boolean ok;
    int x;
    do {
      x=extra.Console.readInt(üzenet+": ");
      ok=x>=alsóHatár && x<=felsőHatár;
      if(x<alsóHatár)
        System.out.println("Túl kicsi szám. Újra!");
      if(x>felsőHatár)
        System.out.println("Túl nagy szám. Újra!");
    } while(!ok);
    return x;
  }

  static double bmi(int tömeg, int magasság) {
    return tömeg/(Math.pow(magasság/100.0, 2));
  }

  static void értékelés(int magasság) {
    final int[] BMIHATÁR={20, 25, 30, 40};
    final String[] BMISZÖVEG={"sovány", "normál",
      "túlsúlyos", "elhízott", "kórosan elhízott"};
    System.out.println("Aki "+magasság+" cm magas:");
    int tömeg=15; //fiktív alsó határ a min. 100 cm miatt
    double bmi=bmi(tömeg, magasság);
    int i=0;
    while(bmi<40) {
      bmi=bmi(tömeg, magasság);
      tömeg++;
      if((int)bmi==BMIHATÁR[i]) {
        System.out.println("  "+tömeg+" kg alatt "+
          BMISZÖVEG[i]+", egyébként");
        i++;
      }
    }
    System.out.println("  kórosan elhízott.");
  }

  public static void main(String[] args) {
    System.out.println("BMI index határok");
    int magasság=
      beolvas("Testmagasság (cm) [100; 200]", 100, 200);
    értékelés(magasság);
  }
}