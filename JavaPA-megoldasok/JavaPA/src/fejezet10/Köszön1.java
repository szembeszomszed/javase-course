public class Köszön1 {
  public static void main(String[] args) {
    String vezetékNév="", keresztNév="";                //1
    vezetékNév=extra.Console.readLine("Vezetékneve: "); //2
    keresztNév=extra.Console.readLine("Keresztneve: ");
    String név=null;                                    //3
    név=vezetékNév+" "+keresztNév;                      //4
    System.out.println("Üdvözlöm "+név+"!");            //5
  }
}