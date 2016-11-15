package teglalap2;

public class RectangleController {
  private static Rectangle rectangle1;
  private static Rectangle rectangle2;
  
  public static void main(String[] args) {
    rectangle1 = new Rectangle(10, 5);
    rectangle2 = new Rectangle(5, 10);
    System.out.println(rectangle1);
    System.out.println(rectangle2);
    System.out.println(rectangle1.equals(rectangle2));
  }
}
