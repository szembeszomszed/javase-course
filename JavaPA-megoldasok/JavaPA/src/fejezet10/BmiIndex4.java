public class BmiIndex4 {

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

  static String értékelés(double bmi) {
    String s="Ön ";
    if(bmi<20)
      s=s+"sovány";
    else if(bmi<25) //bmi>=20
      s=s+"normál";
    else if(bmi<30) //bmi>=25
      s=s+"túlsúlyos";
    else if(bmi<40) //bmi>=30
      s=s+"elhízott";
    else //bmi>=40
      s=s+"kórosan elhízott";
    s=s+" testalkatú.";
    return s;
  }

  public static void main(String[] args) {
    System.out.println("BMI index kiszámítása");
    int testMagasság=
      beolvas("Testmagasság (cm) [100; 200]", 100, 200);
    int testTömeg=
      beolvas("Testtömeg (kg) [40; 150]", 40, 150);
    double bmi=bmi(testTömeg, testMagasság);
    System.out.print("Ön "+testMagasság+" cm magas, és "+
      testTömeg+" kg tömegű, így BMI indexe "+extra.
      Format.left(bmi, 0, 1)+", tehát ");
    System.out.println(értékelés(bmi));
  }
}