package customException;

public class BankException extends RuntimeException {
    public BankException(String message) {
        super(message);
    }
}
