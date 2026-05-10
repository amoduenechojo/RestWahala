package customException;

public class InvalidPinException extends BankException {
    public InvalidPinException(String message) {
        super(message);
    }
}
