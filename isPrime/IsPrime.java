// https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes#Pseudocode

class PrimeCheck {
    double n;
    double rt;
    int[] arr;

    public PrimeCheck() {
        n = 0;
        rt = 0;
    }

    public int[] sieve(int n) {
        arr = new int[n];
        for ()

        for (int i = 2; i <= Math.sqrt(n); i++) {

        }
    }

    public double isPrime(int n) {
        this.n = n;
        rt = Math.sqrt(n);
        if (n == 0) {
            return 1;
        } else {
            return isPrime();
        }

    }

}

public class IsPrime {
    public static void main(String[] args) {

        PrimeCheck prime = New PrimeCheck();
        System.out.println(prime.isPrime(1789));
    }
}