class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor to initialize account number and balance
    public BankAccount(int accountNumber, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new RuntimeException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(12345, 1000);
            account.displayAccount();
            
            // Performing withdrawal
            account.withdraw(500); // Valid transaction
            account.withdraw(600); // This will throw an exception
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
