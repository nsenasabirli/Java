import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNameList {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        List<Character> nameList = createNameList(firstName, lastName);
        System.out.println("Original List: " + nameList);

        List<Character> reverseList = reverseNameList(nameList);
        System.out.println("Reverse List: " + reverseList);
    }

    public static List<Character> createNameList(String firstName, String lastName) {
        List<Character> nameList = new ArrayList<>();

        // Add letters from first name
        for (char ch : firstName.toCharArray()) {
            nameList.add(ch);
        }

        // Add letters from last name
        for (char ch : lastName.toCharArray()) {
            nameList.add(ch);
        }

        return nameList;
    }

    public static List<Character> reverseNameList(List<Character> nameList) {
        List<Character> reverseList = new ArrayList<>(nameList);
        Collections.reverse(reverseList);
        return reverseList;
    }
}

