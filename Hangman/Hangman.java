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
    boolean gameOver, correct;
    int count = 0;
    String[] pics = hangman.getPics();
    playAgain = "yes";
    gameOver = false;

    while (fileScan.hasNext()) {
        sb.append(fileScan.nextLine());
        sb.append("\n");
    }
    String[] wordList = sb.toString().split("\n");

    System.out.println("\n ('-. .-.    ('-.          .-') _                _   .-')       ('-.          .-') _  \n" +
                       "( OO )  /   ( OO ).-.     ( OO ) )              ( '.( OO )_    ( OO ).-.     ( OO ) ) \n" +
                       ",--. ,--.   / . --. / ,--./ ,--,'    ,----.      ,--.   ,--.)  / . --. / ,--./ ,--,'  \n" +
                       "|  | |  |   | \\-.  \\  |   \\ |  |\\   '  .-./-')   |   `.'   |   | \\-.  \\  |   \\ |  |\\  \n" +
                       "|   .|  | .-'-'  |  | |    \\|  | )  |  |_( O- )  |         | .-'-'  |  | |    \\|  | ) \n" +
                       "|       |  \\| |_.'  | |  .     |/   |  | .--, \\  |  |'.'|  |  \\| |_.'  | |  .     |/  \n" +
                       "|  .-.  |   |  .-.  | |  |\\    |   (|  | '. (_/  |  |   |  |   |  .-.  | |  |\\    |   \n" +
                       "|  | |  |   |  | |  | |  | \\   |    |  '--'  |   |  |   |  |   |  | |  | |  | \\   |   \n" +
                       "`--' `--'   `--' `--' `--'  `--'     `------'    `--'   `--'   `--' `--' `--'  `--'   \n" +
                       "                                                       written by irradiated v1.0\n");

    do {

      secret = hangman.getWord(wordList);
      guess = "";
      String[] wordArray = hangman.secretArray(secret);

      ArrayList <String> correctGuesses = new ArrayList <String>();
      ArrayList <String> alreadyGuessed = new ArrayList <String>();
      ArrayList <String> wrongGuesses = new ArrayList <String>();

      while ((wrongGuesses.size() < (pics.length - 1)) && (correctGuesses.size() < (secret.length() - 1))) {

        hangman.displayBoard(wordArray, correctGuesses, wrongGuesses);
        correct = false;

        guess = hangman.getGuess(alreadyGuessed);

        for (int i = 0; i < wrongGuesses.size(); i++) {
          if (wrongGuesses.get(i).equalsIgnoreCase(guess)) {
            wrongGuesses.remove(wrongGuesses.get(i));
          }
        }

        alreadyGuessed.add(guess);

        for (int i = 0; i < wordArray.length; i++) {
          if (guess.equalsIgnoreCase(wordArray[i])) {
            correctGuesses.add(guess);
            correct = true;
          }
        }

        if (correct == false) {
          wrongGuesses.add(guess);
        }
      }

      if (correctGuesses.size() == secret.length()) {
        System.out.println("You won.");
        break;
      }

      else if (wrongGuesses.size() == pics.length) {
        System.out.println("You lost.");
        break;
      }

      System.out.print("\nPlay again? Yes or No: ");
      playAgain = scan.nextLine();

    } while (playAgain.equalsIgnoreCase("yes"));
  }
}
