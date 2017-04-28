package ooppart2;

public class Car {
  private String name;
  private int cylinders;
  private int wheels;
  private boolean engine;

  public Car(String name, int cylinders) {
    this.name = name;
    this.cylinders = cylinders;
    this.wheels = 4;
    this.engine = true;
  }

  public String getName() {
    return name;
  }

  public int getCylinders() {
    return cylinders;
  }

  public int getWheels() {
    return wheels;
  }

  public boolean isEngine() {
    return engine;
  }
  
  public void startEngine() {
    System.out.println("Engine started in class Car");
  }
  
  public void accelerateCar() {
    System.out.println("Acceleration in class Car");
  }
  
  public void brake() {
    System.out.println("Break activated in class: Car");
  }  
  
}

class Lada extends Car { 
  
  public Lada(String name, int cylinders) {
    super(name, cylinders);
  }
  
  @Override
  public void startEngine() {
    System.out.println("Engine started in class Lada");
  }
  
  @Override
  public void accelerateCar() {
    System.out.println("Acceleration in class Lada");
  }
  
  @Override
  public void brake() {
    System.out.println("Break activated in class Lada");
  }  
  
}

class Polski extends Car {  
  
  public Polski(String name, int cylinders) {
    super(name, cylinders);   
  }
  
  // no further methods here
  
}

class Trabant extends Car {   

  public Trabant(String name, int cylinders) {
    super(name, cylinders);    
  }
  
  @Override
  public void startEngine() {
    System.out.println("Engine started in class Trabant");
  }
  
  @Override
  public void accelerateCar() {
    System.out.println("Acceleration in class Trabant");
  }
  
  @Override
  public void brake() {
    System.out.println("Break activated in class Trabant");
  }   
}
