package org.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;

@Command(name = "play", mixinStandardHelpOptions = true, version = "expense-tracker 1.0",
        description = "Começa o Jogo.")
public class StartGame implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] options = {"Easy", "Medium", "Hard"};
        int number = rand.nextInt(1, 101);
        int chances = 5;
        int level;

        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.\n" +
                "You have 5 chances to guess the correct number.");

        System.out.println("Please select the difficulty level:\n" +
                "1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)\n");
        do {
            System.out.print("Enter your choice: ");
            level = sc.nextInt();
            switch (level) {
                case 1 -> chances = 10;
                case 2 -> chances = 5;
                case 3 -> chances = 3;
                default -> System.out.println(level + " is not a valid option!");
            }
        } while (level < 1 || level > 3);

        System.out.println("Great! You have selected the " + options[level - 1] + " difficulty level.\n" +
                "Let's start the game!");

        int attempts = 1;
        while (chances != 0) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                return 0;
            } else if (guess < number) {
                System.out.println("Incorrect! The number is greater than " + guess);
            } else {
                System.out.println("Incorrect! The number is less than " + guess);
            }
            chances--;
            attempts++;
        }
        System.out.println("You lost, the number was " + number);
        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new StartGame()).execute(args);
        System.exit(exitCode);
    }
}