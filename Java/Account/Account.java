import CustomException.InsufficientFundsException;
import CustomException.InvalidAmountException;
import CustomException.InvalidPinException;

import java.math.BigDecimal;

public class MyAccount {


        private String name;
        private String pin = "1234";
        private int number;

        private BigDecimal balance = BigDecimal.ZERO;


    public boolean isEmpty() {

        return balance.compareTo(BigDecimal.ZERO) == 0;
    }


    public void depositAmount(BigDecimal amount) {

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Amount deposited must be positive.");
        }
        this.balance = this.balance.add(amount);
    }


    public BigDecimal checkBalance(String pin) {
        validatePin(pin);
        return this.balance;
    }


    public void withdrawAmount(BigDecimal amount, String pin) {
        validatePin(pin);
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new InvalidAmountException("Amount withdrawn must be positive.");
        }

        if (amount.compareTo(balance) > 0) {
            throw new InsufficientFundsException("Insufficient funds");
        }

        this.balance = this.balance.subtract(amount);
    }
    }


    public void validatePin(String inputPin){
        if(this.pin == null || !this.pin.equals(inputPin)){
            throw new InvalidPinException("Incorrect Pin, retry");
        }
    }

}


