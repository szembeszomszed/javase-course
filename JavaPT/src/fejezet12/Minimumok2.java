public class Minimumok2 {

  static int min1(int... szám) {                        //1
    if(szám.length==0)                                  //2
      throw new IllegalArgumentException("Nincs minimum.");
    int min=szám[0];                                    //3
    for(int i=0; i<szám.length; i++)                    //4
      if(szám[i]<min)                                   //5
        min=szám[i];
    return min;
  }

  static int min2(int... szám) {
    if(szám.length==0)
      throw new IllegalArgumentException("Nincs minimum.");
    int min=szám[0];
    for(int i: szám)                                    //6
      if(i<min)                                         //7
        min=i;
    return min;
  }

  public static void main(String[] args) {
    System.out.println("Két szám minimuma: "+min1(12, -5));
    System.out.println("Öt szám minimuma: "+
      min2(13, -469, 0, 27, 4));
    System.out.println("0 db szám minimuma: "+min1());
  }
}