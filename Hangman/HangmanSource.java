import java.util.*;
import java.io.*;

public class HangmanSource {
    Random numgen = new Random();
    String secretWord;
    Scanner scan = new Scanner(System.in);

    final String[] PICS ={"    +---+\n"
                  + "        |\n"
                  + "        |\n"
                  + "        |\n"
                  + "       ===\n",

                    "   +---+\n"
                  + "   O    |\n"
                  + "        |\n"
                  + "        |\n"
                  + "       ===\n",

                    "   +---+\n"
                  + "   O   |\n"
                  + "   |   |\n"
                  + "       |\n"
                  + "      ===\n",

                    "   +---+\n"
                  + "   O   |\n"
                  + "  /|   |\n"
                  + "       |\n"
                  + "      ===\n",

                    "   +---+\n"
                  + "   O   |\n"
                  + "  /|\\  |\n"
                  + "       |\n"
                  + "      ===\n",

                    "   +---+\n"
                  + "   O   |\n"
                  + "  /|\\  |\n"
                  + "  /    |\n"
                  + "      ===\n",

                    "   +---+\n"
                  + "   O   |\n"
                  + "  /|\\  |\n"
                  + "  / \\  |\n"
                  + "      ===\n",
                };

    public HangmanSource() {  }

    public String getWord(String[] theList) {
      String[] wordList = theList;
      int secret = numgen.nextInt(wordList.length);
      secretWord = wordList[secret];
      return secretWord;
    }

    public String[] getPics() { return PICS; }

    public String[] secretArray(String word) {
      String[] rightLetters = new String[word.length()];
      for (int i = 0; i < word.length(); i++) {
        rightLetters[i] = Character.toString(word.charAt(i));
      }
      return rightLetters;
    }

    public void displayBoard(String[] theWord, ArrayList correctLetters, ArrayList missedLetters) {
      String[] blanks = new String[theWord.length];
      if (missedLetters.size() == 0) {
        System.out.println(PICS[0]);
      }
      else {
        System.out.println(PICS[missedLetters.size()]);
      }

      System.out.print("Missed letters: ");

      for (int i = 0; i < missedLetters.size(); i++) {  System.out.print(missedLetters.get(i));  }
      System.out.print("\n");
      for (int i = 0; i < theWord.length; i++) {  blanks[i] = "_";  }
      for (int i = 0; i < correctLetters.size(); i++) {
        if (correctLetters.size() > 0) {
          String check = (String)(correctLetters.get(i));
          for (int x = 0; x < theWord.length; x++) {
            if (check.equalsIgnoreCase(theWord[x])) {  blanks[x] = (String)(correctLetters.get(i));  }
          }
        }
      }
      for (int i = 0; i < theWord.length; i++) {  System.out.print(blanks[i]); }
      System.out.println();
    }

    public String getGuess(ArrayList alreadyGuessed) {
      while (true) {
        System.out.print("Guess a letter: ");
        String guess = scan.nextLine();
        char guessChar = guess.charAt(0);

        System.out.println();

        for (int i = 0; i < alreadyGuessed.size(); i++) {
          if (((String)alreadyGuessed.get(i)).equalsIgnoreCase(guess)) {
            System.out.println("You have already guessed that letter, try again!\n");
          }
        }

        if (guess.length() != 1) {
          System.out.println("Only single letter guesses are accepted! Please guess again.");
        }

        else if ((guessChar >= 'a' && guessChar <= 'z') || (guessChar >= 'A' && guessChar <= 'Z')) {
          return guess;
        }

        else {
          System.out.println("That was not a letter. Try again!");
        }
      }
    }
}
