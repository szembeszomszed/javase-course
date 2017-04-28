import java.util.Vector;

public class PárosKétjegyűek {

  static int véletlenszám(int a, int b) {            //a<=b
    return (int)(Math.random()*(b-a+1)+a);
  }

  public static void main(String[] args) {
    Vector<Integer> vektor=new Vector<Integer>();
    for(int i=1; i<=véletlenszám(20, 30); i++)
      vektor.add(véletlenszám(10, 90));                 //1
    System.out.println("Véletlenszerű (20 és 30 közötti) "+
      "darabszámú kétjegyű véletlenszám:\n"+vektor);    //2
    for(int i=vektor.size()-1; i>=0; i--)               //3
      if(vektor.elementAt(i)%2==1)                      //4
        vektor.remove(i);                               //5
    System.out.println("Ezek között "+
      (vektor.isEmpty()?                                //6
        "nincs páros szám.":"párosak:\n"+vektor));
  }
}