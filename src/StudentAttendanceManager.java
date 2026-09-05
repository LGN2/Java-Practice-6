import java.util.HashMap;
import java.util.Map;

public class StudentAttendanceManager {

    public static void main(String[] args) {

        Map<String, Integer> attendance =
                new HashMap<>();
        attendance.put("Ali", 18);
        attendance.put("Sara", 20);
        attendance.put("Ahmed", 15);
        attendance.put("Maha", 19);
        attendance.put("Khalid", 14);
        IO.println(
                "========== STUDENT ATTENDANCE =========="
        );
        attendance.put(
                "Ahmed",
                attendance.get("Ahmed") + 1
        );
        String searchStudent = "Sara";
        if (attendance.containsKey(searchStudent)) {
            IO.println(
                    searchStudent
                            + " attended "
                            + attendance.get(searchStudent)
                            + " days."
            );
        }
        int totalAttendance = 0;
        int highestAttendance = 0;
        String bestStudent = "";
        for (Map.Entry<String, Integer> student
                : attendance.entrySet()) {
            IO.println(
                    student.getKey()
                            + " -> "
                            + student.getValue()
                            + " days"
            );
            totalAttendance += student.getValue();
            if (student.getValue() > highestAttendance) {
                highestAttendance =
                        student.getValue();
                bestStudent =
                        student.getKey();
            }
        }
        double averageAttendance =
                (double) totalAttendance
                        / attendance.size();
        IO.println(
                "\nAverage Attendance: "
                        + averageAttendance
                        + " days"
        );
        IO.println(
                "Highest Attendance: "
                        + bestStudent
                        + " -> "
                        + highestAttendance
                        + " days"
        );
    }
}
