abstract class Employee {
    String name, role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

