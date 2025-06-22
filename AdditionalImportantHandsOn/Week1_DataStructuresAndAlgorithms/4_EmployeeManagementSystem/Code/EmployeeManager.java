public class EmployeeManager {
    private Employee[] employees;
    private int count;

    //Constructor to initialize the employee array size
    public EmployeeManager(int size) {
        employees = new Employee[size];
        //index to keep track of number of employees
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added.");
        } else {
            System.out.println("Array full. Cannot add more employees.");
        }
    }

    public void searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == empId) {
                System.out.println("Found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees in the system.");
            return;
        }
        System.out.println("All Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == empId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
