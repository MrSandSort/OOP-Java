package Pillars.Encpasulation;

class ATM {

    private double balance;

    public ATM(double initialBalance) {

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

}    

class ATMTest {
public static void main(String[] args) {
            ATM myATM = new ATM(1300);
            System.out.println("Current Balance: $" + myATM.getBalance());
            myATM.withdraw(200);
            System.out.println("Current Balance After Withdrawl: $" + myATM.getBalance());
        }
}

