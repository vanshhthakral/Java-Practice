public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Manager("Rishita", 8000);  // Creating Manager object
        Employee developer = new Developer("Sunil", 50, 160);  // Creating Developer object

        // Displaying details and calculating salaries
        manager.displayDetails();
        manager.calculateSalary();

        developer.displayDetails();
        developer.calculateSalary();
    }
}
