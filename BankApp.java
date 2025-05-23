public class BankApp {
    public static void main(String[] args) {
        // Create a Nationalized Bank
        Bank sbi = new NationalizedBank("SBI", "CG");
        
        // Open accounts
        Account savings = new SavingsAccount("ACC101", "Rahul", 10000.0);
        Account current = new CurrentAccount("ACC102", "Priya", 5000.0);
        Account loan = new LoanAccount("ACC103", "Vikram", 20000.0);
        
        sbi.openAccount(savings);
        sbi.openAccount(current);
        sbi.openAccount(loan);
        
        // Perform transactions
        savings.deposit(500.0);
        savings.withdraw(2000.0);
        current.withdraw(3000.0);
        loan.deposit(5000.0);
        
        // Display bank and account details
        sbi.displayBankInfo();
        
        // Create a Cooperative Bank
        Bank coop = new CooperativeBank("CoopBank", "Main Branch");
        Account savings2 = new SavingsAccount("ACC201", "Anita", 15000.0);
        coop.openAccount(savings2);
        savings2.deposit(1000.0);
        coop.displayBankInfo();
    }
}