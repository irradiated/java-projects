//A project I would like to see become a command line interface flashcard creator, for programming practice and studying

import java.io.*; 
import java.util.*;

public class Flash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice0;
        Sets set = new Set();

        while (true) {
            System.out.println("Flash: CLI flashcard builder");
            System.out.println("Make a choice (e.g. 1): ");
            System.out.print("1. View set\n2. Create set");
            choice0 = scan.nextInt();

            if (choice0 == 1) {
                sets.show
                System.out.print("1. View cards\n2. Add card");
                
            }

            else if (choice0 == 2) {

            }

            else {  break;  }
        }
        
        
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