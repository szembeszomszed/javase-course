/**
 * hatvány alapjának és kitevőjének bekérése, majd számolás egész számokkal
 * @author mate
 */
public class Feladat461_Hatvany1 {
  public static void main(String[] args) {
    System.out.println("Hatványozás következik.");
    int base, power, result;
    base = extra.Console.readInt("Adja meg az alapot: ");
    power = extra.Console.readInt("Most adja meg a kitevőt: ");
    result = (int) Math.pow(base, power);
    System.out.println("Az eredmény: " + result);
   
  }
}
