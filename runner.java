import java.util.Scanner;

public class runner {

        // main
    public static void main(String[] args){

        //Creating and outputting pet information
        Pet myPet = new Pet(null, null, 0);
        myPet.setType("Type");
        myPet.setName("Pet Name");
        myPet.speak();
        myPet.setAge(0);

        System.out.println(myPet);

        Pet anotherPet = new Pet(null, null, 0);
        anotherPet.setType("cat");
        anotherPet.setName("Mittens");
        anotherPet.speak();
        anotherPet.setAge(5);
        
        System.out.println(anotherPet);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal type: ");
        String type = input.nextLine();

        System.out.println("Enter animal Name: ");
        String name = input.nextLine();


        System.out.println("Enter animal age: ");
        int age =  input.nextInt();

        
        Pet userpet = new Pet(type, name, age);
        System.out.println(userpet);

        input.close();
 
    }
}
