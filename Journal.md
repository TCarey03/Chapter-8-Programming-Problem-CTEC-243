Phase 1: The Field Registry

I created a HashMap to store species names and their population counts. I added five different species and their population numbers. I also created a search feature that allows the user to enter a species name and see its population.

A HashMap is better than an array or ArrayList for this task because it stores information using keys and values. This makes it easier and faster to find a species by its name instead of searching through every item.

-----------------------

Phase 2: The Sighting Log

In this phase, I updated my program to read species sightings from a text file called sightings.txt. I used a Scanner to read the file one line at a time. If a species was already in the HashMap, I increased its population count by one. If it was a new species, I added it with an initial count of one.

The most challenging part was getting the file reader working correctly and making sure the file was in the correct project folder. This phase helped me understand how to read files and update values stored in a HashMap.
