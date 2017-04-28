package ooppart2;

public class Addition {
  private String name;
  private double price;
  protected boolean healthy;

  public Addition(String name, double price) {
    this.name = name;
    if (price <= 0.50) {
      this.price = 0.50;
    } else {
      this.price = price;
    }
    this.healthy = false;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
  
  public boolean getHealthy() {
    return healthy;
  }
}

class Sauce extends Addition {
  
  public Sauce(String name, double price) {
    super(name, price);
  }
  
}

class Tomato extends Addition {
  
  public Tomato(String name, double price) {
    super(name, price);
    this.healthy = true;
  }  
  
}

class Bacon extends Addition {
  
  public Bacon(String name, double price) {
    super(name, price);
  }
  
}

class Salat extends Addition {
  
  public Salat(String name, double price) {
    super(name, price);
    this.healthy = true;
  }
  
}

class Cheese extends Addition {
  
  public Cheese(String name, double price) {
    super(name, price);
  }
  
}

class HotPepper extends Addition {
  
  public HotPepper(String name, double price) {
    super(name, price);
  }
  
}

class Chips extends Addition {
  
  public Chips(String name, double price) {
    super(name, price);
  }
  
}

class Drink extends Addition {
  
  public Drink(String name, double price) {
    super(name, price);
  }
  
}
