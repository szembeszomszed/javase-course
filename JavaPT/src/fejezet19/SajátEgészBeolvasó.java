import java.io.BufferedReader;                          //1
import java.io.InputStreamReader;

public class SajátEgészBeolvasó {

  static int readInt(String üzenet) {
    BufferedReader konzol=                              //2
      new BufferedReader(new InputStreamReader(System.in));
    boolean ok=false;
    int egészSzám=0;
    do {
      try {
        System.out.print(üzenet);
        String beolvasottSzöveg=
          konzol.readLine().trim();                     //3
        egészSzám=Integer.parseInt(beolvasottSzöveg);   //4
        ok=true;
      }
      catch(Exception e) {                              //5
        System.out.println("Nem egész! Újra!");
      }
    } while(!ok);
    return egészSzám;
  }

  public static void main(String[] args) {
    int egész=readInt("Egész szám: ");
  }
}