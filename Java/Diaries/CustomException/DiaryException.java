package customException;

public class DiaryException extends RuntimeException {
    public DiaryException(String message) {
        super(message);
    }
}