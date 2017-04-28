public class SzinuszÉrtéktáblázat {
  public static void main(String[] args) {
    System.out.println(" x     sin(x)");
    double sinX;
    for(int x=0; x<=180; x+=5) {
      System.out.print(extra.Format.right(x, 3, 0)+"   ");
      sinX=Math.sin(x);
      if(sinX>=0) //hiányzó előjel miatti igazítás
        System.out.print(" ");
      System.out.println(extra.Format.right(sinX, 0, 4));
    }
  }
}