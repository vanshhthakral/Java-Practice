class Developer extends Employee {
    double hourlyWage;
    int hoursWorked;

    Developer(String name, double hourlyWage, int hoursWorked) {
        super(name, "Developer");
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyWage * hoursWorked;
        System.out.println("Salary of Developer: " + salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role);
    }
}
