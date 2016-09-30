/**
 * fej vagy írás 500-szor
 * @author mate
 */
public class Feladat653_FejVagyIras2 {
  public static void main(String[] args) {
    int head = 0, tail = 0, result;
    for (int i = 1; i <= 500; i++ ) {
      result = (int) (Math.random() * 2 + 1);
      if (result == 1) 
        head++;
       else 
        tail++;      
    }
    System.out.println("Fej: " + head + 
            "\nÍrás: " + tail);    
  }
}
