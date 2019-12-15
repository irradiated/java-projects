/*
Author: Dakota Flath
Date: 12/14/2019

Write a guessing game where the user has to guess a secret number. After every guess the program tells the user
whether their number was too large or too small. At the end the number of tries needed should be printed.
It counts only as one try if they input the same number multiple times consecutively.
 */

import java.util.*;

public class Guessing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        int guess, oldGuess, answer, max, count;

        System.out.printf("Welcome to the guessing game! Choose a maximum number to determine the difficulty: ");
        max = scan.nextInt();
        guess = 0;
        count = 0;
        answer = gen.nextInt(max + 1);

        System.out.printf("I'm thinking of a number between 1 and %d. Try to guess what it is: ", max);

        while (guess != answer) {
            oldGuess = guess;
            guess = scan.nextInt();
            count++;
            if (guess == answer) {
                System.out.printf("\nCongratulations, the answer was %d! I was thinking of a number between 1 and %d, and it took you %d tries!", answer, max, count);
            } else if (guess < answer && guess != oldGuess) {
                System.out.printf("Sorry, %d was too low! Guess again (between 1 and %d): ", guess, max);
            } else if (guess > answer && guess != oldGuess) {
                System.out.printf("Sorry, %d was too high! Guess again (between 1 and %d): ", guess, max);
            } else if (guess == oldGuess) {
                System.out.printf("%d was your last guess! Try a different number this time (between 1 and %d): ", guess, max);
                count--;
            }
        }
    }
}