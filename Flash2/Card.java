import java.util.*;

public class Card implements Comparable {
  String question, answer, title;
  Scanner scan = new Scanner(System.in);

  public Card() {
    question = "";
    answer = "";
    title = "";
  }

  public Card(String q, String a, String t) {
    question = q;
    answer = a;
    title = t;
  }

  public String getQ() {
    return question;
  }

  public String getA() {
    return answer;
  }

  public String getT() {
    return title;
  }

  public void setQ(String q) {
    question = q;
  }

  public void setA(String a) {
    answer = a;
  }

  public void setT(String t) {
    title = t;
  }

  public String askQuestion() {
    System.out.print("Question: ");
    question = scan.nextLine();
    return question;
  }

  public String askAnswer() {
    System.out.print("Answer: ");
    answer = scan.nextLine();
    return answer;
  }

  public String askTitle() {
    System.out.print("Title: ");
    title = scan.nextLine();
    return title;
  }

  public int compareTo(Object obj) {
    return 0;

  }

  public String toString() {
    return "T: " + title + "\nQ: " + question + "\nA: " + answer;
  }
}
