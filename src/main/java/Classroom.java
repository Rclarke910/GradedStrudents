import java.util.*;

public class Classroom  {
    private Student[] students;

    public Student[] getStudents() {

        return this.students;
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }


    public double getAverageExamScore() {
        double total = 0;
        for (Student student : students) {
            total += student.getAverageExamScore();
        }

        return total / students.length;
    }


    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            } else {
                System.out.println("Classroom is full, cannot add more students.");
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName() == firstName && students[i].getLastName() == lastName) {
                students[i] = null;
            }
        }
    }

    public Student[] getStudentsByScore() {

        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        studentList.removeIf(student -> student == null);
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getAverageExamScore(), s1.getAverageExamScore());
            }
        });


        return studentList.toArray(new Student[0]);
    }

    }




