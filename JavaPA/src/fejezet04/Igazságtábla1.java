public class Igazságtábla1 {
  public static void main(String[] args) {
    System.out.println("Az és művelet igazságtáblája"+
      "\na       b       a és b"+
      "\nfalse   false   "+(false&false)+
      "\nfalse   true    "+(false&true)+
      "\ntrue    false   "+(true&false)+
      "\ntrue    true    "+(true&true));
  }
}