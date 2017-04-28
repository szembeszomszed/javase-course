public class Oszthatóság {
  public static void main(String[] args) {
    System.out.println("'A'-nak osztója-e 'B'?");
    int a=extra.Console.readInt("'A': ");
    int b=extra.Console.readInt("'B': ");
    boolean osztható_e=a%b==0;
    System.out.println("'A'-nak osztója-e 'B': "+osztható_e);
  }
}