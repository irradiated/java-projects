import java.util.*;

public class Coin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random numgen = new Random();

        int flip;
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("How many coin flips would you like to simulate? ");
        int input = scan.nextInt();

        for (int i = 0, n = input; i < n; i++) {
            flip = numgen.nextInt(2);

            if (flip == 0) {
                evenCount++;
            }

            else {
                oddCount++;
            }
        }
        System.out.println("Results: ");
        System.out.println("Heads: " + evenCount);
        System.out.println("Tails: " + oddCount);
    }
}