import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        student.setExamScore(1,300);

        String output = student.getExamScoresString();

        String result = student.fullString();


        System.out.println(result);



    }
}
