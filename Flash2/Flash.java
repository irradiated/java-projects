import java.io.*;
import java.util.*;

public class Flash {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int choice; 

    while (true) {
      System.out.println("Flash: CLI flashcard utility");
      System.out.println("Main Menu: \n\n" + "1. Practice\n2. Manage sets/Create cards\n");
      choice = scan.nextInt();
      if (choice == 1) {
        break;
      }
      else if (choice == 2) {
        
      }
      else {

      }
    }
  }
}
