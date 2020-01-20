import java.util.*;

public class DragonRealmDriver {
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    String playAgain = "yes";

    while (playAgain.equalsIgnoreCase("yes")) {
      System.out.println("You have arrived in a magical land filled with dragons. Some are friendly and happy to share their treasure" +
      " while some are evil, and would like nothing more than to eat you. \nBefore you are two caves, each with a dragon's lair.");

      DragonRealm game = new DragonRealm();
      int choice = game.chooseCave();
      game.checkCave(choice);

      System.out.print("Would you like to play again? (Yes or No): ");
      playAgain = scan.next();
    }
    System.out.println("\nThanks for playing Dragon Realm!");
  }
}
