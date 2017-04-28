public class DuplaSzám8 {

  static int dupla(int egész) {                         //1
    return 2*egész;                                     //2
  }                                                     //3

  public static void main(String[] args) {
    System.out.println("Szám kétszerese");
    int x = extra.Console.readInt("Szám: ");
    System.out.println("A szám kétszerese: "+dupla(x)); //4
  }
}