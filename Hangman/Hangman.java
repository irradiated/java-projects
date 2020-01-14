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

    System.out.println("Welcome to hAnGmAn!");

    do {
      secret = hangman.getRandomWord(wordList);
      secretLen = secret.length();
      while (gameOver == false) {
        for (int i = 0; i < secretLen; i++) {
          System.out.print("_ ");
        }
      }

      System.out.print("\nPlay again? ");
      playAgain = scan.nextLine();
    } while (playAgain.equalsIgnoreCase("yes"));



  }
}
