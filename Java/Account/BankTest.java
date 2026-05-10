import CustomException.InsufficientFundsException;
import CustomException.InvalidAmountException;
import CustomException.InvalidPinException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {


    @Test
    public void testThatValidRegistration_createsAndStoresAccount(){
        Bank bank = new Bank();

        bank.createAccount("Amodu Enechojo", "1234", 1);

        assertEquals(1, bank.getNumberOfAccounts());
    }

    @Test
    public void testThatDuplicateAccountRegistration_throwsException(){
        Bank bank = new Bank();

        bank.createAccount("Amodu Enechojo", "1234", 1);
        assertThrows(IllegalArgumentException.class, ()-> bank.createAccount("Amodu Enechojo", "1234", 1));
    }

    @Test
    public void testThatFindAccount_withValidNumber_returnsTheCorrectAccount() {
        Bank bank = new Bank();
        bank.createAccount("Alice", "1111", 123);

        bank.findAccount(123);

        assertNotNull("123", "Account should be found");
        assertEquals(123, bank.getNumberOfAccounts());
    }

    @Test
    public void testThatFindAccount_withInvalidNumber_returnsNull() {
        Bank bank = new Bank();

        bank.createAccount("Alice", "1111", 123);

        assertNull("999", "Account 999 should not exist in the bank");
    }


    @Test
    public void testThatValidAccountRemoval_worksWithCorrectPin(){

        Bank bank = new Bank();
        bank.createAccount("John", "1234", 1);

        assertEquals(1, bank.getNumberOfAccounts());

        bank.removeAccount(1, "1234");

        assertEquals(0, bank.getNumberOfAccounts());
        assertNull(bank.findAccount(1));
    }

    @Test
    public void testThatAccountRemoval_withWrongPin_isDenied() {
        Bank bank = new Bank();
        bank.createAccount("John", "1234", 1);

        assertThrows(InvalidPinException.class, () -> bank.removeAccount(1, "9999"));

        assertEquals(1, bank.getNumberOfAccounts());
        assertNotNull(bank.findAccount(1));
    }


    @Test
    public void testThatBankCanDepositToExistingAccount() {
        Bank bank = new Bank();
        bank.createAccount("Seyi", "1111", 1);

        bank.deposit(1, new BigDecimal("1000"));

        Account account = bank.findAccount(1);
        assertEquals(0, new BigDecimal("1000").compareTo(account.checkBalance("1111")));
    }


    @Test
    public void testThatBankDepositWithInvalidAmount_throwsException() {
        Bank bank = new Bank();
        bank.createAccount("Seyi", "1111", 1);


        assertThrows(InvalidAmountException.class, () -> bank.deposit(1, new BigDecimal("-50"));

        assertThrows(InvalidAmountException.class, () -> bank.deposit(1, BigDecimal.ZERO));
    }

    @Test
    public void testThatBankCanWithdrawFromExistingAccount() {
        Bank bank = new Bank();
        bank.createAccount("Seyi", "1111", 1);
        bank.deposit(1, new BigDecimal("2000"));


        bank.withdraw(1, new BigDecimal("500"), "1111");

        Account account = bank.findAccount(1);
        assertEquals(0, new BigDecimal("1500").compareTo(account.checkBalance("1111")));
    }


    @Test
    public void testThatBankWithdrawal_withWrongPin_throwsException() {
        Bank bank = new Bank();
        bank.createAccount("Seyi", "1111", 1);
        bank.deposit(1, new BigDecimal("1000"));

        // Correct account (1), but wrong PIN (9999)
        assertThrows(InvalidPinException.class, () -> bank.withdraw(1, new BigDecimal("100"), "9999"));
    }


    @Test
    public void testThatBankWithdrawal_exceedingBalance_throwsException() {
        Bank bank = new Bank();
        bank.createAccount("Seyi", "1111", 1);
        bank.deposit(1, new BigDecimal("100")); // Only has 100

        // Trying to withdraw 500
        assertThrows(InsufficientFundsException.class, () -> bank.withdraw(1, new BigDecimal("500"), "1111"));
    }


    @Test
    public void testThatBankCanTransferMoneyBetweenAccounts() {
        Bank bank = new Bank();
        bank.createAccount("Enechojo", "1111", 1);
        bank.createAccount("Eneojo", "2222", 2);
        bank.deposit(1, new BigDecimal("5000"));


        bank.transfer(1, 2, new BigDecimal("2000"), "1111");

        assertEquals(0, new BigDecimal("3000").compareTo(bank.findAccount(1).checkBalance("1111")));
        assertEquals(0, new BigDecimal("2000").compareTo(bank.findAccount(2).checkBalance("2222")));
    }


    @Test
    public void testThatTransferWithWrongPin_throwsException() {
        Bank bank = new Bank();
        bank.createAccount("Enechojo", "1111", 1);
        bank.createAccount("Eneojo", "2222", 2);
        bank.deposit(1, new BigDecimal("1000"));


        assertThrows(InvalidPinException.class, () -> {
            bank.transfer(1, 2, new BigDecimal("500"), "9999"));

        assertEquals(0, new BigDecimal("1000").compareTo(bank.findAccount(1).checkBalance("1111")));
    }


    @Test
    public void testThatTransferWithInsufficientFunds_throwsException() {
        Bank bank = new Bank();

        bank.createAccount("Enechojo", "1111", 1);
        bank.createAccount("Eneojo", "2222", 2);
        bank.deposit(1, new BigDecimal("100")); // Low balance

        // Act & Assert
        assertThrows(InsufficientFundsException.class, () -> {
            bank.transfer(1, 2, new BigDecimal("500"), "1111");
        });
    }


}