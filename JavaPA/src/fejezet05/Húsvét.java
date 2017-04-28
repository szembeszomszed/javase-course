public class Húsvét {
  public static void main(String[] args) {
    System.out.println("Mikor van húsvét vasárnap egy adott évben?");
    int y = extra.Console.readInt("Év (1900-2099): ");
    if(y>=1900 && y<=2099) {
      int a=y%19, b=y%4, c=y%7,
        d=(19*a+24)%30, e=(2*b+4*c+6*d+5)%7,
        h=22+d+e;
      if(e==6 && d==29) //1. kivétel
        h=50;
      if(e==6 && d==28 && a>10) //2. kivétel
        h=49;
      if(h<=31) //március
        System.out.println(y+" húsvét vasárnapja: március "+h+".");
      else //április
        System.out.println(y+" húsvét vasárnapja: április "+(h-31)+".");
    }
    else
      System.out.println("Az év nem esik a megfelelő intervallumba!");
  }
}