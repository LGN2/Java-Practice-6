import java.util.HashSet;
import java.util.Set;

public class CourseEnrollmentSet {
    public static void main(String[] args) {

        Set<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Web Development");
        courses.add("Networking");

        IO.println("========== COURSE ENROLLMENT ==========");

        IO.println("Courses before removal:");
        IO.println(courses);

        String courseToRemove = "Networking";

        if (courses.remove(courseToRemove)) {
            IO.println("\n" + courseToRemove + " was removed.");
        } else {
            IO.println("\nCourse not found.");
        }

        IO.println("\nCourses after removal:");
        IO.println(courses);

        IO.println("Total Courses: " + courses.size());
    }
}
