import java.util.Random;

public class SentenceGenerator {
    public static void main(String[] args) {
        // Lists of elements
        String[] articles = {"the ", "a ", "one ", "some ", "any "};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {" drove", " jumped", " ran", " walked", " skipped"};
        String[] prepositions = {" to ", " from ", " over ", " under ", " on "};

        // Create a Random object to generate random indices
        Random random = new Random();

        // Generate and print multiple sentences
        int numSentences = 5;
        for (int i = 0; i < numSentences; i++) {
            String sentence = generateSentence(articles, nouns, verbs, prepositions, random);
            System.out.println(sentence);
        }
    }

    public static String generateSentence(String[] articles, String[] nouns, String[] verbs,
                                          String[] prepositions, Random random) {
        String sentence = getRandomElement(articles, random) + getRandomElement(nouns, random);
        sentence += getRandomElement(verbs, random) + getRandomElement(prepositions, random);
        sentence += getRandomElement(articles, random) + getRandomElement(nouns, random) + ".";
        return sentence;
    }

    public static String getRandomElement(String[] array, Random random) {
        int index = random.nextInt(array.length);
        return array[index];
    }
}

