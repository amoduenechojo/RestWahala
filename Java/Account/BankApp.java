import java.math.BigDecimal;
import java.util.Scanner;

public class BankApp {
    private static Bank bank = new Bank();

    private static Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        mainMenu();
    }

    private static void  mainMenu() {
        String menu = """
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Exit
                """;
        System.out.println(menu);

        String choice = input.next();

        private static void runAtm () {
            String menu = """
                    1 -> Create Account
                    2 -> Deposit
                    3 -> Withdraw
                    4 -> Transfer
                    5 -> Check Balance
                    6 -> Exit
                    """;
            System.out.println(menu);
            String choice = input.next();

            if (choice.equals("1")) {
                createAccount();
            } else if (choice.equals("2")) {
                deposit();
            } else if (choice.equals("3")) {
                withdraw();
            } else if (choice.equals("4")) {
                transfer();
            } else if (choice.equals("5")) {
                checkBalance();
            } else if (choice.equals("6")) {
                System.exit(0);
            } else System.out.println("Invalid choice");

            mainMenu();
        }
    }
    
    private static void createAccount() {
        System.out.println("Name:");
        String name = input.next();

        System.out.println("PIN:");
        String pin = input.next();

        System.out.println("Account Number:");
        int accountNumber = input.nextInt();

        bank.createAccount(name, pin, accountNumber);
        System.out.println("Account created!");
    }

    private static void deposit() {
        System.out.println("Account Number:");
        int accountNumber = input.nextInt();

        System.out.println("Amount:");
        BigDecimal amount = input.nextBigDecimal();

        bank.deposit(accountNumber, amount);
        System.out.println("Successful!");
    }

    private static void withdraw() {
        System.out.println("Account Number:");
        int accountNumber = input.nextInt();

        System.out.println("Amount:");
        BigDecimal amount = input.nextBigDecimal();

        System.out.println("PIN:");
        String pin = input.next();

        bank.withdraw(accountNumber, amount, pin);
        System.out.println("Withdrawn!");
    }

    private static void transfer() {
        System.out.println("From:");
        int from = input.nextInt();

        System.out.println("To:");
        int to = input.nextInt();

        System.out.println("Amount:");
        BigDecimal amount = input.nextBigDecimal();

        System.out.println("PIN:");
        String pin = input.next();

        bank.transfer(from, to, amount, pin);
        System.out.println("Transfer successful!");
    }

    private static void checkBalance() {
        System.out.println("Account Number:");
        int accountNumber = input.nextInt();

        System.out.println("PIN:");
        String pin = input.next();

        BigDecimal balance = bank.findAccount(accountNumber).checkBalance(pin);
        System.out.println("Balance is: " + balance);
    }
}