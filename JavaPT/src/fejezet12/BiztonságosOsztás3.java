
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BiztonságosOsztás3 {

  static int hányados(int osztandó, int osztó)
//          throws IOException {
      throws ArithmeticException {                      //1
    return osztandó/osztó;
  }
 
  public static void main(String[] args) {
//    try {
//      // mainből nem szabad kivételt továbbdobni, mert nincs, aki elkapja (tesztelés alatt, túléléshez mehet csak)
//      // ez is működne, csak nem mindig ilyen egyszerű a helyzet, ha más, durvább kivétel dobása történhet, pl IOException
//      // ilyenkor már szintaktikai hiba is van
//      // egy try catch blokk pl megoldja - ezt a netbeans hozzáteszi aranyosan
//      System.out.println(hányados(4, 2));
//    } catch (IOException ex) {
//      Logger.getLogger(BiztonságosOsztás3.class.getName()).log(Level.SEVERE, null, ex);
//    }
    int a, b;
    try {
      a=extra.Console.readInt("Osztandó: ");
      b=extra.Console.readInt("Osztó: ");
      System.out.println(a+"/"+b+": "+hányados(a, b));  //3
    }
    catch(ArithmeticException e) {
      e.printStackTrace();
    }
  }
}