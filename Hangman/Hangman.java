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
    int secretLen;
    boolean gameOver;

    while (fileScan.hasNext()) {
        sb.append(fileScan.nextLine());
        sb.append("\n");
    }
    String[] wordList = sb.toString().split("\n");

    System.out.println("H_A_N_G_M_A_N \nby Dakota Flath");

    do {
      secret = hangman.getWord(wordList);
      char[] rightLetters = hangman.correctLetters(secret);

      while (gameOver == false) {
        hangman.displayBoard(secret, rightLetters, );
      }

      System.out.print("\nPlay again? ");
      playAgain = scan.nextLine();
    } while (playAgain.equalsIgnoreCase("yes"));



  }
}
