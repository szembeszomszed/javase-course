package fejezet15;

public class HáromszögekTeszt1 {

  private void hibásÁltalánosHáromszög1() {
    try {
      System.out.print("Általános háromszög (2, 4, -8): ");
      new ÁltalánosHáromszög(2, 4, -8);                 //1
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  private void hibásÁltalánosHáromszög2() {
    try {
      System.out.print("Általános háromszög " +
        "(2, -4.5, -8): ");
      new ÁltalánosHáromszög(2, -4.5, -8);              //2
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  private void hibásÁltalánosHáromszög3() {
    try {
      System.out.print("Általános háromszög (2, 6, 3): ");
      new ÁltalánosHáromszög(2, 6, 3);                  //3
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  private void hibásEgyenlőszárúHáromszög1() {
    try {
      System.out.print("Egyenlőszárú háromszög (3, 0): ");
      new EgyenlőszárúHáromszög(3, 0);                  //4
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  private void hibásEgyenlőszárúHáromszög2() {
    try {
      System.out.print("Egyenlőszárú háromszög (10, 5): ");
        new EgyenlőszárúHáromszög(10, 5);               //5
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  private void hibásEgyenlőoldalúHáromszög() {
    try {
      System.out.print("Egyenlőoldalú háromszög (-5): ");
      new EgyenlőoldalúHáromszög(-5);                   //6
    }
    catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  public void run() {
    hibásÁltalánosHáromszög1();
    hibásÁltalánosHáromszög2();
    hibásÁltalánosHáromszög3();
    hibásEgyenlőszárúHáromszög1();
    hibásEgyenlőszárúHáromszög2();
    hibásEgyenlőoldalúHáromszög();
  }

  public static void main(String[] args) {
    new HáromszögekTeszt1().run();
  }
}