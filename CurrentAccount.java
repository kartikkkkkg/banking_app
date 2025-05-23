public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 5000.0;

    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " to Current Account. New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + OVERDRAFT_LIMIT) >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Current Account. New Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or exceeds overdraft limit.");
        }
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Current Account");
    }
}