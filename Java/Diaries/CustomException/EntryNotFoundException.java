package CustomException;

public class EntryNotFoundException extends customException.DiaryException {
    public EntryNotFoundException(String message) {
        super(message);
    }
}
