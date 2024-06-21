public class BankAccount {
    private String accountHolder;
    private double balance;

    
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }


}
