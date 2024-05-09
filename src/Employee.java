class Employee {
    private String name;
    private Integer age;
    private Double monthlyBaseSalary;

    private Double bonusPercentage;

    public String getName() {
        return name;
    }

    public Employee(String name, int age, double monthlyBaseSalary, double bonusPercentage) {
        this.name = name;
        this.age = age;
        this.monthlyBaseSalary = monthlyBaseSalary;
        this.bonusPercentage = bonusPercentage;
    }

    public double calculateMonthlySalary() {
        double tax = monthlyBaseSalary * 0.08; // Salud y pension
        double transportAllowance = 162000; // Auxilio de trasporte
        double bonusAmount = monthlyBaseSalary * bonusPercentage; // Bonus amount
        return monthlyBaseSalary - tax + transportAllowance + bonusAmount;
    }

    public void showInformation() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Salario Base " + monthlyBaseSalary);
        System.out.println("Salario Mensual: " + calculateMonthlySalary());
        System.out.println("----------------------");
    }
}
