public class Négyzetgyök {
  public static void main(String[] args) {
    System.out.println("Négyzetgyök kiszámítása");
    double szám=extra.Console.readDouble("Szám: ");
    if(szám>=0)
      System.out.println(szám+" négyzetgyöke: "+Math.sqrt(szám));
    else
      System.out.println("Negatív számnak nincs négyzetgyöke!");
  }
}