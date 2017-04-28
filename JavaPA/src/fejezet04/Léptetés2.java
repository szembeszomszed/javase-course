public class Léptetés2 {
  public static void main(String[] args) {
    int a, b, c;

    a=1; b=2;
    System.out.println("a= "+a+", b= "+b+"\n  c=(++a)+(++b) után: ");
    c=(++a)+(++b);
    System.out.println("  a= "+a+", b= "+b+", c= "+c+"\n");

    a=1; b=2;
    System.out.println("a= "+a+", b= "+b+"\n  c=(a++)+(++b) után: ");
    c=(a++)+(++b);
    System.out.println("  a= "+a+", b= "+b+", c= "+c+"\n");

    a=1; b=2;
    System.out.println("a= "+a+", b= "+b+"\n  c=(++a)+(b++) után: ");
    c=(++a)+(b++);
    System.out.println("  a= "+a+", b= "+b+", c= "+c+"\n");

    a=1; b=2;
    System.out.println("a= "+a+", b= "+b+"\n  c=(a++)+(b++) után: ");
    c=(a++)+(b++);
    System.out.println("  a= "+a+", b= "+b+", c= "+c+"\n");
  }
}