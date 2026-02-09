public class Pets{

    private String name;
    // constructor
    public Pets(){
        this.setName("");

    }
    // setter method for setting the name of the pet
    public void setName(String newName){
        this.name = newName;

    }
    // getter method
    public String getName(){
        return this.name;
    }
    // toString method
    public String toString(){

        String output = "Pet Information: " + this.name;
        return output;

    }

    // main
    public static void main(String[] args){

        //Creating and outputting pet information
        Pets myPet = new Pets();
        myPet.setName("Pet Name");
        System.out.println(myPet);

        Pets anotherPet = new Pets();
        anotherPet.setName("Mittens");
        System.out.println(anotherPet);
    }
}