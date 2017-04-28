public class Megfeleltetés2 {
  public static void main(String[] args) { 
    
    
    Object objektum=new Double(62.5);
    
    // helyesen:
    System.out.println(objektum.toString());
    
    // ez sem működik így
    System.out.println((String)objektum);
    

  }
}