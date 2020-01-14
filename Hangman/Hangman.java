import java.util.*;
import java.io.*;

public class Hangman {
  public static void main(String[] args) throws Exception {

    File file = new File("E:\\coding\\java\\java-projects\\Hangman\\wordlist.txt");
    Scanner fileScan = new Scanner(file);
    Scanner scan = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    HangmanSource hangman = new HangmanSource();

    String secret, playAgain;
    boolean gameOver;
    int count = 0;
    String[] pics = hangman.getPics();

    while (fileScan.hasNext()) {
        sb.append(fileScan.nextLine());
        sb.append("\n");
    }
    String[] wordList = sb.toString().split("\n");

    System.out.println("H_A_N_G_M_A_N \nby Dakota Flath");

    do {
      secret = hangman.getWord(wordList);
      char[] wordArray = hangman.secretArray(secret);

      while (gameOver == false) {
        char[] correctGuesses = new char[secret.length()];
        char[] wrongGuesses = new char[pics.length];
        alreadyGuessed = new char[count];
        hangman.displayBoard(wordArray, correctGuesses, wrongGuesses);
        guess = hangman.getGuess(alreadyGuessed);
      }

      System.out.print("\nPlay again? Yes or No: ");
      playAgain = scan.nextLine();
    } while (playAgain.equalsIgnoreCase("yes"));



  }
}
