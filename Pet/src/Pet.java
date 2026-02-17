//Kyle Greer

public class Pet{

    private String name;
    private String type;
    private int age;

    // constructor
    public Pet(String type, String name, int age){
        this.name = name;
        this.type = type;
        this.age = age;

    }
    // setter and getter methodz for setting and getting the name, type, and age  of the pet
    public void setName(String newName){
        this.name = newName;

    }

    public String getName(){
        return this.name;
    }

    public void setType(String newType){
        this.type = newType;
    }

    public String getType(){
        return this.type;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    //creating the speak function, ignoring case so that we have capitilization not matter
    public String speak(){
        if (type.equalsIgnoreCase("cat")){
            return "Meow";
        } else if (type.equalsIgnoreCase("dog")){
            return "Woof";
        } else if (type.equalsIgnoreCase("animal")){
            return "Yowl";
        } else {
            return "Unknown Sound";
        }

        }
    
    // toString method
    public String toString(){

        String output = "Pet Information: " + "\n" + "Type:" +  this.type + "\n" + "name:" + this.name + "\n" + "Sound: " + speak() + "\n" + "Age: " + this.age;
        return output;

    }



}
