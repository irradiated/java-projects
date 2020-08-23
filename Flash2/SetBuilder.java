//https://stackoverflow.com/questions/13707223/how-to-write-an-array-to-a-file-java
/*If you want to serialize the ArrayList object to a file so you can read it back in again later 
use ObjectOuputStream/ObjectInputStream writeObject()/readObject() since ArrayList implements 
Serializable. It's not clear to me from your question if you want to do this or just write each 
individual item*/

import java.io.*;
import java.util.*;

public class SetBuilder {
    Card card = new Card();
    ArrayList<Card> cards;

    public SetBuilder() {
        cards = new ArrayList<Card>();
    }

    public void addList(Card addition) {
        cards.add(addition);
        Collections.sort(cards);
    }

    public void removeList(Card removal) {
        cards.remove(removal);
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    
}