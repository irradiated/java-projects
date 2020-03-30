7import java.util.*;

public class Sets {

    String name = "";
    ArrayList<FlashCard> set;

    public Sets() {
        set = new ArrayList<FlashCard>();
    }

    public Sets(String name) {
        set = new ArrayList<FlashCard>();
        this.name = name;
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