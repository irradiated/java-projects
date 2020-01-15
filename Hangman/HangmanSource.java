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

    public void displayBoard(String[] theWord, String[] correctLetters, ArrayList missedLetters) {
      String[] blanks = new String[theWord.length];
      if (missedLetters.size() == 0) {
        System.out.println(PICS[0]);
      }
      else {
        int numMissed = missedLetters.size();
        System.out.println(PICS[numMissed]);
      }

      System.out.print("Missed letters: ");

      for (int i = 0; i < missedLetters.size(); i++) {  System.out.print(missedLetters.get(i));  }
      System.out.print(" ");
      for (int i = 0; i < theWord.length; i++) {  blanks[i] = "_";  }
      if (correctLetters[0] != null) {
        for (int i = 0; i < theWord.length; i++) {
          if (correctLetters[i].equalsIgnoreCase(theWord[i])) {  blanks[i] = correctLetters[i];  }
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

        for (int i = 0; i < alreadyGuessed.size(); i++) {
          if (alreadyGuessed.get(i) == guess) {
            System.out.println("You have already guessed that letter, try again!");
            break;
          }
          else {  break;  }
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

    public ArrayList prevGuesses(String lastGuess) {
      ArrayList <String> alreadyGuessed = new ArrayList <String>();
      alreadyGuessed.add(lastGuess);
      return alreadyGuessed;
    }
}
