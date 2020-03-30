import java.util.*;

public class FlashCard {

    String question, answer, choice;
    Scanner scan = new Scanner(System.in);

    public FlashCard() {
        question = "";
        answer = "";
    }

    public FlashCard(String q, String a) {
        question = q;
        answer = a;
    }

    public String getQorA() {

        while (true) {

            System.out.println("");
            choice = scan.nextLine();

            if (choice.charAt(0) == 'q' || choice.charAt(0) == 'Q') {
                return question;
            } else if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A') {
                return answer;
            } 
        }

    }

    public String getQ() {
        return question;
    }

    public String getA() {
        return answer;
    }

    public void setQ(String q) {
        question = q;
    }

    public void setA(String a) {
        answer = a;
    }

    public String toString() {
        return "Q: " + question + "\n" + "A: " + answer + "\n";
    }

}