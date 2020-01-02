import java.util.*;
import java.io.*;

public class Hangman {
    public static void main(String[] args) throws Exception {
        Random numgen = new Random();
        File file = new File("E:\\coding\\java\\java-projects\\Hangman\\wordlist.txt");
        Scanner fileScan = new Scanner(file);
        StringBuilder sb = new StringBuilder();

        while (fileScan.hasNext()) {
            sb.append(fileScan.nextLine());
            sb.append("\n");
        }
        String[] wordList = sb.toString().split(" ");

        for (int i = 0; i < 100000; i++) {
            System.out.println(wordList[i]);
        }
    }
}