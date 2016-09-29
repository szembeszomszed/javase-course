
/**
 * változók léptetése
 * @author mate
 */
public class Feladat4610_Leptetes2 {
  public static void main(String[] args) {
    int a = 2;
    int b = 5;
    System.out.println("a értéke a művelet előtt: " + a + 
            "\nb értéke a művelet előtt: " + b + 
            "\na művelet: c = (++a) + (++b)");
    int c = (++a) + (++b);
    System.out.println("a értéke a művelet után: " + a + 
            "\nb értéke a művelet után: " + b + 
            "\nc értéke a művelet után: " + c + "\n");
    a = 2;
    b = 5;
    System.out.println("a értéke a művelet előtt: " + a + 
            "\nb értéke a művelet előtt: " + b + 
            "\na művelet: c = (a++) + (++b)");
    c = (a++) + (++b);
    System.out.println("a értéke a művelet után: " + a + 
            "\nb értéke a művelet után: " + b + 
            "\nc értéke a művelet után: " + c + "\n");
    a = 2;
    b = 5;
    System.out.println("a értéke a művelet előtt: " + a + 
            "\nb értéke a művelet előtt: " + b + 
            "\na művelet: c = (++a) + (b++)");
    c = (++a) + (b++);
    System.out.println("a értéke a művelet után: " + a + 
            "\nb értéke a művelet után: " + b + 
            "\nc értéke a művelet után: " + c + "\n");
    
    a = 2;
    b = 5;
    System.out.println("a értéke a művelet előtt: " + a + 
            "\nb értéke a művelet előtt: " + b + 
            "\na művelet: c = (a++) + (b++)");
    c = (a++) + (b++);
    System.out.println("a értéke a művelet után: " + a + 
            "\nb értéke a művelet után: " + b + 
            "\nc értéke a művelet után: " + c + "\n");
    
  }
}
