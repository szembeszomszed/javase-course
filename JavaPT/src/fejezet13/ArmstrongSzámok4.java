import java.util.Vector;

public class ArmstrongSzámok4 {

  static boolean armstrong(int szám) {
    int eredetiSzám=szám;
    int számjegySzám=(szám+"").length();
    int hatványÖsszeg=0;
    do
      hatványÖsszeg+=Math.pow(szám%10, számjegySzám);
    while((szám/=10)!=0);
    return (eredetiSzám==hatványÖsszeg);
  }

  public static void main(String[] args) {
    Vector<Integer> armstrongVektor=new Vector<Integer>();
    for(int i=0; i<=10000000; i++)
      if(armstrong(i))
        armstrongVektor.add(i);
    System.out.println("A tízmillió alatti Armstrong számok:\n"+armstrongVektor);
  }
}