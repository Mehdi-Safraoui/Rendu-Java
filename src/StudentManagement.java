import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management {
    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {

        for (Student student : students) {
            con.accept(student);
        }

    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {

        for (Student student : students) {
            if(pre.test(student)){
                con.accept(student);
            }
        }

    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {

        String result = "";
        for (Student student : students) {
            result += " " + fun.apply(student);

        }
        return result;

    }

    @Override
    public Student createStudent(Supplier<Student> sup) {

        if(sup != null){
            return sup.get();
        }
        return null;

    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {

        if(students != null && com != null){
            students.sort(com);
            return students;
        }
        return List.of();

    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {

        if(students != null){
            return students.stream();
        }
        return Stream.empty();

    }
}
