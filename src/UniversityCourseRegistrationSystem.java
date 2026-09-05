import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniversityCourseRegistrationSystem {

    public static void main(String[] args) {

        Map<String, Set<String>> registrations = new HashMap<>();

        registerCourse(registrations, "Ali", "Java");
        registerCourse(registrations, "Ali", "Database");
        registerCourse(registrations, "Ali", "Python");

        registerCourse(registrations, "Sara", "Java");
        registerCourse(
                registrations,
                "Sara",
                "Web Development"
        );

        registerCourse(
                registrations,
                "Ahmed",
                "Database"
        );

        registerCourse(
                registrations,
                "Maha",
                "Networking"
        );

        registerCourse(
                registrations,
                "Ali",
                "Java"
        );

        IO.println(
                "\n========== UNIVERSITY REGISTRATIONS =========="
        );

        for (Map.Entry<String, Set<String>> student
                : registrations.entrySet()) {

            IO.println(
                    student.getKey()
                            + " -> "
                            + student.getValue()
            );
        }

        IO.println(
                "\nTotal Students: "
                        + registrations.size()
        );

        int totalEnrollments = 0;

        for (Set<String> courses
                : registrations.values()) {

            totalEnrollments += courses.size();
        }

        IO.println(
                "Total Course Registrations: "
                        + totalEnrollments
        );
    }
    public static void registerCourse(
            Map<String, Set<String>> registrations,
            String student,
            String course) {

        registrations.putIfAbsent(
                student,
                new HashSet<>()
        );

        Set<String> studentCourses =
                registrations.get(student);

        if (studentCourses.add(course)) {

            IO.println(
                    student
                            + " registered for "
                            + course
            );

        } else {

            IO.println(
                    student
                            + " is already registered for "
                            + course
            );
        }
    }
}

