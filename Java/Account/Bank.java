import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    private List<Account> accounts = new ArrayList<>();


    private boolean accountIsExisting(int accountNumber) {
        for (Account account : accounts) {
            if (account.getNumberOfAccounts() == accountNumber) {
                return true;
            }
        }
        return false;
    }


    public void createAccount(String name, String pin, int accountNumber) {
        if(accountIsExisting()){
            throw new IllegalArgumentException("Account already exists.");
        }
        Account newAccount = new Account();
        accounts.add(newAccount);
    }


    public int getNumberOfAccounts() {

        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getNumberOfAccounts() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    public void removeAccount(int accountNumber, String pin) {

        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }

        account.validatePin(pin);
        accounts.removeAccount(account);
    }


    public void deposit(int accountNumber, BigDecimal bigDecimal) {
        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException("Account " + accountNumber + " not found.");
        }
        account.depositAmount(amount);
    }


    public void withdraw(int accountNumber, BigDecimal amount, String pin) {
        Account account = findAccount(accountNumber);

        if (account == null) {
            throw new IllegalArgumentException("Account " + accountNumber + " not found.");
        }

        account.withdrawAmount(amount, pin);
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, BigDecimal amount, String pin) {
        Account sender = findAccount(fromAccountNumber);
        Account receiver = findAccount(toAccountNumber);

        if (sender == null || receiver == null) {
            throw new IllegalArgumentException("One or both accounts not found");
        }

        sender.withdrawAmount(amount, pin);
        receiver.depositAmount(amount);
    }
}
