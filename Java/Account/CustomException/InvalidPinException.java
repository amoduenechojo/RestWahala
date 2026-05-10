package CustomException;

import CustomException.AccountException;

public class InvalidPinException extends AccountException {
  public InvalidPinException(String message) { super(message); }
}