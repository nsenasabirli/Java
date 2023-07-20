import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class TelephoneWordGenerator {
    private static final char[][] LETTERS = {
            {}, {},
            {'A', 'B', 'C'}, {'D', 'E', 'F'},
            {'G', 'H', 'I'}, {'J', 'K', 'L'},
            {'M', 'N', 'O'}, {'P', 'R', 'S'},
            {'T', 'U', 'V'}, {'W', 'X', 'Y'}
    };

    public static void generateWords(int[] phoneNumber) {
        try (Formatter formatter = new Formatter(new File("telephone_words.txt"))) {
            generateWords(phoneNumber, 0, new char[7], formatter);
        } catch (FileNotFoundException e) {
            System.out.println("Error creating the output file.");
            e.printStackTrace();
        }
    }

    private static void generateWords(int[] phoneNumber, int currentDigit, char[] currentWord, Formatter formatter) {
        if (currentDigit == 7) {
            formatter.format("%s%n", new String(currentWord));
            return;
        }

        int digit = phoneNumber[currentDigit];
        char[] letters = LETTERS[digit];

        for (char letter : letters) {
            currentWord[currentDigit] = letter;
            generateWords(phoneNumber, currentDigit + 1, currentWord, formatter);
        }
    }

    public static void main(String[] args) {
        int[] phoneNumber = {6, 8, 6, 2, 3, 7, 7};
        generateWords(phoneNumber);
        System.out.println("Words generated successfully.");
    }
}
