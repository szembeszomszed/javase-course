package arrays;

import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;
  private final double MINIMUM_INITIAL_TRANSACTION = 20.0;

  public Branch(String name) {
    this.name = name;
    this.customers = new ArrayList<Customer>();
  }
  
  public String getName() {
    return this.name;
  }
  
  public void addCustomer(String customerName, double initialTransaction) {
    if (this.customerExists(customerName)) {
      System.out.println("Customer already exists. No customer added.");
      return;
    } 
    if (initialTransaction < this.MINIMUM_INITIAL_TRANSACTION) {
      initialTransaction = this.MINIMUM_INITIAL_TRANSACTION;
    }
    Customer customer = new Customer(customerName, initialTransaction);
    this.customers.add(customer);
    System.out.println("Customer " + customerName + " and initial transaction " + initialTransaction + " added.");   
  }
  
  public void addTransaction(String customerName, Double transaction) {
    if (!this.customerExists(customerName)) {
      System.out.println("Customer not found. No transaction has been made.");
      return;
    }
    this.getCustomer(customerName).addTransaction(transaction);
    System.out.println("Transaction added.");
  }
  
  private boolean customerExists(String name) {
    int i = 0;
    while (i < this.customers.size() && !this.customers.get(i).getName().equals(name)) {
      i++;
    }
    return i < this.customers.size();
  }
  
  private Customer getCustomer(String name) {
    int foundPosition = this.findCustomer(name);
    if (foundPosition >= 0) {
      return this.customers.get(foundPosition);
    }
    return null;
  }
  
  public void queryCustomer(String name) {
    int foundPosition = this.findCustomer(name);
    if (foundPosition >= 0) {
      System.out.println("Name: " + this.customers.get(foundPosition).getName());
    } else {
      System.out.println("Customer not found.");
    }
  }
  
  private int findCustomer(String name) {
    int i = 0;
    while (i < this.customers.size() && !(this.customers.get(i).getName().equals(name))) {
      i++;
    }    
    return (i < this.customers.size() ? i : -1);
  }
  
  public void displayCustomers() {
    System.out.println("Customers: ");
    for (int i = 0; i < this.customers.size(); i++) {
      System.out.println(i + 1 + " - name: " + this.customers.get(i).getName());
      System.out.print("Transactions: ");
      System.out.println(this.customers.get(i).getTransactions().toString());
    }
    System.out.println("------------------------");
  }

}
