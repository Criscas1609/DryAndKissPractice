import java.util.ArrayList;
import java.util.List;

class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculateAndShowMonthlySalaries() {
        for (Employee employee : employees) {
            System.out.println("Salario mensual de " + employee.getName() + ": " + employee.calculateMonthlySalary());
        }
    }

    public void showEmployeesInformation() {
        for (Employee employee : employees) {
            employee.showInformation();
        }
    }

}
