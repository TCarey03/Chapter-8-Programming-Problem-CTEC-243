import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> species = new HashMap<>();

        // Read the sightings file
        try {
            File file = new File("sightings.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();

                // Update the count if species already exists
                if (species.containsKey(name)) {
                    species.put(name, species.get(name) + 1);
                } else {
                    // Add new species with a count of 1
                    species.put(name, 1);
                }
            }

            fileScanner.close();

            // Display all species and their counts
            System.out.println("Species Population Counts:");

            for (String name : species.keySet()) {
                System.out.println(name + ": " + species.get(name));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: sightings.txt was not found.");
        }
    }
}
