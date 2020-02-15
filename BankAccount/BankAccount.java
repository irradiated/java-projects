import java.text.DecimalFormat;

public class BankAccount {
    protected String customerName;
    protected String accountNumber;
    protected int accountType;
    protected double balance;

    public BankAccount() {
        customerName = "";
        accountNumber = "";
        accountType = 0;
        balance = 0.0;
    }

    public BankAccount (String name, String acctNumber, double amount) {
        customerName = name;
        accountNumber = acctNumber;
        balance = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String name) {
        customerName = name;
    }

    public void setAccountNumber(String acctNumber) {
        accountNumber = acctNumber;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if ((balance - amount) >= 0.0) {
                balance -= amount;
            }
            else {
                System.out.println("Not enough money for the withdrawal, try again!");
            }
        }
        else {
            System.out.println("Invalid deposit amount!");
        }
    }

    puiblic String toString() {
        DecimalFormat fmt = new DecimalFormat("$###,###.00");
        return "Account Number: " + getAccountNumber() + "\n" + "Customer Name: " + getCustomerName() +
        "\n" + "Balance: " + fmt.format(getBalance());
    }
}