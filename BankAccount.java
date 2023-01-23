public class BankAccount {
    private long accountNumber;
    private double balance;
    private String owner;
    public BankAccount(long accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
    public void deposit (double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount);
    }
    public void withdraw (double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawed " +amount);
        }
        else {
            System.out.println("insufficient funds");
        }
    }
    public void displayBalance () {
        System.out.println("Your Balance is " + this.balance);
    }
}
class DemoBankAccounts {
    public static void main(String[] args) {
        BankAccount MichelsAccount = new BankAccount(163005200150L, 1000, "Michel");
        MichelsAccount.deposit(500);
        MichelsAccount.withdraw(1000);
        MichelsAccount.displayBalance();
    }
}
