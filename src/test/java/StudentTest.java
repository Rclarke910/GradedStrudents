import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    Double[] examScores = { 300.0, 95.0, 123.0, 96.0 };
        Student student = new Student("Rashawn", "Clarke", examScores);



    @Test
    void getExamScoresStringTest() {

        String output = student.toString();

        String expect = "Exam Scores: \n" +
                "\tExam 1 -> 300.0\n" +
                "\tExam 2 -> 95.0\n" +
                "\tExam 3 -> 123.0\n" +
                "\tExam 4 -> 96.0\n";

        assertEquals(expect, output);
    }

    @Test
    void getAverageExamScoreTest() {

        double expect = 153.5;

        double output = student.getAverageExamScore();

        assertEquals(expect,output);
    }

    @Test

    void fullStringTest(){
        String expect = "Student Name: Rashawn Clarke\n" +
                "Average Score: 153.5\n" +
                "Exam Scores: \n" +
                "\tExam 1 -> 300.0\n" +
                "\tExam 2 -> 95.0\n" +
                "\tExam 3 -> 123.0\n" +
                "\tExam 4 -> 96.0\n";

        String output = student.fullString();

        assertEquals(expect,output);
    }

}