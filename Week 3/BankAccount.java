public class BankAccount {
    protected String accountHolder;
    protected double balance;
    protected int accountNumber;
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount BA = new BankAccount("Hardik", 24244, 1000000);
        BA.withdrawal(50000);
        BA.deposit(150000);
    }
}
