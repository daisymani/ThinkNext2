package javaPackage2;

//Class representing a Bank Account with encapsulation
class BankAccount {
 private String accountNumber;
 private double balance;

 // Constructor
 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Getter for account number
 public String getAccountNumber() {
     return accountNumber;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Invalid withdrawal amount.");
     }
 }
}






//Main Class & Main Method

public class EncapsulationExample {
	
	public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount account = new BankAccount("12345", 1000.0);

        // Using getter methods to access account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        // Depositing and withdrawing money
        account.deposit(500.0);
        account.withdraw(200.0);

        // Checking updated balance
        System.out.println("Updated Balance: " + account.getBalance());
    }

}
