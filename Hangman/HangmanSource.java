import java.util.*;
import java.io.*;

public class HangmanSource {
    Random numgen = new Random();
    File file = new File("E:\\coding\\java\\java-projects\\Hangman\\wordlist.txt");
    Scanner fileScan = new Scanner(file);
    StringBuilder sb = new StringBuilder();

    //String secretWord;

    //int secret = numgen.nextInt(wordList.length);

    public HangmanSource() { }

    public void list() throws Exception {
        while (fileScan.hasNext()) {
            sb.append(fileScan.nextLine());
        }
        String[] wordList = sb.toString().split(" ");
    }

    public static void printList() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(wordList[i]);
        }
    }

    //public Hangman() {
    //    secretWord = wordList[secret];
    //}

}