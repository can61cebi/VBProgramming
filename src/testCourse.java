public class testCourse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database");

        course1.addStudent("Ayse");
        course1.addStudent("Enes");
        course1.addStudent("Mhd");

        course2.addStudent("Ayse");

        System.out.println("Number of students in course1: "+ course1.getNumberOfStudents());
        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i]+" ,");
        System.out.println();
        System.out.print("Number of Students in Course 2: " + course2.getNumberOfStudents());
    }

}