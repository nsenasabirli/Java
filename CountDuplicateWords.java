import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        Map<String, Integer> wordCounts = countDuplicateWords(sentence);

        System.out.println("Duplicate word counts:");
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count > 1) {
                System.out.println(word + ": " + count);
            }
        }
    }

    public static Map<String, Integer> countDuplicateWords(String sentence) {
        // Remove punctuation and convert to lowercase
        sentence = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }
}

