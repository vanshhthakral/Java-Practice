class BankAccount {
    private double balance;

    BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    protected void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(2000);
        account.withdraw(540);
        account.checkBalance();
    }
}
