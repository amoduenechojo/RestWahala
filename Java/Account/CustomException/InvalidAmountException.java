package CustomException;

import CustomException.AccountException;

public class InvalidAmountException extends AccountException {
    public InvalidAmountException(String message) { super(message); }
}