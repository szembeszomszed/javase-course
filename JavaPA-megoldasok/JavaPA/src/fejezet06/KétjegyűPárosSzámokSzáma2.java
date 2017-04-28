public class KétjegyűPárosSzámokSzáma2 {
  public static void main(String[] args) {
    System.out.print("A kétjegyű páros számok száma: ");
    int db=0;
    for(int i=10; i<=98; i+=2)
      db++;
    System.out.println(db);
  }
}