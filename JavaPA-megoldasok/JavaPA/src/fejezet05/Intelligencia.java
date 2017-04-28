public class Intelligencia {
  public static void main(String[] args) {
    System.out.println("Intelligencia hányados");
    int iq = extra.Console.readInt("IQ: ");
    if(iq<90)
      System.out.println("Alacsony intelligencia");
    else if(iq<110)
      System.out.println("Normál, átlagos intelligencia");
    else
      System.out.println("Magas intelligencia");
  }
}