import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNumberList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Add numbers 1 to 101 to the list
        for (int i = 1; i <= 101; i++) {
            numbers.add(i);
        }

        // Shuffle the list to randomize the order
        Collections.shuffle(numbers);

        // Take the first 25 elements
        List<Integer> randomList = numbers.subList(0, 25);

        // Sort the list in ascending order
        Collections.sort(randomList);

        // Print the sorted list
        System.out.println("Sorted list: " + randomList);

        // Calculate the sum
        int sum = 0;
        for (int number : randomList) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / randomList.size();

        // Print the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
