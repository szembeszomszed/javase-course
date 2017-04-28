public class KisebbNagyobbEgyenlőReláció {
  public static void main(String[] args) {
    System.out.println("Két szám közötti reláció");
    int x=extra.Console.readInt("Egyik szám: ");
    int y=extra.Console.readInt("Másik szám: ");
    System.out.print("Összehasonlítva: "+x+" ");
    if(x>y)
      System.out.print(">");
    else if(x==y)
      System.out.println("=");
    else
      System.out.print("<");
    System.out.println(" "+y);
  }
}