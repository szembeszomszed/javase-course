public class KétjegyűPárosSzámokSzáma1 {
  public static void main(String[] args) {
    System.out.print("A kétjegyű páros számok száma: ");
    int db=0;                                           //1
    for(int i=10; i<=99; i++)                           //2
      if(i%2==0)                                        //3
        db++;                                           //4
    System.out.println(db);                             //5
  }
}