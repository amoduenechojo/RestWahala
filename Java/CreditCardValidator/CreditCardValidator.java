import java.util.Scanner;

public class CreditCardValidator {

    private String number;

    public CreditCardValidator(String number) {
        this.number = number;
    }

    public boolean isValidLength() {
        return number.length() >= 13 && number.length() <= 16;
    }

    public String getCardType() {

        if (number.startsWith("4")) {
            return "Visa Card";
        }

        if (number.startsWith("5")) {
            return "MasterCard";
        }

        if (number.startsWith("37")) {
            return "American Express";
        }

        if (number.startsWith("6")) {
            return "Discover Card";
        }

        return "Invalid";
    }

    public int sumOfDoubleEvenPlace() {

        int sum = 0;

        for (int index = number.length() - 2; index >= 0; index -= 2) {

            int digit = number.charAt(index);

            digit *= 2;

            if (digit > 9) {
                digit -= 9;
            }

            sum += digit;
        }

        return sum;
    }

    public int sumOfOddPlace() {

        int sum = 0;

        for (int index = number.length() - 1; index >= 0; index -= 2) {

            int digit = number.charAt(index) - '0';

            sum += digit;
        }

        return sum;
    }

    public boolean isValidCard() {

        int total = sumOfDoubleEvenPlace() + sumOfOddPlace();

        return total % 10 == 0;
    }

    public void displayCardDetails() {

        System.out.println("Credit Card Type: " + getCardType());

        if (isValidLength()) {
            System.out.println("Credit Card Digit Length: Valid");
        } else {
            System.out.println("Credit Card Digit Length: Invalid");
        }

        if (isValidCard()) {
            System.out.println("Credit Card Validity Status: Valid");
        } else {
            System.out.println("Credit Card Validity Status: Invalid");
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String cardNumber = input.nextLine();

        CreditCardValidator card = new CreditCardValidator(cardNumber);

        card.displayCardDetails();
    }
}