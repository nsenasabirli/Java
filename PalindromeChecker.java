import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Check if the input is a palindrome
        if (isPalindrome(word)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        // Close the Scanner
        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        // Remove any spaces from the word and convert it to lowercase
        word = word.replaceAll("\\s", "").toLowerCase();

        // Check if the reversed word is the same as the original word
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equals(reversed.toString());
    }
}

