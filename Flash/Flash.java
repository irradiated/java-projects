//A project I would like to see become a command line interface flashcard creator, for programming practice and studying

import java.io.*; 
import java.util.*;

public class Flash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Flash: CLI flashcard builder");
        System.out.println("Make a choice (e.g. 1): ");
        System.out.print("1. View set\n2. Create set");
        
        System.out.print("1. View cards\n2. Add card");
    }

    private static void fileWriter(String data) {
        File file = new File("./cards.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}