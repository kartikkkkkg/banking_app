public class CooperativeBank extends Bank {
    public CooperativeBank(String bankName, String branchName) {
        super(bankName, branchName);
    }

    @Override
    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened in Cooperative Bank: " + account.getHolderName());
    }

    @Override
    public void displayBankInfo() {
        System.out.println("--- Bank Details ---");
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Branch: " + getBranchName());
        System.out.println("Bank Code: " + generateBankCode());
        System.out.println("\n--- Account Details ---");
        for (Account account : accounts) {
            account.showAccountType();
            System.out.println("Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: ₹" + account.getBalance());
            System.out.println();
        }
    }
}