//Kyle Greer
public class Tests {

    //Storing the important values
    private double average;
    private int num;
    private double sum;

    //constructor
    public Tests() {
        average = 0.0;
        num = 0;
        sum = 0.0;


    }
    //Adds a score to the total and increases the number of tests
    public void addScore(double score) {
        sum += score;
        num++;
    }
    //prevents division by zero and calculates the average
    public void getAverage() {
        if (num > 0){
            average = sum / num;
        } else {
            average = 0;
        }
    }
    //toString method to display the average and number of tests entered
    public String toString() {
        if (num == 0) {
            return "No scores were entered.";
        }

    return "The average of the " + num + " Scores entered is " + String.format("%.2f", average);
    }
}
