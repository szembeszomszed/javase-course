import java.util.*;                                     //1

public class SzövegKollekció {
  public static void main(String[] args) {
    Vector<String> szövegVektor=new Vector<String>();
    System.out.println("Kollekcióműveletek szövegekkel\n"+
      "(bevitel üres végjelig)");
    String szöveg;
    int db=0;
    while(!((szöveg=extra.Console.
        readLine(((db++)+1)+". szöveg: ")).equals("")))
      szövegVektor.add(szöveg);
    if(szövegVektor.isEmpty())                          //2
      throw new IllegalArgumentException(
        "Hiányzó szövegek");
    System.out.println("A bevitel sorrendjében:\n"+
      szövegVektor);                                    //3
    Collections.reverse(szövegVektor);                  //4
    System.out.println("Fordított sorrendjében:\n"+
      szövegVektor);
    Collections.sort(szövegVektor);                     //5
    System.out.println("Növekvő sorrendjében:\n"+
      szövegVektor);
    Collections.shuffle(szövegVektor);                  //6
    System.out.println("Összekeverve:\n"+
      szövegVektor);
  }
}