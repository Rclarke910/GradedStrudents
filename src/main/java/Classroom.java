import java.util.*;

public class Classroom {
    private ArrayList<Student> students;
    public List getStudents() {
        return students;
    }
    public Classroom(int maxNumberOfStudents, Student[] students){
        this.students = new ArrayList<>(30);
    }

    public double getAverageExamScore(){
        double total = 0;
        for (Student student : students){
           total += student.getAverageExamScore();
        }

        return total / students.size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName){
        students.remove(firstName);
        students.remove(lastName);
    }

    public ArrayList<Student> getStudentsByScore() {
        ArrayList<Student> sortedStudents = new ArrayList<>(students);

        sortedStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {

                int compareResult = Double.compare(student2.getAverageExamScore(), student1.getAverageExamScore());

                
                if (compareResult == 0) {
                    compareResult = student1.getLastName().compareTo(student2.getLastName());

                    if (compareResult == 0) {
                        compareResult = student1.getFirstName().compareTo(student2.getFirstName());
                    }
                }
                return compareResult;
            }
        });
        return sortedStudents;
    }

    public Map<Student, String> getGradeBook() {
        Map<Student, String> gradeBook = new HashMap<>();
        ArrayList<Student> sortedStudents = getStudentsByScore();
        int totalStudents = sortedStudents.size();

        for (int i = 0; i < totalStudents; i++) {
            Student student = sortedStudents.get(i);
            double percentile = (double) (i + 1) / totalStudents;

            if (percentile <= 0.10) {
                gradeBook.put(student, "A");
            } else if (percentile <= 0.29) {
                gradeBook.put(student, "B");
            } else if (percentile <= 0.50) {
                gradeBook.put(student, "C");
            } else if (percentile <= 0.89) {
                gradeBook.put(student, "D");
            } else {
                gradeBook.put(student, "F");
            }
        }

        return gradeBook;
    }



}
