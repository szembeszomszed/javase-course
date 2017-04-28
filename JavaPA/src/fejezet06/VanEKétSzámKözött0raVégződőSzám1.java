public class VanEKétSzámKözött0raVégződőSzám1 {
  public static void main(String[] args) {
    System.out.println("Van-e két szám között 0-ra "+
      "végződő szám?");
    int alsóHatár=42, felsőHatár=67;                    //1
    int i=alsóHatár;                                    //2
    while(i<=felsőHatár && !(i%10==0))                  //3
      i++;                                              //4
    boolean van=i<=felsőHatár;                          //5
    System.out.print(alsóHatár+" és "+felsőHatár+
      " között ");
    if(van)                                             //6
      System.out.println("van 0-ra végződő szám: "+i);  //7
    else
      System.out.println("nincs 0-ra végződő szám.");
  }
}