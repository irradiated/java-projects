import java.util.*;


public class Change {
    public static void main(String[] args) {

        double dollars;
        int cents;
        int coins;
        int[] coinArray = {25, 10, 5, 1};
        Scanner scan = new Scanner(System.in);

        System.out.print("How much change do I owe you? ");
        dollars = scan.nextDouble();

        cents = (int)(dollars * 100);
        coins = 0;


        for (int x:coinArray) {
            coins = 0;
            while (cents >= x) {
                cents -= x;
                coins++;
            }
            System.out.println(coins + " " + x + "-cent coins.");
        }

    } //main
} //class
