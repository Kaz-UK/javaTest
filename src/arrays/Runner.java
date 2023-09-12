package arrays;

public class Runner {
    public static void main(String[] args) {
        // Creation of animalName array
        String[] animalName = {"cat", "dog", "bird", "hamster"};

        // Loop through array to get the values at each position
        for (int i = 0; i < animalName.length; i++) {
            System.out.println("I: " + i + " Animal Name: " + animalName[i]);
        }

        // Enhanced loop
        for (String animal : animalName) {
            System.out.println("Animal Name: " + animal);
        }

        // Added rabbit to array position 1 (this creates a new array called animalName)
        animalName[1] = "rabbit";

        // Enhanced loop of new array
        for (String animal : animalName) {
            System.out.println("Animal Name: " + animal);
        }

    }
}
