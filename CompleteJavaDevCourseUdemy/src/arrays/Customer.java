package arrays;

import java.util.ArrayList;

public class Customer {
  private String name;
  private Double transaction;
  private ArrayList<Double> transactions; 

  public Customer(String name, double initialTransaction) {
    this.name = name;
    this.transactions = new ArrayList<>();
    this.addTransaction(initialTransaction);
  }

  public String getName() {
    return name;
  }
  
  public ArrayList<Double> getTransactions() {
    return this.transactions;
  }
  
  public void addTransaction(double transaction) {
    this.transactions.add(transaction);
  }

  public void displayTransactions() {
    this.transactions.toString();
  }
  
}
