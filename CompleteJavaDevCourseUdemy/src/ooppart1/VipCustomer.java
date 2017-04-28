package ooppart1;


public class VipCustomer {
  private String name;
  private double creditLimit;
  private String emailAddress;

  public VipCustomer() {
    this("Karcsi", 100_000.00, "karcsi@email.hu");
    System.out.println("empty counstructor called");
  }

  public VipCustomer(String name, String emailAddress) {
    this(name, 500_000, emailAddress);
    System.out.println("constructor with two parameters called");
  }

  public VipCustomer(String name, double creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
    System.out.println("constructor with three parameters called");
  }  

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public static void main(String[] args) {
    VipCustomer karcsi = new VipCustomer();
    System.out.println("name: " + karcsi.getName() + ", email: " + karcsi.getEmailAddress() + ", credit limit: " + karcsi.getCreditLimit());
    VipCustomer sanyi = new VipCustomer("sanyi", "sanyi@email.hu");
    System.out.println("name: " + sanyi.getName() + ", email: " + sanyi.getEmailAddress() + ", credit limit: " + sanyi.getCreditLimit());
    VipCustomer marcsi = new VipCustomer("marcsi", 500_000, "marcsi@email.hu");
    System.out.println("name: " + marcsi.getName() + ", email: " + marcsi.getEmailAddress() + ", credit limit: " + marcsi.getCreditLimit());
  }  
  
}


