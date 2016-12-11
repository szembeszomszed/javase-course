interface StairsData {
  int TOP = 10;
  int BOTTOM = 0;
}

public class Feladat1441_RobotEsLepcso1 implements StairsData {
  
  static int position = TOP;
  
  static int generateStep() {
    return (int) (Math.random() * 5 - 2);
  }
  
  static void makeSteps() {
    int step = 0;
    int stepsMade = 0;
    System.out.println("A robot kezdetben a " + position + ". lépcsőfokon áll.");
    do {      
      step = generateStep();
      while (step + position > TOP || step == 0) {
        step = generateStep();
      }
      position += step;
      System.out.println("A robot jelenleg a " + position + ". lépcsőfokon áll. ");
      stepsMade++;
    } while (position > BOTTOM);
    System.out.println("Az elmozdulások száma: " + stepsMade + ".");
  }

  public static void main(String[] args) {
    makeSteps();
  }  
}
