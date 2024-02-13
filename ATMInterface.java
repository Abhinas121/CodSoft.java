import java.util.Scanner;

public class ATMInterface {
    private static double balance = 500000; // Initial balance, can be replaced with an actual account balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Management System!");

        while (true) {
            System.out.println("\nChoose an option:(Using serial no:)");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            int Slno= scanner.nextInt();

            switch (Slno) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }
}