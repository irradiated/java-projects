import java.util.*;
import java.util.concurrent.TimeUnit;

public class DragonRealm {
  Random numgen = new Random();
  Scanner scan = new Scanner(System.in);
  int cave, friendlyCave;


  public DragonRealm() {
    friendlyCave = numgen.nextInt(2) + 1;
  }

  public int chooseCave() {
    cave = 0;
    while (cave != 1 && cave != 2) {
      System.out.print("Which cave will you go into? (1 or 2): ");
      cave = scan.nextInt();
    }
    return cave;
  }

  public void checkCave(int chosenCave) throws InterruptedException {
    System.out.println("You approach the cave...");
    TimeUnit.SECONDS.sleep(3);
    System.out.println("It is dark and spooky...");
    TimeUnit.SECONDS.sleep(2);
    System.out.print("A large dragon jumps out in front of you! He opens his jaws and...");
    TimeUnit.SECONDS.sleep(2);
    if (chosenCave == friendlyCave) {
      System.out.println(" shares his treasure with you!");
    } else {
      System.out.println(" he swallows you whole!");
    }
  }
}
