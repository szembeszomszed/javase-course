public class Legkisebb3Közül {
  public static void main(String[] args) {
    System.out.println("Három szám közül melyik a legkisebb?");
    double a=extra.Console.readDouble("1. szám: "),
      b=extra.Console.readDouble("2. szám: "),
      c=extra.Console.readDouble("3. szám: ");
    System.out.print("A három szám közül ");
    if(a<b) {
      if(a<c) //a<b és a<c
        System.out.println("a legkisebb: "+a);
      else //a<b és a>=c
        System.out.println("a legkisebb: "+c);
    }
    else { //a>=b
      if(c<b) //a>=b és c<b
        System.out.println("a legkisebb: "+c);
      else //a>=b és c>=b
        System.out.println("a legkisebb: "+b);
    }
  }
}