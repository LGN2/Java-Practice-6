import java.util.HashSet;
import java.util.Set;

public class StudentSetManager {

    public static void main(String[] args) {

        Set<Integer> studentIds = new HashSet<>();

        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(104);
        studentIds.add(105);

        boolean added = studentIds.add(103);

        IO.println("========== STUDENT SET MANAGER ==========");

        IO.println("Student IDs: " + studentIds);

        if (!added) {
            IO.println("Student ID 103 already exists.");
        }

        IO.println("Total Students: " + studentIds.size());

        String registrationSize;

        if (studentIds.size() < 5) {
            registrationSize = "Small Registration";
        } else if (studentIds.size() <= 10) {
            registrationSize = "Medium Registration";
        } else {
            registrationSize = "Large Registration";
        }
        IO.println("Registration Size: " + registrationSize);
    }
}
