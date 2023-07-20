import java.util.Scanner;

public class TelephoneNumberTokenizer {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a telephone number
        System.out.print("Enter a telephone number (in the form (555) 555-5555): ");
        String phoneNumber = scanner.nextLine();

        // Tokenize the telephone number
        String[] tokens = phoneNumber.split("[()\\s-]");

        // Extract the area code, first three digits, and last four digits
        String areaCode = tokens[1];
        String firstThreeDigits = tokens[2];
        String lastFourDigits = tokens[3];

        // Concatenate the seven digits of the phone number
        String phoneNumberDigits = areaCode + firstThreeDigits + lastFourDigits;

        // Print the area code and phone number
        System.out.println("Area code: " + areaCode);
        System.out.println("Phone number: " + phoneNumberDigits);

        // Close the Scanner
        scanner.close();
    }
}
