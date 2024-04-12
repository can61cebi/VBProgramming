public class Course {

    private String courseName;
    private String[] Students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        Students[numberOfStudents] = student;
    }

    public String[] getStudents() {
        return Students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}