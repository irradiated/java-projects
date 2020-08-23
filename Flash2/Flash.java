import java.io.*;
import java.util.*;

public class Flash {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int choice;
    Card card = new Card();
    

    while (true) {
      System.out.println("Flash: CLI flashcard utility");
      System.out.println("Main Menu: \n\n" + "1. Practice\n2. View sets\n3. Create set\n");
      choice = scan.nextInt();
      if (choice == 1) {

      }
      else if (choice == 2) {
        
      }
      else if (choice == 3) {

      }
      else {

      }
      
      /*System.out.println("Create a flash card: ");
      card.askQ();
      card.askA();
      System.out.println(card.toString());*/
    }
  }
}
