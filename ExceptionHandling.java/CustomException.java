// Custom exception class
class Insufficient extends Exception {
    Insufficient(String messege) {
        super(messege);
    }
}

// Bank account class
class BankAccount {
    double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws Insufficient {
        if(amount > balance) {
            throw new Insufficient("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

// Main class
public class CustomException {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(100);
        try {
            b.withdraw(400);
        } catch(Insufficient e) {
            System.out.println(e.getMessage());
        }
    }
}
