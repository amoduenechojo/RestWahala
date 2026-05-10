import java.util.Scanner;

public class CreditCardApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String cardNumber = input.nextLine();

        CreditCardValidator card = new CreditCardValidator(cardNumber);

        card.displayCardDetails();

        input.close();
    }
}