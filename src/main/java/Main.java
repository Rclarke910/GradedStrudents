import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
//        Student student = new Student(firstName, lastName, examScores);
//
//        student.setExamScore(1,300);
//
//        String output = student.getExamScoresString();
//
//        String result = student.fullString();
//
//
//        System.out.println(result);

// : Given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };
        Double[] examScores2 = { 200.0, 250.0, 350.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores1);
        Student student2 = new Student("Leon", "Hunter", examScores2);


        Student[] postEnrollment = classroom.getStudents();
        classroom.addStudent(student2);
        classroom.addStudent(student);

//      classroom.removeStudent("Leon", "Hunter");
        // Then

        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);



    }
}
