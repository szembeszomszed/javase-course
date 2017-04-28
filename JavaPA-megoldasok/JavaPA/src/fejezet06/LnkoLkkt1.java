public class LnkoLkkt1 {
  public static void main(String[] args) {
    System.out.println("Két pozitív szám legnagyobb közös"+
      " osztója és legkisebb közös többszöröse");
    int aa=extra.Console.readInt("Egyik szám: ");
    int bb=extra.Console.readInt("Másik szám: ");
    int a=aa, b=bb;                                     //1
    if(a>0 && b>0) {
      int szorzat=a*b;
      // Euklidesz algoritmusa
      int m=a%b;                                        //2
      while(m!=0) {                                     //3
        a=b;                                            //4
        b=m;                                            //5
        m=a%b;                                          //6
      }
      int lnko=b, lkkt=szorzat/lnko;                    //7
      System.out.println("LNKO ("+aa+"; "+bb+") = "+lnko+
        "\n"+"LKKT ["+aa+"; "+bb+"] = "+lkkt);
    }
    else
      System.out.println("Mindkét számnak "+
        "pozitívnak kell lennie!");
  }
}