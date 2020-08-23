import java.util.*;

public class Set {

    String name = "";
    ArrayList<FlashCard> set;

    public Set() {
        set = new ArrayList<FlashCard>();
    }

    public Set(String name) {
        set = new ArrayList<FlashCard>();
        this.name = name;
    }

    public Sets() {
        System.out.println("Which set would you like to view?");
    }

    public void addCard(FlashCard card) {
        set.add(card);
    }

    public void removeCard(int index) {
        set.remove(index);
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<FlashCard> getSet() {
        return set;
    }

    public FlashCard getCard(int index) {
        return set.get(index);
    }

    public void showCards() {
        for (int i = 0; i < set.size(); i++) {
            System.out.println((i + 1) + ". " + (set.get(i)).getQ() + "\n");
        }
    }

    public String toString() {
        return "Set Name: " + name + "\nNumber of cards: " + set.size() + "\n";
    }

}