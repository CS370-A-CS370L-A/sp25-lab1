public class Pet {
    // Instance variables
    private String name;
    private String species;

    // Constructor
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for species
    public String getSpecies() {
        return species;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create Pet objects
        Pet pet1 = new Pet("Buddy", "Dog");
        Pet pet2 = new Pet("Quackers", "Duck");
        Pet petHG = new Pet("Waffle", "Cat");
        Pet pet4 = new Pet("Barking", "Human");
        Pet pet5 = new Pet("Joey", "Turtle");
        Pet pet3 = new Pet("Quackers", "Duck");

        // Add a new pet
        Pet pet6 = new Pet("Speedy", "Snail");

        // Print the names of the pets
        System.out.println("Pet's name is: " + pet1.getName());
        System.out.println("The second pet's name is: " + pet2.getName());
        System.out.println("The cat's name is: " + petHG.getName());
        System.out.println("The fourth pet's name is: " + pet4.getName());
        System.out.println("The snail's name is: " + pet6.getName());
    }
}

// What this code does: This code defines a Pet class that represents a pet with two properties:
	// 1.	name: A String representing the name of the pet.
	// 2.	species: A String representing the type of species the pet belongs to (e.g., dog, duck, etc.).