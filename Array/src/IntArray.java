//Kyle Greer

import java.util.Arrays;
import java.util.Random;

//IntArray class that contains the array data and methods
public class IntArray {
    private int length;
    private int myArray[];

    private Random rand = new Random();

    // constructor that takes an int argument for the length of the array
    public IntArray(int length) {
        
        if(length == 0){
            this.length = 10;
        }
        else if (length == 10){
            this.length = 100;
        } else {
            this.length = length;}
        
        myArray = new int[this.length];
    }

    // methods for array data 
    public int size() {
        return length;
    }
    //Fills array with random numbers between 1 and 6
    public void fillRand() {
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6);
        }
    }
    //set a certain array element to a new value
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            myArray[index] = value;
        }
    }
    //display the value of the new value at position 5
    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArray[index];
        }
        return -1; // Return -1 for invalid index
    }
    //clears the array
    public void clear() {
        myArray = new int[0];
        length = 0;
    }
    //checks if the array is empty
    public boolean isEmpty() {
        return length == 0;
    }
    //Sorts the array
    public void sort() {
        Arrays.sort(myArray);
    }
    //toString to display array data
    public String toString(){
    String result = "IntArray instance data:\n";

    for (int i = 0; i < length; i++) {
        result += "Element " + i + ": " + myArray[i] + "\n";
    }

    return result;
}
    }

