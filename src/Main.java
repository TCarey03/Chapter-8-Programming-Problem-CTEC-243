import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> species = new HashMap<>();

        // Add species and their population counts
        species.put("Deer", 120);
        species.put("Fox", 45);
        species.put("Rabbit", 200);
        species.put("Eagle", 15);
        species.put("Bear", 30);

        Scanner scanner = new Scanner(System.in);

        // Ask the user for a species
        System.out.print("Enter a species name to search: ");
        String name = scanner.nextLine();

        // Check if the species exists
        if (species.containsKey(name)) {
            System.out.println(name + " population: " + species.get(name));
        } else {
            System.out.println(name + " is not currently in the registry.");
        }

        scanner.close();
    }
}
