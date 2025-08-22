public class Index {
    
    // Private fields (data hiding)
    private String accountHolder;
    private double balance;

    // Constructor
    public void BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public methods to access private fields (getters and setters)
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    public static void main(String[] args) {
        Index account = new Index();
        account.BankAccount("Alice", 10000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: $" + account.getBalance());

        byte b = 127;
        short s = 32767;
        int i = 10000;
        long l = 100000L;
        float f = 10.5f;
        double d = 100.50; 
    }
}