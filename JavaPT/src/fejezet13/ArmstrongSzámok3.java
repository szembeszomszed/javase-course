import java.util.Vector;

public class ArmstrongSzámok3 {
 
  static boolean armstrong(int szám) {
    Vector<Integer> számjegyVektor=new Vector<Integer>();
    int eredetiSzám=szám;
    do
      számjegyVektor.add(szám%10);
    while((szám/=10)!=0);
    int számjegySzám=számjegyVektor.size();
    int hatványÖsszeg=0;
    for(int számjegy: számjegyVektor)
      hatványÖsszeg+=Math.pow(számjegy, számjegySzám);
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