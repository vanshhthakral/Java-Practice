class Manager extends Employee {
    double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Salary of Manager: " + fixedSalary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role);
    }
}

