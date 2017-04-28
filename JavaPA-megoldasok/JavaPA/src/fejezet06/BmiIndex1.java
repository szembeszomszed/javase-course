public class BmiIndex1 {
  public static void main(String[] args) {
    System.out.println("BMI index kiszámítása");
    boolean ok;
    int testMagasság;
    do {
      testMagasság=extra.Console.readInt(
        "Testmagasság [100-200](cm): ");
      ok=testMagasság>=100 && testMagasság<=200;
      if(testMagasság<100)
        System.out.println("Túl alacsony. Újra!");
      if(testMagasság>200)
        System.out.println("Túl magas. Újra!");
    } while(!ok);
    int testTömeg;
    do {
      testTömeg=extra.Console.readInt(
        "Testtömeg [40-150](kg): ");
      ok=testTömeg>=40 && testTömeg<=150;
      if(testTömeg<40)
        System.out.println("Túl sovány. Újra!");
      if(testTömeg>150)
        System.out.println("Túl kövér. Újra!");
    } while(!ok);
    double bmi=testTömeg/Math.pow(testMagasság/100.0, 2);
    System.out.print("Ön "+testMagasság+" cm magas és "+
      testTömeg+" kg tömegű, így BMI indexe "+
      extra.Format.left(bmi, 0, 1)+", tehát Ön ");
    if(bmi<20)
      System.out.print("sovány");
    else if(bmi<25) //bmi>=20
      System.out.print("normál");
    else if(bmi<30) //bmi>=25
      System.out.print("túlsúlyos");
    else if(bmi<40) //bmi>=30
      System.out.print("elhízott");
    else //bmi>=40
      System.out.print("kórosan elhízott");
    System.out.println(" testalkatú.");
  }
}