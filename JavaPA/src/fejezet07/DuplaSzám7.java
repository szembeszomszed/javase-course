public class DuplaSzám7 {

  static void dupla(int egész) {                        //1
    System.out.println("A szám kétszerese: "+2*egész);  //2
  }                                                     //3

  public static void main(String[] args) {
    System.out.println("Szám kétszerese");
    int x = extra.Console.readInt("Szám: ");
    dupla(x);                                           //4
  }
}