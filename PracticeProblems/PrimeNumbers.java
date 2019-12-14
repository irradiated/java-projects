import java.util.*;

public class PrimeNumbers {

    public static boolean isPrime(int n) {
        if ( n <= 1) {
            return false;
        } for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Please enter a max value to receive prime numbers up to: ");
        num = scan.nextInt();

        for (int i = 2; i <= num; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
}