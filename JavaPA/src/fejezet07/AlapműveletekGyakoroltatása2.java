public class AlapműveletekGyakoroltatása2 {
  static int feladatDb=0, helyesVálaszDb=0;

  static void alapMűvelet(
      char műveletiJel, String eredmény) {              //1
    feladatDb++;
    boolean jóSzámok=false;
    int a, b;
    do {                                                //2
      a=(int)(Math.random()*100);              
      b=(int)(Math.random()*99)+1;
      switch(műveletiJel) {
        case '+': jóSzámok=a+b<=100; break;
        case '-': jóSzámok=a-b>=0; break;
        case '*': jóSzámok=a*b<=100; break;
        case ':': jóSzámok=a>b && a/b!=0 && 1.0*a/b==
                           Math.round(1.0*a/b);
      }
    } while(!jóSzámok);
    int c=extra.Console.readInt(
            "  "+a+" "+műveletiJel+" "+b+" = ");
    boolean helyesEredmény=false;
    switch(műveletiJel) {                               //3
      case '+': helyesEredmény=c==a+b; break;
      case '-': helyesEredmény=c==a-b; break;
      case '*': helyesEredmény=c==a*b; break;
      case ':': helyesEredmény=c==a/b;
    }
    System.out.println("  "+
      (helyesEredmény?"Helyes":"Hibás")+" "+eredmény+"!");
    if(helyesEredmény)
      helyesVálaszDb++;
  }

  public static void main(String[] args) {
    System.out.println("Alapműveletek gyakoroltatása");
    //100-as számkörben
    char válasz;
    do {
      System.out.println("\nMenü\n  1 - Összeadás\n"+
        "  2 - Kivonás\n  3 - Szorzás\n  4 - Osztás\n"+
        "  0 - Kilép");
      do
        válasz=extra.Console.readChar();
      while(válasz<'0' || válasz>'4');
      switch(válasz) {                                  //4
        case '1': alapMűvelet('+', "összeg"); break;
        case '2': alapMűvelet('-', "különbség"); break;
        case '3': alapMűvelet('*', "szorzat"); break;
        case '4': alapMűvelet(':', "hányados"); break;
      }
    } while(válasz!='0');
    System.out.println("\n"+feladatDb+" db feladatból "+
      helyesVálaszDb+" helyes volt ("+
      extra.Format.left((double)helyesVálaszDb/
        feladatDb*100, 0, 0)+"%).");
  }
}