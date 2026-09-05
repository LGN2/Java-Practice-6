import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OnlineCourseEnrollmentSystem {

    public static void main(String[] args) {

        Set<String> students = new HashSet<>();

        Map<String, String> enrollments = new HashMap<>();

        enrollStudent(
                students,
                enrollments,
                "Ali",
                "Java"
        );

        enrollStudent(
                students,
                enrollments,
                "Sara",
                "Python"
        );

        enrollStudent(
                students,
                enrollments,
                "Ahmed",
                "Database"
        );

        enrollStudent(
                students,
                enrollments,
                "Maha",
                "Java"
        );

        IO.println(
                "\n========== COURSE ENROLLMENTS =========="
        );

        displayEnrollments(enrollments);

        enrollments.put("Ahmed", "Web Development");

        IO.println(
                "\nAfter updating Ahmed's course:"
        );
        displayEnrollments(enrollments);
    }
}
