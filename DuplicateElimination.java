import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        Set<String> names = readNames();
        searchName(names);
    }

    public static Set<String> readNames() {
        Set<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("Enter a first name (or 'q' to quit): ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("q")) {
                break;
            }
            names.add(name);
        }
        return names;
    }

    public static void searchName(Set<String> names) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine();
        if (names.contains(searchName)) {
            System.out.println(searchName + " is found in the set.");
        } else {
            System.out.println(searchName + " is not found in the set.");
        }
    }
}