public class Operátorok {
  public static void main(String[] args) {
    final int X=7, Y=3;                                 //1
    System.out.println("Összeg (7+3): "+(X+Y)+          //2
      "\nKülönbség (7-3): "+(X-Y)+                      //3
      "\nSzorzat (7*3): "+X*Y+                          //4
      "\nEgész osztás (7/3): "+X/Y+                     //5
      "\nValós osztás (7/3): "+(double)X/Y+             //6
      "\nValós osztás (7/3): "+(1.0*X/Y)+               //7
      "\nMaradékképzés (7%3): "+X%Y+                    //8
      "\n"+X+" ellentettje: "+-X+                       //9
      "\n"+Y+" ellentettje: "+-1*Y);                   //10
  }
}