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

    public char[] secretArray(String word) {
      char[] rightLetters = new char[word.length()];
      for (int i = 0; i < word.length(); i++) {
        rightLetters[i] = word.charAt(i);
      }
      return rightLetters;
    }

    public void displayBoard(char[] theWord, char[] correctLetters, char[] missedLetters) {
      char[] blanks = new char[theWord.length];
      System.out.println(PICS[missedLetters.length]);
      System.out.print("Missed letters: ");

      for (char m : missedLetters) {  System.out.print(m);  }
      for (int i = 0; i < theWord.length; i++) {  blanks[i] = '_';  }
      for (int i = 0; i < theWord.length; i++) {
        if (correctLetters[i].equalsIgnoreCase(theWord[i])) {  blanks[i] = correctLetters[i];  }
      }
      for (int i = 0; i < theWord.length; i++) {  System.out.println(blanks[i]); }
    }

    public String getGuess(char[] alreadyGuessed) {
      while (true) {
        System.out.print("Guess a letter: ");
        String guess = scan.nextLine();

        if (guess.length() != 1) {
          System.out.println("Only single letter guesses are accepted! Please guess again.");
        }

        else if (((char)guess <= 'a' || (char)guess >= 'z') || ((char)guess <= 'A' || (char)guess >= 'Z')) {
          System.out.println("That was not a letter. Try again!");
        }

        else {
          return guess.toLowerCase();
        }

        for (int i = 0; i < alreadyGuessed.length; i++) {
          if (alreadyGuessed[i] == guess) {
            System.out.println("You have already guessed that letter, try again!");
          }
        }
      }
    }
}
