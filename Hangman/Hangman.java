import java.util.*;
import java.io.*;

public class Hangman {
  public static void main(String[] args) throws Exception {

    File file = new File("E:\\coding\\java\\java-projects\\Hangman\\wordlist.txt");
    Scanner fileScan = new Scanner(file);
    Scanner scan = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    HangmanSource hangman = new HangmanSource();

    String secret, playAgain, guess;
    boolean gameOver;
    int count = 0;
    String[] pics = hangman.getPics();
    playAgain = "yes";
    gameOver = false;

    while (fileScan.hasNext()) {
        sb.append(fileScan.nextLine());
        sb.append("\n");
    }
    String[] wordList = sb.toString().split("\n");

    System.out.println("\n\tH_A_N_G_M_A_N \n");

    do {
      secret = hangman.getWord(wordList);
      guess = "";
      String[] wordArray = hangman.secretArray(secret);

      while (gameOver == false) {
        String[] correctGuesses = new String[secret.length()];
        ArrayList <String> alreadyGuessed = hangman.prevGuesses(guess);
        while ((wrongGuesses.size() <= pics.length) || (correctGuesses.length <= secret.length())) {
          hangman.displayBoard(wordArray, correctGuesses, wrongGuesses);
          guess = hangman.getGuess(alreadyGuessed);
        }

      }

      System.out.print("\nPlay again? Yes or No: ");
      playAgain = scan.nextLine();
    } while (playAgain.equalsIgnoreCase("yes"));



  }
}
