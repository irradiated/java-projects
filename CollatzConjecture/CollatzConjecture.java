import java.util.*;

/**
 * Dakota Flath
 * CollatzConjecture.java
 *
 * Demonstrates the Collatz Conjecture: Start with a number n > 1.
 * Find the number of steps it takes to reach one using the following process:
 * If n is even, divide it by 2. If n is odd, multiply it by 3 and add 1
 */

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingNum, num, count;

        System.out.print("Enter a starting number: ");
        num = scan.nextInt();
        count = 0;
        startingNum = num;

        while (num != 1 && num > 1) {
            if (num % 2 == 0) {
                System.out.println("Dividing by 2: " + num);
                count++;
                num /= 2;
            } else {
                System.out.println("Multiplying by 3 and adding 1: " + num);
                count++;
                num = (num * 3) + 1;
            }
        }
        System.out.println("1");
        System.out.printf("It took %d steps to reach 1 from %d through dividing by 2 if the number is even, and if it" +
                "'s odd, multiplying it by 3 and adding 1.", count, startingNum);

    }
}