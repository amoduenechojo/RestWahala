import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {

    @Test
    public void testValidCardLength() {
        CreditCardValidator card = new CreditCardValidator("4532015112830366");
        assertTrue(card.isValidLength());
    }

    @Test
    public void testInvalidCardLength() {
        CreditCardValidator card = new CreditCardValidator("12345");
        assertFalse(card.isValidLength());
    }

    @Test
    public void testVisaCardType() {
        CreditCardValidator card = new CreditCardValidator("4111111111111111");
        assertEquals("Visa Card", card.getCardType());
    }

    @Test
    public void testMasterCardType() {
        CreditCardValidator card = new CreditCardValidator("5123456789012345");
        assertEquals("MasterCard", card.getCardType());
    }

    @Test
    public void testInvalidCardType() {
        CreditCardValidator card = new CreditCardValidator("9999999999999999");
        assertEquals("Invalid", card.getCardType());
    }

    @Test
    public void testValidCardLuhn() {
        CreditCardValidator card = new CreditCardValidator("4532015112830366");
        assertTrue(card.isValidCard());
    }

    @Test
    public void testInvalidCardLuhn() {
        CreditCardValidator card = new CreditCardValidator("1234567890123456");
        assertFalse(card.isValidCard());
    }

    @Test
    public void testNonDigitCharacters() {

        CreditCardValidator card = new CreditCardValidator("4532abcd1123efgh");

        assertFalse(card.isValidCard());
    }

    @Test
    public void testEmptyCardNumber() {

        CreditCardValidator card = new CreditCardValidator("");

        assertFalse(card.isValidLength());
    }


    @Test
    public void testAllZeros() {

        CreditCardValidator card = new CreditCardValidator("0000000000000000");

      card.isValidLength();

        assertEquals("Invalid", card.getCardType());
        assertFalse(card.isValidCard());
    }

    @Test
    public void testTooLongCardNumber() {

        CreditCardValidator card = new CreditCardValidator("45320151128303661234");

        assertFalse(card.isValidLength());
    }


    @Test
    public void testSingleDigit() {

        CreditCardValidator card = new CreditCardValidator();

        card.isValidLength();

        assertEquals("Visa Card", card.getCardType());
        assertFalse(card.isValidCard());
    }

}