import java.util.*;
import java.io.*;

public class Set {

    ArrayList<Card> cards;

    public Set() {
        cards = new ArrayList<Card>();
    }

    public Set(ArrayList<Card> cardList) {
        cards = cardList;
    }

    public void addCard(Card addition) {
        cards.add(addition);
        Collections.sort(cards);
    }

    public void removeCard(Card removal) {
        cards.remove(removal);
        Collections.sort(cards);
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public String toString() {
        return cards.toString();
    }
}