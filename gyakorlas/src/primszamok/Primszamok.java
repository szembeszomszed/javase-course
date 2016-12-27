
package primszamok;

public class Primszamok extends Prim {
  public static void main(String[] args) {
    System.out.println("A prímszámok 1-től 1000-ig: ");
    for (int i = 1; i < 1001; i++) {
      if (prim(i)) {          
        System.out.print(i + " ");
      }        
    }
    System.out.println("");
  }
}
