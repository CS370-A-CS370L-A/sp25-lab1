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
        Pet pet301 = new Pet("Russell", "Cat");
        Pet pet8000 = new Pet("Johnathan", "Bear");
        Pet petHG = new Pet("Waffle", "Cat");
        Pet pet5= new Pet("Joey", "Turtle");
        Pet pet3 = new Pet("Quackers", "Duck");
        Pet pet4 = new Pet("Barking", "Human");
        Pet pet5= new Pet("hello user", "Robot");
        Pet pet10 = new Pet("ssssss", "Snake");



        // Print the name of the pet
        System.out.println("Pet's name is: " + pet1.getName());
        System.out.println("The second pet's name is: " + pet2.getName());

        System.out.print("Gabby's pet's name is: " + pet8000.getName());

        System.out.println("The cat's name is: " + petHG.getName());
        System.out.println("The fourth pet's name is: " + pet4.getName());
        System.out.println("The fith pet's name is: " +pet10.getName());
    }
}
