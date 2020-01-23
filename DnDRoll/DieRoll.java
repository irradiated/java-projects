import java.util.*;

public class DieRoll {
  public static void main(String[] args) {
    String choice, input, howMany;
    int dieType, howManyInt;
    Scanner scan = new Scanner(System.in);
    DnDice dice = new DnDice();

    while (true) {
      System.out.print("How many die would you like to roll? Enter a number, or type 'exit' to leave: ");
      howMany = scan.next();
      if (howMany.equalsIgnoreCase("exit")) {
        break;
      }
      System.out.print("Choose a die to roll [d4, d6, d8, d10, d12, d20]: ");
      input = scan.next();

      choice = input.replaceAll("[^0-9.]","");
      dieType = Integer.parseInt(choice);
      howManyInt = Integer.parseInt(howMany);

      ArrayList roll = dice.roll(howManyInt, dieType);
      System.out.println(dice.toString());
    }

  }
}
