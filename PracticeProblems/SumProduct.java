/* Question:
   6. Write a program that asks the user for a number n and gives them the possibility to choose between
      computing the sum and computing the product of 1,…,n.
 */

import java.util.*;

public class SumProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, product, sum;
        String choice;
        sum = 0;
        product = 1;

        System.out.print("Choose to compute the sum of 1 to n or the product of 1 to n: ");
        choice = scan.nextLine();

        if (choice.equalsIgnoreCase("sum")) {
            System.out.print("Enter the number (n): ");
            num = scan.nextInt();
            for (int i = 0; i < num + 1; i++) {
                sum += i;
            }
            System.out.println("The sum is: " + sum);
        }

        else if (choice.equalsIgnoreCase("product")) {
            System.out.print("Enter the number (n): ");
            num = scan.nextInt();
            for (int i = 1; i < num + 1; i++) {
                product *= i;
            }
            System.out.println("The product is: " + product);
        }

        else {
            System.out.println("Invalid choice. Please choose either 'sum' or 'product'.");
        }
    }
}