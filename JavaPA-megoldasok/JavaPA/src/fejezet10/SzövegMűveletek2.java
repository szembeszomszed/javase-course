public class SzövegMűveletek2 {
  public static void main(String[] args) {
    StringBuffer szöveg = 
      new StringBuffer("Ez a szöveg.");                 //1
    System.out.println("szöveg: "+szöveg);
    szöveg.insert(5, "hosszú ");                        //2
    System.out.println("szöveg: "+szöveg);
    szöveg.deleteCharAt(10);                            //3
    System.out.println("szöveg: "+szöveg);
    szöveg.insert(10, "abb");                           //4
    System.out.println("szöveg: "+szöveg);
    szöveg.reverse();                                   //5
    System.out.println("szöveg: "+szöveg);
    szöveg.reverse();
    System.out.println("szöveg: "+szöveg);
    System.out.println("szöveg hossza: "+
      szöveg.length());                                 //6
  }
}