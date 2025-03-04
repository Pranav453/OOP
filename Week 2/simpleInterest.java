class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 5000;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal failed! Exceeds savings account limit of " + WITHDRAWAL_LIMIT);
        } else {
            super.withdraw(amount);
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 10;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (totalAmount > balance) {
            System.out.println("Withdrawal failed! Insufficient funds including transaction fee.");
        } else {
            super.withdraw(totalAmount);
            System.out.println("Transaction fee of " + TRANSACTION_FEE + " applied.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(10000);
        CheckingAccount checking = new CheckingAccount(10000);

        System.out.println("--- Savings Account Transactions ---");
        savings.deposit(2000);
        savings.withdraw(6000);
        savings.withdraw(3000);

        System.out.println("\n--- Checking Account Transactions ---");
        checking.deposit(3000);
        checking.withdraw(2000);
        checking.withdraw(8000);
    }
}
