public class LnkoLkkt2Demo {

  static int lnko(int a, int b) {
    System.out.println("  Függvény eleje");
    System.out.println("  Euklidesz algoritmusa\n"+
      "    Osztandó     Osztó  Hányados   Maradék");
    int m=a%b;
    while(m!=0) {
      System.out.println(extra.Format.right(a, 12)+
        extra.Format.right(b, 10)+
        extra.Format.right(a/b, 10)+
        extra.Format.right(m, 10));
      a=b;
      b=m;
      m=a%b;
    }
    System.out.println(extra.Format.right(a, 12)+
      extra.Format.right(b, 10)+
      extra.Format.right(a/b, 10)+
      extra.Format.right(m, 10)+"\n"+
      "  LNKO az utolsó nem nulla maradék.");
    System.out.println("  Függvény vége");
    return b;
  }

  public static void main(String[] args) {
    System.out.println("Két pozitív szám legnagyobb közös osztója és legkisebb közös többszöröse");
    int a=extra.Console.readInt("Egyik szám: ");
    int b=extra.Console.readInt("Másik szám: ");
    if(a>0 && b>0) {
      System.out.println("Mindkét szám pozitív.");
      int szorzat=a*b;
      System.out.println("A két szám szorzata: "+szorzat);
      System.out.println("Függvényhívás a megfelelő paraméterekkel: "+
        "lnko("+a+", "+b+");");
      int lnko=lnko(a, b);
      System.out.println("LNKO = "+lnko);
      int lkkt=szorzat/lnko;
      System.out.println("LKKT = "+lkkt);
      System.out.println("Eredmények kiírása:");
      System.out.println("LNKO ("+a+"; "+b+") = "+lnko+"\n"+
        "LKKT ["+a+"; "+b+"] = "+lkkt);
    }
    else
      System.out.println("Mindkét számnak pozitívnak kell lennie!");
  }
}