class Bank{

    Bank(String string, String password123, String john_Doe, double par) {
    }
    private String accountNumber;
    private String password;
    private String accountHolderName;
    private double balance;

    public void bank(String accountNumber, String password, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    
}

public class bankclass {
    public static void main(String[] args) {
        Bank b = new Bank("123456789", "password123", "John Doe", 1000.0);
        b.deposit(500.0);
        b.withdraw(200.0);

    }
}