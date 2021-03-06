public class PitagorasziSzámhármasokDemo {
  public static void main(String[] args) {
    System.out.println("Pitagoraszi számhármasok 1-től 50-ig: ");
    for(int x=1; x<=50; x++)
      for(int y=1; y<=50; y++)
        for(int z=1; z<=50; z++) {
          System.out.print(x+"^2 + "+y+"^2 = "+z+"^2? ");
          if(x*x+Math.pow(y, 2)==z*z)
            System.out.println("Igen.");
          else
            System.out.println("Nem.");
        }
    // A program a csak sorrendben eltérő számhármasokat külön veszi.
  }
}