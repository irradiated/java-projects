import java.util.*;
import java.io.*;

public class HangmanSource {
    Random numgen = new Random();
    String secretWord;

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

    public HangmanSource() {

    }

    public String getRandomWord(String[] theList) {
      String[] wordList = theList;
      int secret = numgen.nextInt(wordList.length);
      secretWord = wordList[secret];
      return secretWord;
    }

    public void displayBoard(String theWord, char[] correctLetters, char[] missedLetters) {
      System.out.println(PICS[missedLetters.length]);
      System.out.print("Missed letters: ");
      for (char m : missedLetters) {
        System.out.print(m);
      }
    }

}
