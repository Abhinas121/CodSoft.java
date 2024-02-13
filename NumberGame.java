import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        int count = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (!hasGuessedCorrectly && count<=10) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            count++;
           
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
                if(numberOfTries>=1 && numberOfTries<=5){
                    System.out.println("You have scored  "+numberOfTries+"  out of 10");
                }else if(numberOfTries>=6 &&numberOfTries<=10){
                    System.out.println("You have scored  "+numberOfTries+"  out of 10");
                }else if(numberOfTries>=7 && numberOfTries<=10){
                    System.out.println("You have scored  "+numberOfTries+"  out of 10");
                }else if(numberOfTries>=9 && numberOfTries<=10){
                    System.out.println("You have scored  "+numberOfTries+"  out of 10");
                }else{
                    System.out.println("Better luck next time");
                }
            }
        }
        System.out.println("Better luck next time");
        scanner.close();
    }
}