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
        ArrayList <String> correctGuesses = new ArrayList <String>();
        ArrayList <String> alreadyGuessed = new ArrayList <String>();
        ArrayList <String> wrongGuesses = new ArrayList <String>();

        while ((wrongGuesses.size() < pics.length) || (correctGuesses.size() <= secret.length())) {
          hangman.displayBoard(wordArray, correctGuesses, wrongGuesses);
          guess = hangman.getGuess(alreadyGuessed);
          alreadyGuessed.add(guess);

          for (int i = 0; i < wordArray.length; i++) {
            if (guess.equalsIgnoreCase(wordArray[i])) {
              correctGuesses.add(guess);
            }
          }
        }

      }

      System.out.print("\nPlay again? Yes or No: ");
      playAgain = scan.nextLine();
    } while (playAgain.equalsIgnoreCase("yes"));



  }
}
