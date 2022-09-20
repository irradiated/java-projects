//https://stackoverflow.com/questions/13707223/how-to-write-an-array-to-a-file-java
/*If you want to serialize the ArrayList object to a file so you can read it back in again later 
use ObjectOuputStream/ObjectInputStream writeObject()/readObject() since ArrayList implements 
Serializable.*/

import java.io.*;
import java.util.*;

public class SetBuilder {
    
    ArrayList<Card> cards;
    FileOutputStream fileOutputStream;
    ObjectInputStream input;
    ObjectOutputStream output;

    public SetBuilder() {
        cards = new ArrayList<Card>();
    }

    public SetBuilder(ArrayList<Card> cards) {
        cards = this.cards;
    }

    public void loadSet(String setTitle) {
        String path = "./" + setTitle + ".txt";
        File setFile = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(setFile);
            input = new ObjectInputStream(fileInputStream);
            while (input.read() != -1) {
                cards.add((Card)input.readObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void saveSet(String setTitle) {
        String path = "./" + setTitle + ".txt";
        File setFile = new File(path);
        try {
            
            if (setFile.createNewFile()) {
                System.out.println("New set created: " + setFile.getName());
                fileOutputStream = new FileOutputStream(setFile);
                output = new ObjectOutputStream(fileOutputStream);
                output.writeObject(cards);
            } else {
                System.out.println("Set updated: " + setFile.getName());
                fileOutputStream = new FileOutputStream(setFile);
                output = new ObjectOutputStream(fileOutputStream);
                output.writeObject(cards);
            }
   
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public void delSet(String setTitle) {
        String path = "./" + setTitle + ".txt";
        File setFile = new File(path);
        try {
            if (setFile.delete()) {
                System.out.println(setFile.getName() + " deleted.");
            } else {
                System.out.println("Deletion failed. Does the set exist?");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}