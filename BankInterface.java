interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class SBI implements Bank {
    double balance = 5000;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankInterface {
    public static void main(String[] args) {
        SBI s = new SBI();

        s.displayBalance();
        s.deposit(2000);
        s.withdraw(1000);
        s.displayBalance();
    }
}