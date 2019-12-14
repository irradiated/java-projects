//https://adriann.github.io/programming_problems.html Section: Elementary Questions: 4 and 5
//v2
import java.util.*;

public class Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sum, temp, iteration;

        System.out.print("Enter a number (n) to receive the sum of multiples of 3 and 5 from 1 to n: ");
        num = scan.nextInt();
        sum = 0;
        temp = 0;
        iteration = 0;

        for (int i = 0; i < num + 1; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }

        }

        System.out.println("The sum is: " + sum);
    }
}






/* v1
import java.util.*;


public class Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sum;

        System.out.print("Enter a number (n) to receive the sum of numbers from 1 to n: ");
        num = scan.nextInt();
        sum = 0;

        for (int i = 0; i < num + 1; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }
}

*/
