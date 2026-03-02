//Kyle Greer
public class Animal {
     
    //instance variable to create the species
    private String species;

    //dedault constructor to make an empty species
    public Animal() {
        this.species = "";
    }
   //custom constructor to create species
    public Animal(String species) {
        this.species = species;
    }
    //getter and setter methods
    public void setSpecies(String species) {
        this.species = species;
}
    //getter method to retrieve the species
    public String getSpecies() {
        return this.species;
    }
    //toString method to display species
    public String toString() {
        return "Animal species: " + this.species;
    }
}