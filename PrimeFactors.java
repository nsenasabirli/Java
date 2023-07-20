import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number (-1 to quit): ");
        int number = scanner.nextInt();

        while (number != -1) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                Set<Integer> primeFactors = getPrimeFactors(number);
                System.out.println("Prime factors of " + number + ": " + primeFactors);
            }

            System.out.print("Enter a whole number (-1 to quit): ");
            number = scanner.nextInt();
        }

        System.out.println("Program terminated.");
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static Set<Integer> getPrimeFactors(int number) {
        Set<Integer> primeFactors = new HashSet<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }
}

