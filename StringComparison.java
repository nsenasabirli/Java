import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Prompt the user to enter the number of characters to compare
        System.out.print("Enter the number of characters to compare: ");
        int length = scanner.nextInt();

        // Prompt the user to enter the starting index of the comparison
        System.out.print("Enter the starting index of the comparison: ");
        int startIndex = scanner.nextInt();

        // Perform the comparison using regionMatches
        boolean isEqual = str1.regionMatches(true, startIndex, str2, startIndex, length);

        // Print the result
        if (isEqual) {
            System.out.println("The compared characters are equal.");
        } else {
            System.out.println("The compared characters are not equal.");
        }

        // Close the Scanner
        scanner.close();
    }
}

