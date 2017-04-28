public class LnkoLkkt1Demo {
  public static void main(String[] args) {
    System.out.println("Két pozitív szám legnagyobb közös osztója és legkisebb közös többszöröse");
    int aa=extra.Console.readInt("Egyik szám: ");
    int bb=extra.Console.readInt("Másik szám: ");
    int a=aa, b=bb;
    if(a>0 && b>0) {
      int szorzat=a*b;
      System.out.println("Euklidesz algoritmusa\n"+
        "  Osztandó     Osztó  Hányados   Maradék");
      int m=a%b;
      while(m!=0) {
        System.out.println(extra.Format.right(a, 10)+
          extra.Format.right(b, 10)+
          extra.Format.right(a/b, 10)+
          extra.Format.right(m, 10));
        a=b;
        b=m;
        m=a%b;
      }
      System.out.println(extra.Format.right(a, 10)+
        extra.Format.right(b, 10)+
        extra.Format.right(a/b, 10)+
        extra.Format.right(m, 10)+"\n"+
        "LNKO az utolsó nem nulla maradék.");
      int lnko=b, lkkt=szorzat/lnko;
      System.out.println("LNKO ("+aa+"; "+bb+") = "+lnko+"\n"+
        "LKKT ["+aa+"; "+bb+"] = "+lkkt);
    }
    else
      System.out.println("Mindkét számnak pozitívnak kell lennie!");
  }
}