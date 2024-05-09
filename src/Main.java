public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Cristhian", 19, 1300000, 0.05);
        Employee employee2 = new Employee("Camilo", 20, 4560000, 0);

        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);

        manager.calculateAndShowMonthlySalaries();
        manager.showEmployeesInformation();
    }
}