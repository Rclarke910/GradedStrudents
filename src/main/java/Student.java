import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {


    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getExamScoresString(){
        StringBuilder result = new StringBuilder("Exam Scores: \n");
        for(int i = 0; i < examScores.size(); i++){
            result.append("\tExam ").append(i + 1).append(" -> ").append(examScores.get(i)).append("\n");
        }
        return result.toString();
    }

    public List getExamScores(){

        return examScores;
    }

    public void setExamScores(ArrayList<Double> list){
        this.examScores = list;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set((examNumber - 1), newScore);
    }

    public Double getAverageExamScore(){
        double total = 0;
        for(double scores : examScores){
            total+=scores;
        }

        return total / examScores.size();
    }

    public String fullString(){
        String message = "Student Name: " + getFirstName() + " " + getLastName() + "\n"
                + "Average Score: " + getAverageExamScore() + "\n"
                + getExamScoresString();
        return message;
    }




}


