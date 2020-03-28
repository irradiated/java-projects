//A project I would like to see become a command line interface flashcard creator, for programming practice and studying

import java.io.*;

public class Flash {
    public static void main(String[] args) {

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