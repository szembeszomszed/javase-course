public class BmiIndex2 {
  public static void main(String[] args) {
    System.out.println("BMI index határok");
    boolean ok;
    int testMagasság;
    do {
      testMagasság=extra.Console.readInt("Testmagasság [100-200](cm): ");
      ok=testMagasság>=100 && testMagasság<=200;
      if(testMagasság<100)
        System.out.println("Túl alacsony. Újra!");
      if(testMagasság>200)
        System.out.println("Túl magas. Újra!");
    } while(!ok);

    int testTömeg=15; //fiktív alsó határ a min. 100 cm miatt
    double bmi=testTömeg/Math.pow(testMagasság/100.0, 2);
    while(bmi<20)
      bmi=testTömeg++/Math.pow(testMagasság/100.0, 2);
    System.out.println("Aki "+testMagasság+" cm magas:\n  "+testTömeg+" kg alatt sovány, egyébként");

    while(bmi<25)
      bmi=testTömeg++/Math.pow(testMagasság/100.0, 2);
    System.out.println("  "+testTömeg+" kg alatt normál, egyébként");
    
    while(bmi<30)
      bmi=testTömeg++/Math.pow(testMagasság/100.0, 2);
    System.out.println("  "+testTömeg+" kg alatt túlsúlyos, egyébként");

    while(bmi<40)
      bmi=testTömeg++/Math.pow(testMagasság/100.0, 2);
    System.out.println("  "+testTömeg+" kg alatt elhízott, egyébként\n  kórosan elhízott.");
  }
}