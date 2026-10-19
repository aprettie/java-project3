public class PrimeNumbers {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 50;
<<<<<<< HEAD
        System.out.println("List of primes up to " + n + ":");
=======
        System.out.println("Prime up to " + n + ":");
>>>>>>> feature/primes-optimization
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}