package arrays;

import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<>();
  }
  
  public Branch addBranch(String name) {
    if (this.branchExists(name)) {
      System.out.println("Branch already exists.");
      return null;
    }
    Branch branch = new Branch(name);
    this.branches.add(branch);
    System.out.println("Branch " + name + " added.");
    return branch;
  }
  
  public void addCustomerToBranchWithInitialTransaction(Branch branch, String customerName, double initialTransaction) {
    if (!this.branchExists(branch)) {
      System.out.println("Branch does not exist. No action has been made.");
      return;
    }
    int existingBranchIndex = this.findBranch(branch);
    Branch existingBranch = this.branches.get(existingBranchIndex);
    existingBranch.addCustomer(customerName, initialTransaction);    
  }
  
  public void addTransactionToExistingCustomer(Branch branch, String name, double transaction) {
    if (!this.branchExists(branch)) {
      System.out.println("Branch does not exist. No action has been made.");
      return;
    }
    int existingBranchIndex = this.findBranch(branch);
    Branch existingBranch = this.branches.get(existingBranchIndex);
    existingBranch.addTransaction(name, transaction);    
  }
  
  public void displayBranchesAndCustomers() {
    System.out.println("*******************\nBranches:");
    for (int i = 0; i < this.branches.size(); i++) {
      System.out.println(i + 1 + " - branch name: " + this.branches.get(i).getName());
      this.branches.get(i).displayCustomers();
      System.out.println("end of branch");      
    }
  }
  
  private int findBranch(String name) {
    for (Branch b : this.branches) {
      if (b.getName().equals(name)) {
        return this.branches.indexOf(b);
      }
    }
    return -1;
  }
  
  private int findBranch(Branch branch) {
    return this.branches.indexOf(branch);
  }
  
  private boolean branchExists(String name) {
    return this.findBranch(name) >= 0;
  }
  
  private boolean branchExists(Branch branch) {
    return this.findBranch(branch) >= 0;
  }  
  
}
