public class LnkoLkkt2 {

  static int lnko(int a, int b) {
    int m=a%b;
    while(m!=0) {
      a=b;
      b=m;
      m=a%b;
    }
    return b;
  }
  
  public static void main(String[] args) {
    System.out.println("Két pozitív szám legnagyobb közös osztója és legkisebb közös többszöröse");
    int a=extra.Console.readInt("Egyik szám: ");
    int b=extra.Console.readInt("Másik szám: ");
    if(a>0 && b>0) {
      int szorzat=a*b,
        lnko=lnko(a, b),
        lkkt=szorzat/lnko;
      System.out.println("LNKO ("+a+"; "+b+") = "+lnko+"\n"+
        "LKKT ["+a+"; "+b+"] = "+lkkt); 
    }
    else
      System.out.println("Mindkét számnak pozitívnak kell lennie!");
  }
}