Phase 1: The Field Registry

I created a HashMap to store species names and their population counts. I added five different species and their population numbers. I also created a search feature that allows the user to enter a species name and see its population.

A HashMap is better than an array or ArrayList for this task because it stores information using keys and values. This makes it easier and faster to find a species by its name instead of searching through every item.

-----------------------

Phase 2: The Sighting Log

In this phase, I updated my program to read species sightings from a text file called sightings.txt. I used a Scanner to read the file one line at a time. If a species was already in the HashMap, I increased its population count by one. If it was a new species, I added it with an initial count of one.

The most challenging part was getting the file reader working correctly and making sure the file was in the correct project folder. This phase helped me understand how to read files and update values stored in a HashMap.

-----------------------

Phase 3: Population Analysis

In this phase, I added a feature that finds the species with the highest and lowest population counts. I used a loop to go through the HashMap and compare each species count to the current maximum and minimum values.

The program updates the most frequent species when it finds a higher count and updates the least frequent species when it finds a lower count.

Finding the highest and lowest populations takes O(n) time because the program must check every species. Looking up one species by name in a HashMap takes O(1) time on average, which is much faster.

-----------------------

Phase 4: Validation & Reflection

In this phase, I tested my program using three different situations. First, I tested an empty sightings.txt file to make sure the program did not crash when there were no species. Next, I tested a file where every species appeared once. Finally, I tested a file where one species appeared multiple times.

The tests helped me make sure the program correctly counted species and identified the highest and lowest populations. I also added a check to ignore empty lines in the file.

An improvement I made was checking whether the HashMap was empty before trying to find the most and least frequent species. This prevents errors when there is no data to analyze.

I learned how HashMaps can store information using keys and values, how to read data from a text file, and how to use loops to analyze population counts.
