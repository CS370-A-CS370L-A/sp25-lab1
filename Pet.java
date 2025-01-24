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
        // Create a Pet object
        Pet pet1= new Pet("Buddy", "Dog");
        Pet pet2 = new Pet("Quackers", "Duck");
        Pet pet3 = new Pet("Meow", "Cat");
        Pet pet4 = new Pet("Barking", "Human");


        // Print the name of the pet
        System.out.println("Pet's name is: " + pet1.getName());
        System.out.println("The second pet's name is: " + pet2.getName());
        System.out.println("The third pet's name is: " + pet2.getName());
        System.out.println("The fourth pet's name is: " + pet4.getName());
    }
}
