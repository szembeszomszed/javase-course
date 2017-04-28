public class Igazságtábla2 {
  public static void main(String[] args) {
    System.out.println("A vagy művelet igazságtáblája"+
      "\na       b       a vagy b"+
      "\nfalse   false   "+(false|false)+
      "\nfalse   true    "+(false|true)+
      "\ntrue    false   "+(true|false)+
      "\ntrue    true    "+(true|true));
  }
}