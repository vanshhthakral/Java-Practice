interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    }
    class Account implements Bank {
    private double balance;
    public Account(double initialBalance) {
    this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount) {
    if (amount > 0) {
    balance += amount;
    System.out.println("Deposited: " + amount);
    } else {
    System.out.println("Invalid deposit amount.");
    }
    }
    @Override
    public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
    balance -= amount;
    System.out.println("Withdrawn: " + amount);
    } else {
    System.out.println("Insufficient balance or invalid amount.");
    }
    }
    public void displayBalance() {
    System.out.println("Current Balance: " + balance);}
    }
    public class ex73 {
    public static void main(String[] args) {
    Account myAccount = new Account(5000);
    myAccount.displayBalance();
    myAccount.deposit(1500);
    myAccount.displayBalance();
    myAccount.withdraw(2000);
    myAccount.displayBalance();
    myAccount.withdraw(6000);
    }
    }
    