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

                if (species.containsKey(name)) {
                    species.put(name, species.get(name) + 1);
                } else {
                    species.put(name, 1);
                }
            }

            fileScanner.close();

            // Display all species and counts
            System.out.println("Species Population Counts:");

            for (String name : species.keySet()) {
                System.out.println(name + ": " + species.get(name));
            }

            // Find the most and least frequent species
            if (species.isEmpty()) {
                System.out.println("No species were found in the file.");
            } else {

                String mostFrequentSpecies = "";
                String leastFrequentSpecies = "";

                int maxCount = Integer.MIN_VALUE;
                int minCount = Integer.MAX_VALUE;

                for (String name : species.keySet()) {
                    int count = species.get(name);

                    if (count > maxCount) {
                        maxCount = count;
                        mostFrequentSpecies = name;
                    }

                    if (count < minCount) {
                        minCount = count;
                        leastFrequentSpecies = name;
                    }
                }

                // Display the results
                System.out.println("\nPopulation Analysis:");

                System.out.println("Most Frequent Species: "
                        + mostFrequentSpecies + " (" + maxCount + ")");

                System.out.println("Least Frequent Species: "
                        + leastFrequentSpecies + " (" + minCount + ")");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: sightings.txt was not found.");
        }
    }
}
