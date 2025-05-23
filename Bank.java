import java.util.ArrayList;
import java.util.List;

public abstract class Bank {
    private String bankName;
    private String branchName;
    private static int bankCounter = 0;
    protected static final String BANK_CODE_PREFIX = "BANK-";
    protected List<Account> accounts;

    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.accounts = new ArrayList<>();
        bankCounter++;
    }

    public String generateBankCode() {
        return BANK_CODE_PREFIX + String.format("%03d", bankCounter);
    }

    public abstract void openAccount(Account account);

    public abstract void displayBankInfo();

    public String getBankName() {
        return bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}