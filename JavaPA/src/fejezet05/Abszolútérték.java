public class Abszolútérték {
  public static void main(String[] args) {
    System.out.println("Abszolútérték");
    double x = extra.Console.readDouble("x: ");
    double absx=(x>=0)?x:-x;
    System.out.println("|"+(x)+"| = "+absx);
  }
}