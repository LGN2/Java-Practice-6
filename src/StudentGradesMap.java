import java.util.HashMap;
import java.util.Map;

public class StudentGradesMap {

    public static void main(String[] args) {

        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Ali", 85.0);
        studentGrades.put("Sara", 92.5);
        studentGrades.put("Ahmed", 74.0);
        studentGrades.put("Maha", 88.5);
        studentGrades.put("Khalid", 67.0);

        IO.println("========== STUDENT GRADES ==========");

        studentGrades.put("Ahmed", 79.0);

        double total = 0;
        double highestGrade = 0;
        String highestStudent = "";

        for (Map.Entry<String, Double> student :
                studentGrades.entrySet()) {

            IO.println(
                    student.getKey()
                            + " -> "
                            + student.getValue()
            );

            total += student.getValue();

            if (student.getValue() > highestGrade) {

                highestGrade = student.getValue();
                highestStudent = student.getKey();
            }
        }

        double average = total / studentGrades.size();

        IO.println("\nAverage Grade: " + average);

        IO.println(
                "Highest Grade: "
                        + highestStudent
                        + " -> "
                        + highestGrade
        );
    }
}
