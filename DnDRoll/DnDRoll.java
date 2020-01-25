import java.util.*;

public class DnDRoll {
  public static void main(String[] args) {
    String input;
    Scanner scan = new Scanner(System.in);
    DnDice dice = new DnDice();

    System.out.println("Polyhedral Die Roller v1.0 \nWritten by Irradiated");
    System.out.println("Choose a die [d4, d6, d8, d10, d12, d20, d100], and how many times to roll it, in the format "
                    + "[3d12, 1d20, etc], or type [exit] to exit the program.\n");

    while (true) {
      System.out.print("Roll: ");
      input = scan.next();
      if (input.equalsIgnoreCase("exit")) {
        System.out.println("Exiting..");
        break;
      }
      int[] cleanedInput = dice.cleanInput(input);
      ArrayList roll = dice.roll(cleanedInput[0], cleanedInput[1]);
      System.out.println("Results of " + input + ": " + dice.toString());
    }
  }
}
