public class Hatvány1 {
  public static void main(String[] args) {
    System.out.println("Hatványozás");
    int hatványAlap=extra.Console.readInt("Hatványalap: ");
    int hatványKitevő=extra.Console.readInt("Hatványkitevő: ");
    
    // 1. módszer
    double hatvány1 = Math.pow(hatványAlap, hatványKitevő);
    System.out.println("Hatvány: "+(long)hatvány1);

    // 2. módszer
    double hatvány2 = Math.exp(Math.log(hatványAlap)*hatványKitevő);
    System.out.println("Hatvány: "+(long)hatvány2);
  }
}