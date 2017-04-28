import java.util.Vector;

public class Objektumok {
  public static void main(String[] args) {
    Vector objektumok=new Vector();
    objektumok.add(new Object() {                       //1
      @Override                                         //2
      public String toString() {
        return "alma";
      }
    });                                                 //3
    objektumok.add(new Object() {
      public String toString() {
        return "fa";
      }
    });
    String o1=objektumok.get(0).toString();             //4
    String o2=objektumok.get(1).toString();
    objektumok.add(o1.concat(o2));
    System.out.println(objektumok);
  }
}