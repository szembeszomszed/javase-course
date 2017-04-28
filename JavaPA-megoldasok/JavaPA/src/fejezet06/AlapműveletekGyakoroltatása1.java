public class AlapműveletekGyakoroltatása1 {
  public static void main(String[] args) {
    System.out.println("Alapműveletek gyakoroltatása");
    //100-as számkörben
    char válasz;                                        //1
    int a, b, c, feladatDb=0, helyesVálaszDb=0;         //2
    do {                                                //3
      System.out.println("\nMenü\n  1 - Összeadás\n"+
        "  2 - Kivonás\n  3 - Szorzás\n  4 - Osztás\n"+
        "  0 - Kilép");                                 //4
      do                                                //5
        válasz=extra.Console.readChar();
      while(válasz<'0' || válasz>'4');
      if(válasz!='0')
        feladatDb++;                                    //6
      switch(válasz) {                                  //7
        case '1': { //Összeadás                         //8
          do {                                          //9
            a=(int)(Math.random()*100);
            b=(int)(Math.random()*99)+1;
          } while(a+b>100);  //az összeg maximum 100 legyen
          c=extra.Console.readInt("  "+a+" + "+b+" = ");
          if(c==a+b) {                                 //10
            System.out.println("  Az összeg helyes!");
            helyesVálaszDb++;
          }
          else
            System.out.println("  Az összeg hibás!");
          break;                                       //11
        }
        case '2': { //Kivonás
          do {
            a=(int)(Math.random()*100);
            b=(int)(Math.random()*99)+1;
          } while(a-b<0);    //a különség ne legyen negatív
          c=extra.Console.readInt("  "+a+" - "+b+" = ");
          if(c==a-b) {
            System.out.println("  A különbség helyes!");
            helyesVálaszDb++;
          }
          else
            System.out.println("  A különbség hibás!");
          break;
        }
        case '3': { //Szorzás
          do {
            a=(int)(Math.random()*100);
            b=(int)(Math.random()*99)+1;
          } while(a*b>100);  //a szorzat maximum 100 legyen
          c=extra.Console.readInt("  "+a+" * "+b+" = ");
          if(c==a*b) {
            System.out.println("  A szorzat helyes!");
            helyesVálaszDb++;
          }
          else
            System.out.println("  A szorzat hibás!");
          break;
        }
        case '4': { //Osztás
          do {
            a=(int)(Math.random()*100);
            b=(int)(Math.random()*99)+1;
          } while(a<b || a/b==0 ||
              1.0*a/b!=Math.round(1.0*a/b));           //12
                   //az osztó!=0 és a hányados egész legyen
          c=extra.Console.readInt("  "+a+" : "+b+" = ");
          if(c==a/b) {
            System.out.println("  A hányados helyes!");
            helyesVálaszDb++;
          }
          else
            System.out.println("  A hányados hibás!");
          break;
        }
      } //switch
    } while(válasz!='0');                              //13
    System.out.println("\n"+feladatDb+" db feladatból "+
      helyesVálaszDb+" helyes volt ("+
      extra.Format.left((double)helyesVálaszDb/
        feladatDb*100, 0, 0)+"%).");                   //14
  }
}