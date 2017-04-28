public class Téglalap1 {
  public static void main(String[] args) {
    System.out.println("Téglalap kerülete, területe");
    double a=extra.Console.readDouble("A téglalap egyik oldala: ");
    double b=extra.Console.readDouble("A téglalap másik oldala: ");
    if(a>0 && b>0)
      System.out.println("A téglalap kerülete: "+
                         extra.Format.left(2*(a+b), 0, 2)+
                         ", területe: "+
                         extra.Format.left(a*b, 0, 2)+".");
    else
      System.out.println("Hiba: a téglalap oldalai nem pozitívak!");
  }
}