import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryManager {

    public static void main(String[] args) {
        Map<Integer, Double> salaries = new HashMap<>();
        salaries.put(1001, 650.0);
        salaries.put(1002, 800.0);
        salaries.put(1003, 750.0);
        salaries.put(1004, 900.0);
        salaries.put(1005, 700.0);
        IO.println(
                "========== EMPLOYEE SALARY MANAGER =========="
        );
        int searchId = 1003;
        if (salaries.containsKey(searchId)) {
            IO.println(
                    "Employee "
                            + searchId
                            + " Salary: "
                            + salaries.get(searchId)
                            + " OMR"
            );
        }
        salaries.put(1003, 820.0);
        IO.println(
                "Updated Salary: "
                        + salaries.get(1003)
                        + " OMR"
        );
        salaries.remove(1005);
        double totalSalary = 0;
        double highestSalary = 0;
        int highestEmployee = 0;
        for (Map.Entry<Integer, Double> employee
                : salaries.entrySet()) {

            IO.println(
                    "Employee ID: "
                            + employee.getKey()
                            + " | Salary: "
                            + employee.getValue()
                            + " OMR"
            );
            totalSalary += employee.getValue();
            if (employee.getValue() > highestSalary) {
                highestSalary = employee.getValue();
                highestEmployee =
                        employee.getKey();
            }
        }
        double averageSalary =
                totalSalary / salaries.size();
        IO.println(
                "\nAverage Salary: "
                        + averageSalary
                        + " OMR"
        );
        IO.println(
                "Highest Salary: Employee "
                        + highestEmployee
                        + " -> "
                        + highestSalary
                        + " OMR"
        );
    }
}
