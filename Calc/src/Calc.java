//Kyle Greer

import java.util.Scanner;

public class Calc {

    //private data
    private double num1;
    private double num2;

    //setters
    public void setNum1(double n1){
        num1 = n1;
    }

    public void setNum2(double n2){
        num2 = n2;
    }

    //getters
    public double getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }

    //The math methods
    public double add(){
        return num1 + num2;
    }

    public double subtract(){
        return num1 - num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        return num1 / num2;
    }

    //toString method
    public String toString(){
        return "Displaying private fields using toString(): \n" + "num 1: " + num1 + "\nnum 2: " + num2 + "\nProcess finished with exit code 0";
    }

    // Helper method that determines if he input is a number or not, reasks the prompts for inputting numbers, and loops
    public static double getValidDouble(Scanner scan, String prompt) {
        System.out.print(prompt);
        while (!scan.hasNextDouble()) {
            System.out.println("invalid input. Please enter a number.");
            scan.nextLine();
            System.out.print(prompt);
        }
        //Stops the second input from skipping the second reenter prompt
        double val = scan.nextDouble();
        scan.nextLine();
        return val;
    }
}
