public class LoanAccount extends Account {
    private static final double INTEREST_RATE = 0.08; // 8% interest

    public LoanAccount(String accountNumber, String holderName, double initialLoanAmount) {
        super(accountNumber, holderName, -initialLoanAmount); // Negative balance for loan
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Reduce loan amount
            System.out.println("Paid ₹" + amount + " towards Loan Account. Remaining Loan: ₹" + Math.abs(balance));
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed for Loan Account.");
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Loan Account");
    }

    public void applyInterest() {
        if (balance < 0) {
            double interest = balance * INTEREST_RATE;
            balance += interest; // Increase loan amount due to interest
            System.out.println("Interest applied: ₹" + interest + ". New Loan Amount: ₹" + Math.abs(balance));
        }
    }
}