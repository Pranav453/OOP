class BankAccount{
    double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
            System.err.println("Deposited amount= "+amount+" New Balance= "+balance);
        }
        else{
            System.err.println("Invalid deposit amount!");
        }
    }
    void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance=balance-amount;
            System.err.println("Withdrawn amount= "+amount+" New Balance= "+balance);
        }
        else{
            System.out.println("Withdrawl ammount exceeds balance or Invalid amount.");
        }
    }
}
class SavingsAccount extends BankAccount{
       private static final double withdrawl_limit=10000;
       public SavingsAccount(double balance){
        super(balance);
       }
       void withdraw(double amount){
        if (amount>0 && amount<=withdrawl_limit &&  amount<=balance){
        balance=balance-amount;
        System.err.println("Withdrawn ammount= "+amount+"New Balance= "+balance);
       }
       else if (amount>0 && amount>withdrawl_limit && amount<=balance){
        System.err.println("Amount exceeded withdrawl limit");
       }
       else{
        System.out.println("Invalid Amount");
       }
    }
}
class CheckingAccount extends BankAccount{
    private static final double transactionfee = 3.5; 
    public CheckingAccount(double balance){
        super(balance);
    }
    public void withdraw(double amount) {
        double totalAmount = amount + transactionfee;
        if (amount > 0 && amount <= balance) {
            balance=balance-amount;
            System.out.println("Withdrawal amount: " + amount + " (Fee: " + transactionfee + ") New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
class bankapp{
    public static void main(String[] args) {
        System.err.println("Pranav,24244,CSE-C");
        SavingsAccount s=new SavingsAccount(800000);
        CheckingAccount c=new CheckingAccount(800000);
        s.deposit(100000);
        c.deposit(10000);
        s.withdraw(20000);
        c.withdraw(10000);
    }
}