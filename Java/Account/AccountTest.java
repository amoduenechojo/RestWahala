import CustomException.InsufficientFundsException;
import CustomException.InvalidAmountException;
import CustomException.InvalidPinException;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testThatAccountExists() {
        MyAccount account = new MyAccount();
        assertNotNull(account);
    }

    @Test
    public void testThatAccountIsEmpty() {
        Account account = new Account();
        assertTrue(account.isEmpty());
    }

    @Test
    public void testThatValidDepositIncreasesBalance() {
        Account account = new Account();
        BigDecimal depositAmount = new BigDecimal("500");

        account.depositAmount(depositAmount);

        assertEquals(0, new BigDecimal("500").compareTo(account.checkBalance("1234")));
    }

    @Test
    public void testThatZeroDeposit_throwsAnError() {
        Account account = new Account();

        assertThrows(InvalidAmountException.class, () -> account.depositAmount(BigDecimal.ZERO));
    }

    @Test
    public void testThatNegativeDeposit_throwsAnException() {
        Account account = new Account();
        assertThrows(InvalidAmountException.class, () -> account.depositAmount(new BigDecimal("-100")));
    }

    @Test
    public void testThatValidWithdrawalsReducesBalance() {
        Account account = new Account();
        account.depositAmount(new BigDecimal("600"));

        account.withdrawAmount(new BigDecimal("400"), "1234");
        assertEquals(0, new BigDecimal("200").compareTo(account.checkBalance("1234")));
    }

    @Test
    public void givenCorrectBalance_whenWithdrawingWithWrongPin_thenInvalidPinExceptionIsThrown() {
        Account account = new Account();
        account.depositAmount(new BigDecimal("600"));

        assertThrows(InvalidPinException.class, () -> account.withdrawAmount(new BigDecimal("200"), "5678"));
    }

    @Test
    public void givenLowBalance_whenWithdrawingLargeAmount_thenInsufficientFundsExceptionIsThrown() {
        Account account = new Account();

        assertThrows(InsufficientFundsException.class, () -> account.withdrawAmount(new BigDecimal("1000"), "1234"));
    }

    @Test
    public void testThatNegativeWithdrawals_throwsInvalidAmountException() {
        Account account = new Account();

        assertThrows(InvalidAmountException.class, () -> account.withdrawAmount(new BigDecimal("-50"), "1234"));
    }

    @Test
    public void givenValidPin_whenCheckingBalance_thenReturnsCorrectAmount() {
        Account account = new Account();
        account.depositAmount(new BigDecimal("1000"));

        BigDecimal balance = account.checkBalance("1234");
        assertEquals(0, new BigDecimal("1000").compareTo(balance));
    }

    @Test
    public void givenIncorrectPin_whenCheckingBalance_thenThrowsInvalidPinException() {
        Account account = new Account();
        account.depositAmount(new BigDecimal("1000"));

        assertThrows(InvalidPinException.class, () -> account.checkBalance("1256"));
    }
}