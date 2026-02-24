import java.util.Scanner;

public class Runner {

    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in);
        Tests myTests = new Tests();

            System.out.println("Enter test scores (-1 to quit): ");
            double score = input.nextDouble();

            
            while (score != -1) {
                myTests.addScore(score);

                System.out.println("Enter test scores (-1 to quit): ");
                score = input.nextDouble();
            }

            myTests.getAverage();

            System.out.println(myTests);

            input.close();
    }

}
