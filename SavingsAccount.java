public class SavingsAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000.0;

    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " to Savings Account. New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Savings Account. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount. Minimum balance required: ₹" + MINIMUM_BALANCE);
        }
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}