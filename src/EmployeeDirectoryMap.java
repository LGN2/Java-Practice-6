import java.util.HashMap;
import java.util.Map;

public class EmployeeDirectoryMap {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(1001, "Ali");
        employees.put(1002, "Ahmed");
        employees.put(1003, "Sara");
        employees.put(1004, "Maha");
        employees.put(1005, "Khalid");

        IO.println("========== EMPLOYEE DIRECTORY ==========");

        for (Map.Entry<Integer, String> employee : employees.entrySet()) {

            IO.println(
                    "ID: " + employee.getKey()
                            + " | Name: " + employee.getValue()
            );
        }

        int searchId = 1003;

        if (employees.containsKey(searchId)) {

            IO.println(
                    "\nEmployee Found: "
                            + employees.get(searchId)
            );

        } else {

            IO.println("\nEmployee not found.");
        }

        employees.remove(1005);

        IO.println("\nTotal Employees: " + employees.size());
    }
}
