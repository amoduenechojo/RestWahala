package customException;

public class IllegalArgumentException extends BankException {
    public IllegalArgumentException(String message) {
        super(message);
    }
}
