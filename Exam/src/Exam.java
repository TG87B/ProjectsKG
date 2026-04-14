//Kyle Greer

// The Exam class extends the Assessment class to use the methods defined to calculate the score and grade
public class Exam extends Assessment {

// Two fields holds the number of questions and the points for questions
    private int numQuestions;
    private int pointsEach;

//Constructor that takes the number of questions and number of missed questions
    public Exam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.pointsEach = 100 / numQuestions;
        int score = 100 - (numMissed * pointsEach);
        setScore(score);
    }

// Getters for the points and number of questions
    public int getPointsEach() {
        return pointsEach;
    }

    public int getNumQuestions() {
        return numQuestions;
    }
}