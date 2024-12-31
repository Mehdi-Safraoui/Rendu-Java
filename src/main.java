import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        StudentManagement studentManagement = new StudentManagement();
        Student s1 = studentManagement.createStudent(() -> new Student(1, "ahmed", 24));
        Student s2 = studentManagement.createStudent(() -> new Student(3, "mohamed", 22));
        Student s3 = studentManagement.createStudent(() -> new Student(7, "salah", 22));
        Student s4 = studentManagement.createStudent(() -> new Student(4, "ali", 23));
        Student s5 = studentManagement.createStudent(() -> new Student(8, "moustafa", 20));

        students.addAll(List.of(s1, s2, s3, s4, s5));
        studentManagement.displayStudents(students , System.out::println );
        System.out.println("==========================");

        studentManagement.displayStudentsByFilter(students, s -> s.getAge() > 22, System.out::println);
        System.out.println("==========================");

        System.out.println(studentManagement.returnStudentsNames(students, s -> s.getNom()));
        System.out.println("==========================");

        studentManagement.sortStudentsById(students , (m1,m2)-> m1.getId() - m2.getId());
        studentManagement.convertToStream(students).forEach(System.out::println);

    }
}
